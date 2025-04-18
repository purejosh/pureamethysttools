package net.purejosh.pureamethysttools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.purejosh.pureamethysttools.block.ModBlocks;
import net.purejosh.pureamethysttools.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Blocks
        // Building Blocks
        offerGemBlockRecipes(exporter, ModItems.PURE_AMETHYST, ModBlocks.PURE_AMETHYST_BLOCK);

        // Items
        // Tools & Utilities
        offerShovelRecipe(exporter, ModItems.AMETHYST_SHOVEL, Items.AMETHYST_SHARD);
        offerPickaxeRecipe(exporter, ModItems.AMETHYST_PICKAXE, Items.AMETHYST_SHARD);
        offerAxeRecipe(exporter, ModItems.AMETHYST_AXE, Items.AMETHYST_SHARD);
        offerHoeRecipe(exporter, ModItems.AMETHYST_HOE, Items.AMETHYST_SHARD);

        offerShovelRecipe(exporter, ModItems.PURE_AMETHYST_SHOVEL, ModItems.PURE_AMETHYST);
        offerPickaxeRecipe(exporter, ModItems.PURE_AMETHYST_PICKAXE, ModItems.PURE_AMETHYST);
        offerAxeRecipe(exporter, ModItems.PURE_AMETHYST_AXE, ModItems.PURE_AMETHYST);
        offerHoeRecipe(exporter, ModItems.PURE_AMETHYST_HOE, ModItems.PURE_AMETHYST);

        // Combat
        offerSwordRecipe(exporter, ModItems.AMETHYST_SWORD, Items.AMETHYST_SHARD);
        offerHelmetRecipe(exporter, ModItems.AMETHYST_HELMET, Items.AMETHYST_SHARD);
        offerChestplateRecipe(exporter, ModItems.AMETHYST_CHESTPLATE, Items.AMETHYST_SHARD);
        offerLeggingsRecipe(exporter, ModItems.AMETHYST_LEGGINGS, Items.AMETHYST_SHARD);
        offerBootsRecipe(exporter, ModItems.AMETHYST_BOOTS, Items.AMETHYST_SHARD);

        offerSwordRecipe(exporter, ModItems.PURE_AMETHYST_SWORD, ModItems.PURE_AMETHYST);
        offerHelmetRecipe(exporter, ModItems.PURE_AMETHYST_HELMET, ModItems.PURE_AMETHYST);
        offerChestplateRecipe(exporter, ModItems.PURE_AMETHYST_CHESTPLATE, ModItems.PURE_AMETHYST);
        offerLeggingsRecipe(exporter, ModItems.PURE_AMETHYST_LEGGINGS, ModItems.PURE_AMETHYST);
        offerBootsRecipe(exporter, ModItems.PURE_AMETHYST_BOOTS, ModItems.PURE_AMETHYST);

        // Food & Drinks
        offerAppleRecipe(exporter, ModItems.AMETHYST_APPLE, Items.AMETHYST_SHARD);
        offerAppleRecipe(exporter, ModItems.PURE_AMETHYST_APPLE, ModItems.PURE_AMETHYST);

        offerCarrotRecipe(exporter, ModItems.AMETHYST_CARROT, ModItems.AMETHYST_DUST);
        offerCarrotRecipe(exporter, ModItems.PURE_AMETHYST_CARROT, ModItems.PURE_AMETHYST_DUST);

        // Ingredients
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.AMETHYST_DUST, Items.AMETHYST_SHARD, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.PURE_AMETHYST_DUST, ModItems.PURE_AMETHYST, 4);
    }

    // Methods
    public static void offerGemBlockRecipes(RecipeExporter exporter, ItemConvertible gemItem, ItemConvertible gemBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, gemItem, 9).input(gemBlock).criterion(hasItem(gemBlock), conditionsFromItem(gemBlock)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, gemBlock).input('#', gemItem).pattern("###").pattern("###").pattern("###").criterion(hasItem(gemItem), conditionsFromItem(gemItem)).offerTo(exporter);
    }

    public static void offerShovelRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern(" # ").pattern(" S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerPickaxeRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern("###").pattern(" S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerAxeRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern("## ").pattern("#S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerHoeRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result).input('#', gem).input('S', Items.STICK).pattern("## ").pattern(" S ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerSwordRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).input('S', Items.STICK).pattern(" # ").pattern(" # ").pattern(" S ").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerHelmetRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("###").pattern("# #").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerChestplateRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("# #").pattern("###").pattern("###").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerLeggingsRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("###").pattern("# #").pattern("# #").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerBootsRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result).input('#', gem).pattern("# #").pattern("# #").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerAppleRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible gem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, result).input('#', gem).input('A', Items.APPLE).pattern("###").pattern("#A#").pattern("###").criterion(hasItem(gem), conditionsFromItem(gem)).offerTo(exporter);
    }

    public static void offerCarrotRecipe(RecipeExporter exporter, ItemConvertible result, ItemConvertible dust) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, result).input('#', dust).input('C', Items.CARROT).pattern("###").pattern("#C#").pattern("###").criterion(hasItem(dust), conditionsFromItem(dust)).offerTo(exporter);
    }
}