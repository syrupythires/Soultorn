package net.syrupythires.soultorn;

import net.fabricmc.api.ModInitializer;

import net.syrupythires.soultorn.block.ModBlocks;
import net.syrupythires.soultorn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Soultorn implements ModInitializer {
	public static final String MOD_ID = "soultorn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}