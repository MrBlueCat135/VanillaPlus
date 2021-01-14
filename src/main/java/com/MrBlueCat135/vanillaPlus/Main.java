package com.MrBlueCat135.vanillaPlus;

import com.MrBlueCat135.vanillaPlus.registry.ModBlocks;
import com.MrBlueCat135.vanillaPlus.registry.ModFeatures;
import com.MrBlueCat135.vanillaPlus.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "vplus";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "modded_item_group"))
            .icon(() -> new ItemStack(ModItems.RUBY)) //Icon of the creative item tab
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK)); //Adds Ruby Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.RUBY)); //Adds Ruby to the custom creative item tab
                stacks.add(new ItemStack(ModItems.RUBY_ORE)); //Adds Ruby Ore to the custom creative item tab
            }).build();

    @Override
    public void onInitialize() {
        ModItems.registerItems(); //Registers all items
        ModBlocks.registerBlocks(); //Registers all blocks
        ModFeatures.registerFeatures(); //Registers all worldGen features
    }
}