package com.MrBlueCat135.vanillaPlus;

import com.MrBlueCat135.vanillaPlus.registry.ModBlocks;
import com.MrBlueCat135.vanillaPlus.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "vplus";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "modded_item_group"))
            .icon(() -> new ItemStack(ModItems.RUBY))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                stacks.add(new ItemStack(ModItems.RUBY));
                stacks.add(new ItemStack(Items.NETHERITE_HOE));
            }).build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}