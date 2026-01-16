package net.syrupythires.soultorn.block;

import net.minecraft.block.Block;
import com.jcraft.jorbis.DspState;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.syrupythires.soultorn.Soultorn;


public class ModBlocks {
    public static final Block CLOVER_FLOWER_BLOCK = registerBlock("clover_flower_block",
            new Block(AbstractPlantBlock.Settings.create().strength(0f).sounds(BlockSoundGroup.GRASS)));

private  static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(Soultorn.MOD_ID, name), block);
}

private static void registerBlockItem(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(Soultorn.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
}


public static void registerModBlocks() {
    Soultorn.LOGGER.info("Registering Mod Blocks for " + Soultorn.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.add(ModBlocks.CLOVER_FLOWER_BLOCK) );
}
}

