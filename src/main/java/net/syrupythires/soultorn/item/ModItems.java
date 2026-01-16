package net.syrupythires.soultorn.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.syrupythires.soultorn.Soultorn;

public class ModItems {
    public static final Item CLOVER_FLOWER = registerItem("clover_flower", new Item(new Item.Settings()));
    public static final Item SOUL_PIECE = registerItem("soul_piece", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
      return Registry.register(Registries.ITEM, Identifier.of(Soultorn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Soultorn.LOGGER.info("Registering Mod Items for " + Soultorn.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CLOVER_FLOWER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SOUL_PIECE);
        });
    }
}
