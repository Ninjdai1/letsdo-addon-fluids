package dev.ninjdai.doaddonfluids.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import dev.ninjdai.doaddonfluids.DoAddonFluids;
import dev.ninjdai.doaddonfluids.registry.items.DrinkablePlaceableFluidBucketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.satisfyu.meadow.registry.ObjectRegistry;

public class DoAddonItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, DoAddonFluids.MOD_ID);
    //public static final ResourcefulRegistry<Item> MEADOW_BUCKETS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, "meadow");

    /*public static ResourcefulRegistry<Item> registerMeadowBuckets() {

        final RegistryEntry<Item> WOODEN_WARPED_MILK_BUCKET = MEADOW_BUCKETS.register("wooden_warped_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.WARPED_MILK, meadowBucketProperties(), true));
        final RegistryEntry<Item> WOODEN_SHEEP_MILK_BUCKET = MEADOW_BUCKETS.register("wooden_sheep_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.SHEEP_MILK, meadowBucketProperties(), true));
        final RegistryEntry<Item> WOODEN_GRAIN_MILK_BUCKET = MEADOW_BUCKETS.register("wooden_grain_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.GRAIN_MILK, meadowBucketProperties(), true));
        final RegistryEntry<Item> WOODEN_GOAT_MILK_BUCKET = MEADOW_BUCKETS.register("wooden_goat_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.GOAT_MILK, meadowBucketProperties(), true));
        final RegistryEntry<Item> WOODEN_AMETHYST_MILK_BUCKET = MEADOW_BUCKETS.register("wooden_amethyst_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.AMETHYST_MILK, meadowBucketProperties(), true));
        final RegistryEntry<Item> WOODEN_BUFFALO_MILK_BUCKET = MEADOW_BUCKETS.register("wooden_buffalo_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.BUFFALO_MILK, meadowBucketProperties(), true));

        final RegistryEntry<Item> WARPED_MILK_BUCKET = ITEMS.register("warped_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.WARPED_MILK, bucketProperties(), false));
        final RegistryEntry<Item> SHEEP_MILK_BUCKET = ITEMS.register("sheep_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.SHEEP_MILK, bucketProperties(), false));
        final RegistryEntry<Item> GRAIN_MILK_BUCKET = ITEMS.register("grain_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.GRAIN_MILK, bucketProperties(), false));
        final RegistryEntry<Item> GOAT_MILK_BUCKET = ITEMS.register("goat_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.GOAT_MILK, bucketProperties(), false));
        final RegistryEntry<Item> AMETHYST_MILK_BUCKET = ITEMS.register("amethyst_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.AMETHYST_MILK, bucketProperties(), false));
        final RegistryEntry<Item> BUFFALO_MILK_BUCKET = ITEMS.register("buffalo_milk_bucket", () -> new DrinkablePlaceableFluidBucketItem(DoAddonFluidProperties.BUFFALO_MILK, bucketProperties(), false));
        return MEADOW_BUCKETS;
    }*/

    public static Item.Properties meadowBucketProperties() {
        return new Item.Properties().craftRemainder(ObjectRegistry.WOODEN_BUCKET.get()).stacksTo(1);
    }
    public static Item.Properties bucketProperties() {
        return new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1);
    }
}