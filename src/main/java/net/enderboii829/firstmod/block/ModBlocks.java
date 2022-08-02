package net.enderboii829.firstmod.block;

import net.enderboii829.firstmod.FirstMod;
import net.enderboii829.firstmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
public static final Block UFO_BLOCK = registerBlock("ufo_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.FABRIC_TAB);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
    registerBlockItem(name, block, tab);
    return Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
}

private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
    return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
}

    public static void registerModBlocks() {
        FirstMod.LOGGER.debug("Register ModBlocks for" + FirstMod.MOD_ID);
    }
}
