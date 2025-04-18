package net.purejosh.pureamethysttools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.purejosh.pureamethysttools.block.ModBlocks;
import net.purejosh.pureamethysttools.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Building Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURE_AMETHYST_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Tools & Utilities
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_HOE, Models.HANDHELD);

        // Combat
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_BOOTS));

        // Food & Drinks
        itemModelGenerator.register(ModItems.AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_CARROT, Models.GENERATED);
        
        // Ingredients
        itemModelGenerator.register(ModItems.PURE_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_DUST, Models.GENERATED);
    }
}
