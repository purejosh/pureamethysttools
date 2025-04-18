package net.purejosh.pureamethysttools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.purejosh.pureamethysttools.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.PURE_AMETHYST);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.PURE_AMETHYST_SHOVEL);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.PURE_AMETHYST_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.PURE_AMETHYST_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.PURE_AMETHYST_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.PURE_AMETHYST_SWORD);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.PURE_AMETHYST_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.PURE_AMETHYST_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.PURE_AMETHYST_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.PURE_AMETHYST_BOOTS);

        getOrCreateTagBuilder(ConventionalItemTags.TOOLS)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.PURE_AMETHYST_SHOVEL)
                .add(ModItems.PURE_AMETHYST_PICKAXE)
                .add(ModItems.PURE_AMETHYST_AXE)
                .add(ModItems.PURE_AMETHYST_HOE);

        getOrCreateTagBuilder(ConventionalItemTags.MELEE_WEAPON_TOOLS)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.PURE_AMETHYST_SWORD)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.PURE_AMETHYST_AXE);

        getOrCreateTagBuilder(ConventionalItemTags.MINING_TOOL_TOOLS)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.PURE_AMETHYST_PICKAXE);

        getOrCreateTagBuilder(ConventionalItemTags.ARMORS)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.PURE_AMETHYST_HELMET)
                .add(ModItems.PURE_AMETHYST_CHESTPLATE)
                .add(ModItems.PURE_AMETHYST_LEGGINGS)
                .add(ModItems.PURE_AMETHYST_BOOTS);

        getOrCreateTagBuilder(ConventionalItemTags.DUSTS)
                .add(ModItems.AMETHYST_DUST)
                .add(ModItems.PURE_AMETHYST_DUST);

        getOrCreateTagBuilder(ConventionalItemTags.GEMS)
                .add(ModItems.PURE_AMETHYST);

        getOrCreateTagBuilder(ConventionalItemTags.AMETHYST_GEMS)
                .add(ModItems.PURE_AMETHYST);
    }
}
