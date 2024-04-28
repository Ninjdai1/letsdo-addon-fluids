import fs from "fs";

const grapejuices = {
    vinery: [
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "red_grapejuice_wine_bottle", fluid: "red_grapejuice"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "white_grapejuice_wine_bottle", fluid: "white_grapejuice"},

        { empty_bottle: "vinery:wine_bottle", filled_bottle: "jungle_red_grapejuice_bottle", fluid: "jungle_red_grapejuice"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "jungle_white_grapejuice_bottle", fluid: "jungle_white_grapejuice"},

        { empty_bottle: "vinery:wine_bottle", filled_bottle: "savanna_red_grapejuice_bottle", fluid: "savanna_red_grapejuice"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "savanna_white_grapejuice_bottle", fluid: "savanna_white_grapejuice"},

        { empty_bottle: "vinery:wine_bottle", filled_bottle: "taiga_red_grapejuice_bottle", fluid: "taiga_red_grapejuice"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "taiga_white_grapejuice_bottle", fluid: "taiga_white_grapejuice"},
    ],
    nethervinery: [
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "crimson_grapejuice", fluid: "crimson_grapejuice"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "warped_grapejuice", fluid: "warped_grapejuice"},
    ],
    brewery: [
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_wheat", fluid: "beer_wheat"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_barley", fluid: "beer_barley"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_hops", fluid: "beer_hops"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_haley", fluid: "beer_haley"},
        
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_jojannik", fluid: "whiskey_jojannik"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_lilitusinglemalt", fluid: "whiskey_lilitusinglemalt"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_cristelwalker", fluid: "whiskey_cristelwalker"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_maggoallan", fluid: "whiskey_maggoallan"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_carrasconlabel", fluid: "whiskey_carrasconlabel"},
    ]
}

//brewery:beer_quality 1-3

const MOD_ID = "doaddoncompat"
const LOADER_FLUID_QUANTITIES = {
    bottles: {
        forge: 250,
        fabric: 27000,
    }
}

const createEmptyingRecipe = ({fluidData, mod, loader}) => {
    const recipe = {
        type: "create:emptying",
        ingredients: [
            {
                item: `${mod}:${fluidData.filled_bottle}`
            }
        ],
        results: [
            {
                item: fluidData.empty_bottle,
            },
            {
                fluid: `${MOD_ID}:${fluidData.fluid}`,
                amount: LOADER_FLUID_QUANTITIES.bottles[loader]
            }
        ],
    }
    loader == "fabric" ? 
        recipe["fabric:load_conditions"] = [{
            condition: "fabric:all_mods_loaded", values: [`${mod}`, "create"]
        }]:
        recipe.conditions = [
            { type: "forge:mod_loaded", modid: `${mod}` },
            { type: "forge:mod_loaded", modid: "create" }
        ]
    return recipe;
}

const createFillingRecipe = ({fluidData, mod, loader}) => {
    const recipe = {
        type: "create:filling",
        ingredients: [
            {
                item: fluidData.empty_bottle,
            },
            {
                fluid: `${MOD_ID}:${fluidData.fluid}`,
                nbt: {},
                amount: LOADER_FLUID_QUANTITIES.bottles[loader]
            }
        ],
        results: [
            {
                item: `${mod}:${fluidData.filled_bottle}`
            }
        ],
        
    }
    loader == "fabric" ? 
        recipe["fabric:load_conditions"] = [{
            condition: "fabric:all_mods_loaded", values: [`${mod}`, "create"]
        }]:
        recipe.conditions = [
            { type: "forge:mod_loaded", modid: `${mod}` },
            { type: "forge:mod_loaded", modid: "create" }
        ]
    return recipe;
}

function writeRecipe({recipe, loader, targetMod, targetType, item}) {
    if(!recipe) return;
    const dir = `../${loader}/src/main/resources/data/${targetMod}/recipes/${targetType}`;
    
    if (!fs.existsSync(dir)) fs.mkdirSync(dir, { recursive: true });
    fs.writeFile(`${dir}/${item}.json`, JSON.stringify(recipe, undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

for(const loader of ["fabric", "forge"]){
    for(const mod of Object.keys(grapejuices)){
        const juices = grapejuices[mod];
        for(const juice in juices){
            writeRecipe({
                recipe: createFillingRecipe({
                    fluidData: grapejuices[mod][juice],
                    mod: mod,
                    loader: loader
                }),
                loader: loader,
                targetMod: "create",
                targetType: "filling",
                item: grapejuices[mod][juice].filled_bottle
            });
            writeRecipe({
                recipe: createEmptyingRecipe({
                    fluidData: grapejuices[mod][juice],
                    mod: mod,
                    loader: loader
                }),
                loader: loader,
                targetMod: "create",
                targetType: "emptying",
                item: grapejuices[mod][juice].filled_bottle
            });
        }
    }
}
