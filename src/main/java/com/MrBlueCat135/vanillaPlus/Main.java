package com.MrBlueCat135.vanillaPlus;

import com.MrBlueCat135.vanillaPlus.registry.ModItems;
import com.MrBlueCat135.vanillaPlus.registry.ModBlocks;
import com.MrBlueCat135.vanillaPlus.registry.ModFeatures;
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
                stacks.add(new ItemStack(ModItems.RUBY)); //Adds Ruby to the custom creative item tab
                stacks.add(new ItemStack(ModItems.NETHERITE_NUGGET)); //Adds Netherite Nugget to the custom creative item tab
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK)); //Adds Ruby Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.RUBY_ORE)); //Adds Ruby Ore to the custom creative item tab
                stacks.add(new ItemStack(ModItems.COMPRESSED_WOOD_BLOCK)); //Adds Compressed Wood Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.DOUBLE_COMPRESSED_WOOD_BLOCK)); //Adds Double Compressed Wood Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.COMPRESSED_COBBLESTONE_BLOCK)); //Adds Compressed Cobblestone Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.DOUBLE_COMPRESSED_COBBLESTONE_BLOCK)); //Adds Double Compressed Cobblestone Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.COMPRESSED_IRON_BLOCK)); //Adds Compressed Iron Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.DOUBLE_COMPRESSED_IRON_BLOCK)); //Adds Double Compressed Iron Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.COMPRESSED_GOLD_BLOCK)); //Adds Compressed Gold Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.DOUBLE_COMPRESSED_GOLD_BLOCK)); //Adds Double Compressed Gold Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.COMPRESSED_DIAMOND_BLOCK)); //Adds Compressed Diamond Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.DOUBLE_COMPRESSED_DIAMOND_BLOCK)); //Adds Double Compressed Diamond Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.COMPRESSED_NETHERITE_BLOCK)); //Adds Compressed Netherite Block to the custom creative item tab
                stacks.add(new ItemStack(ModItems.DOUBLE_COMPRESSED_NETHERITE_BLOCK)); //Adds Double Compressed Netherite Block to the custom creative item tab
            }).build();

    @Override
    public void onInitialize() {
        ModItems.registerItems(); //Registers all items
        ModBlocks.registerBlocks(); //Registers all blocks
        ModFeatures.registerFeatures(); //Registers all worldGen features
    }
}