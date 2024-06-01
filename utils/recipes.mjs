import fs from "fs";

const brews = {
    vinery: [
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "red_grapejuice_wine_bottle", fluid: "red_grapejuice", press: "vinery:red_grape"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "white_grapejuice_wine_bottle", fluid: "white_grapejuice", press: "vinery:white_grape"},

        { empty_bottle: "vinery:wine_bottle", filled_bottle: "jungle_red_grapejuice_bottle", fluid: "jungle_red_grapejuice", press: "vinery:jungle_grapes_red"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "jungle_white_grapejuice_bottle", fluid: "jungle_white_grapejuice", press: "vinery:jungle_grapes_white"},

        { empty_bottle: "vinery:wine_bottle", filled_bottle: "savanna_red_grapejuice_bottle", fluid: "savanna_red_grapejuice", press: "vinery:savanna_grapes_red"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "savanna_white_grapejuice_bottle", fluid: "savanna_white_grapejuice", press: "vinery:savanna_grapes_white"},

        { empty_bottle: "vinery:wine_bottle", filled_bottle: "taiga_red_grapejuice_bottle", fluid: "taiga_red_grapejuice", press: "vinery:taiga_grapes_red"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "taiga_white_grapejuice_bottle", fluid: "taiga_white_grapejuice", press: "vinery:taiga_grapes_white"},
    ],
    nethervinery: [
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "crimson_grapejuice", fluid: "crimson_grapejuice", press: "nethervinery:crimson_grape"},
        { empty_bottle: "vinery:wine_bottle", filled_bottle: "warped_grapejuice", fluid: "warped_grapejuice", press: "nethervinery:warped_grape"},
    ],
    herbalbrews: [
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "green_tea", fluid: "green_tea", mixer: {
            ingredients: [{item: "herbalbrews:dried_green_tea"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "black_tea", fluid: "black_tea", mixer: {
            ingredients: [{item: "herbalbrews:dried_black_tea"}, {item: "minecraft:sugar"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "hibiscus_tea", fluid: "hibiscus_tea", mixer: {
            ingredients: [{item: "herbalbrews:hibiscus"}, {item: "minecraft:sugar"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "lavender_tea", fluid: "lavender_tea", mixer: {
            ingredients: [{item: "herbalbrews:lavender_blossom"}, {item: "minecraft:sugar"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "yerba_mate_tea", fluid: "yerba_mate_tea", mixer: {
            ingredients: [{item: "herbalbrews:yerba_mate_leaf"}, {item: "minecraft:sugar"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "rooibos_tea", fluid: "rooibos_tea", mixer: {
            ingredients: [{item: "herbalbrews:rooibos_leaf"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "oolong_tea", fluid: "oolong_tea", mixer: {
            ingredients: [{item: "herbalbrews:dried_oolong_tea"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "coffee", fluid: "coffee", mixer: {
            ingredients: [{item: "herbalbrews:coffee_beans"}, {fluid: "minecraft:water", nbt:{}, amount: "$loader.bottles"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "milk_coffee", fluid: "milk_coffee", mixer: {
            ingredients: [{fluid: "doaddonfluids:coffee", nbt:{}, amount: "$loader.bottles"}, {fluid: "minecraft:milk", nbt:{}, amount: "$loader.bottles"}]
        }},
    ],
    bakery: [
        { empty_bottle: "bakery:jar", filled_bottle: "strawberry_jam", fluid: "strawberry_jam", mixer: {
            ingredients: [{tag: "$loader$:strawberries"}, {item: "minecraft:sugar"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "bakery:jar", filled_bottle: "glowberry_jam", fluid: "glowberry_jam", mixer: {
            ingredients: [{item: "minecraft:glow_berries"}, {item: "minecraft:sugar"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "bakery:jar", filled_bottle: "sweetberry_jam", fluid: "sweetberry_jam", mixer: {
            ingredients: [{item: "minecraft:sweet_berries"}, {item: "minecraft:sugar"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "bakery:jar", filled_bottle: "apple_jam", fluid: "apple_jam", mixer: {
            ingredients: [{item: "minecraft:apple"}, {item: "minecraft:sugar"}],
            heatRequirement: "heated"
        }},
    ],
    meadow: [
        { empty_bottle: "meadow:wooden_bucket", filled_bottle: "wooden_buffalo_milk_bucket", amount: "$loader.buckets", fluid: "buffalo_milk"},
        { empty_bottle: "meadow:wooden_bucket", filled_bottle: "wooden_amethyst_milk_bucket", amount: "$loader.buckets", fluid: "amethyst_milk", mixer: {
            ingredients: [{item: "minecraft:amethyst_cluster"}, {item: "meadow:alpine_salt"}, {fluid: "minecraft:milk", nbt:{}, amount: "$loader.buckets"}],
            heatRequirement: "heated"
        }},
        { empty_bottle: "meadow:wooden_bucket", filled_bottle: "wooden_goat_milk_bucket", amount: "$loader.buckets", fluid: "goat_milk"},
        { empty_bottle: "meadow:wooden_bucket", filled_bottle: "wooden_grain_milk_bucket", amount: "$loader.buckets", fluid: "grain_milk"},
        { empty_bottle: "meadow:wooden_bucket", filled_bottle: "wooden_sheep_milk_bucket", amount: "$loader.buckets", fluid: "sheep_milk"},
        { empty_bottle: "meadow:wooden_bucket", filled_bottle: "wooden_warped_milk_bucket", amount: "$loader.buckets", fluid: "warped_milk"},
        { empty_bottle: "minecraft:glass_bottle", filled_bottle: "rennet", amount: "$loader.bottles", fluid: "rennet", mixer: {
            ingredients: [{item: "minecraft:egg"}, {item: "meadow:alpine_salt"}],
            heatRequirement: "heated"
        }},
    ],
    /*brewery: [
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_wheat", fluid: "beer_wheat"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_barley", fluid: "beer_barley"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_hops", fluid: "beer_hops"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "beer_haley", fluid: "beer_haley"},
        
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_jojannik", fluid: "whiskey_jojannik"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_lilitusinglemalt", fluid: "whiskey_lilitusinglemalt"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_cristelwalker", fluid: "whiskey_cristelwalker"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_maggoallan", fluid: "whiskey_maggoallan"},
        { empty_bottle: "brewery:beer_mug", filled_bottle: "whiskey_carrasconlabel", fluid: "whiskey_carrasconlabel"},
    ]*/
}

const filling_recipes = {
    bakery: [
        {
            type: "create:filling",
            ingredients: [
                {
                    tag: "bakery:bread"
                },
                {
                  amount: "$loader.bottles",
                  fluidTag: "doaddonfluids:jam"
                }
            ],
            results: [
                {
                    item: "bakery:jam_roll"
                }
            ]
        }
    ]
}

const compacting_recipes = {
    meadow: [
        {
            type: "create:compacting",
            ingredients: [
                {
                    amount: "$loader.bottles",
                    nbt: {},
                    fluid: "doaddonfluids:rennet"
                },
                {
                    amount: "$loader.bottles",
                    nbt: {},
                    fluid: `minecraft:milk`
                }
            ],
            results: [
                {
                    item: `meadow:cheese_block`
                }
            ]
        }
    ]
}
for(const cheese_type of ["buffalo", "amethyst", "goat", "grain", "sheep", "warped"]){
    compacting_recipes.meadow.push({
        type: "create:compacting",
        ingredients: [
            {
                amount: "$loader.bottles",
                nbt: {},
                fluid: "doaddonfluids:rennet"
            },
            {
                amount: "$loader.bottles",
                nbt: {},
                fluid: `doaddonfluids:${cheese_type}_milk`
            }
        ],
        results: [
            {
                item: `meadow:${cheese_type}_cheese_block`
            }
        ]
    })
}

const MOD_ID = "doaddonfluids"
const LOADER_FLUID_QUANTITIES = {
    bottles: {
        forge: 250,
        fabric: 27000,
    },
    buckets: {
        forge: 1000,
        fabric: 81000,
    }
}

const amountStringToInt = (loader, amountString) => {
    switch (amountString) {
        case "$loader.bottles":
            return LOADER_FLUID_QUANTITIES.bottles[loader];
        case "$loader.buckets":
            return LOADER_FLUID_QUANTITIES.buckets[loader];
        default:
            return LOADER_FLUID_QUANTITIES.bottles[loader];
    }
}

const createEmptyingRecipe = ({fluidData, mod, loader, customNBT={}}) => {
    const fluidAmount = amountStringToInt(loader, fluidData.amount);
    const recipe = {
        type: "create:emptying",
        ingredients: [
            {
                item: `${mod}:${fluidData.filled_bottle}`,
                itemTag: customNBT
            }
        ],
        results: [
            {
                item: fluidData.empty_bottle,
            },
            {
                fluid: `${MOD_ID}:${fluidData.fluid}`,
                nbt: customNBT,
                amount: fluidAmount,
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

const createFillingRecipe = ({fluidData, mod, loader, customNBT={}}) => {
    const fluidAmount = amountStringToInt(loader, fluidData.amount);
    const recipe = {
        type: "create:filling",
        ingredients: [
            {
                item: fluidData.empty_bottle,
            },
            {
                fluid: `${MOD_ID}:${fluidData.fluid}`,
                nbt: customNBT,
                amount: fluidAmount
            }
        ],
        results: [
            {
                item: `${mod}:${fluidData.filled_bottle}`,
                itemTag: customNBT
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

const createMixingRecipe = ({fluidData, mod, loader}) => {
    const recipe = {
        type: "create:mixing",
        heatRequirement: fluidData.mixer?.heatRequirement,
        ingredients: fluidData.press ? [
            {
                item: fluidData.press,
                count: 3
            },
        ] : fluidData.mixer.ingredients.map((item) => {
            const copy = structuredClone(item)
            if(item.tag && item.tag.includes("$loader$")) copy.tag = item.tag.replaceAll("$loader$", loader=="fabric" ? "c":"forge");
            if(typeof item.amount == "string") copy.amount = amountStringToInt(loader, item.amount);
            return copy;
        }),
        results: [
            {
                fluid: `${MOD_ID}:${fluidData.fluid}`,
                nbt: {},
                amount: amountStringToInt(loader, fluidData.amount),
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

function withCreateDependencies({recipe, loader, mod}){
    loader == "fabric" ? 
        recipe["fabric:load_conditions"] = [{
            condition: "fabric:all_mods_loaded", values: [`${mod}`, "create"]
        }]:
        recipe.conditions = [
            { type: "forge:mod_loaded", modid: `${mod}` },
            { type: "forge:mod_loaded", modid: "create" }
        ]
    return recipe
}

function withPerLoaderFilters({recipe, loader}){
    const recipeCopy = structuredClone(recipe)
    recipeCopy["ingredients"] = recipe.ingredients.map((ingredient) => {
        const copy = structuredClone(ingredient)
        if(ingredient.tag && ingredient.tag.includes("$loader$")) copy.tag = ingredient.tag.replaceAll("$loader$", loader=="fabric" ? "c":"forge");
        if(typeof ingredient.amount == "string") copy.amount = amountStringToInt(loader, ingredient.amount);
        return copy;
    })
    return recipeCopy;
}

function writeRecipe({recipe, loader, targetMod, targetType, item, customIndex}) {
    if(!recipe) return;
    const dir = `../${loader}/src/main/resources/data/${targetMod}/recipes/${targetType}`;
    
    if (!fs.existsSync(dir)) fs.mkdirSync(dir, { recursive: true });
    fs.writeFile(`${dir}/${item}${customIndex ? `_${customIndex}`:""}.json`, JSON.stringify(recipe, undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

function brewRecipes({brew, mod, loader, customNBT, customIndex}){
    writeRecipe({
        recipe: createFillingRecipe({
            fluidData: brew,
            mod: mod,
            loader: loader,
            customNBT: customNBT,
        }),
        loader: loader, targetMod: "create", targetType: "filling", item: brew.filled_bottle,
        customIndex: customIndex
    });
    writeRecipe({
        recipe: createEmptyingRecipe({
            fluidData: brew,
            mod: mod,
            loader: loader,
            customNBT: customNBT,
        }),
        loader: loader, targetMod: "create", targetType: "emptying", item: brew.filled_bottle,
        customIndex: customIndex
    });
    if(brew.mixer){
        writeRecipe({
            recipe: createMixingRecipe({
                fluidData: brew,
                mod: mod,
                loader: loader,
                customNBT: customNBT,
            }),
            loader: loader, targetMod: "create", targetType: "mixing", item: brew.fluid,
            customIndex: customIndex
        });
    }
    if(brew.press){
        writeRecipe({
            recipe: createMixingRecipe({
                fluidData: brew,
                mod: mod,
                loader: loader,
                customNBT: customNBT,
            }),
            loader: loader, targetMod: "create", targetType: "mixing", item: brew.fluid,
            customIndex: customIndex
        });
    }
}

const custom_nbt = {
    "brewery": { count: 3, nbt: "brewery.beer_quality"}
};

for(const loader of ["fabric", "forge"]){
    for(const mod of Object.keys(brews)){
        const mod_brews = brews[mod];
        for(const brew_id in mod_brews){
            const brew = brews[mod][brew_id];
            if(custom_nbt[mod]){
                const modNBT = custom_nbt[mod];
                for (let c = 1; c <= modNBT.count; c++) {
                    const nbt = {};
                    nbt[modNBT.nbt] = c;
                    brewRecipes({
                        brew: brew,
                        mod: mod,
                        loader: loader,
                        customNBT: nbt,
                        customIndex: c
                    })
                }
            } else {
                brewRecipes({
                    brew: brew,
                    mod: mod,
                    loader: loader,
                })
            }
        }
    }

    for(const mod of Object.keys(filling_recipes)){
        for(const recipe of filling_recipes[mod]){
            writeRecipe({
                recipe: withCreateDependencies({recipe: withPerLoaderFilters({recipe: recipe, loader: loader}), loader: loader, mod: mod}),
                loader: loader,
                targetMod: "create",
                targetType: "filling",
                item: recipe.results[0].item.split(":")[1]
            })
        }
    }
    for(const mod of Object.keys(compacting_recipes)){
        for(const recipe of compacting_recipes[mod]){
            writeRecipe({
                recipe: withCreateDependencies({recipe: withPerLoaderFilters({recipe: recipe, loader: loader}), loader: loader, mod: mod}),
                loader: loader,
                targetMod: "create",
                targetType: "compacting",
                item: recipe.results[0].item.split(":")[1]
            })
        }
    }
}
