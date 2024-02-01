package com.cryopyrogenetics.cryoscookingcraze;

import com.cryopyrogenetics.cryoscookingcraze.item.ModItemGroups;
import com.cryopyrogenetics.cryoscookingcraze.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CryosCookingCraze implements ModInitializer {
	public static final String MOD_ID = "cryoscookingcraze";
    public static final Logger LOGGER = LoggerFactory.getLogger("cryoscookingcraze");

	@Override
	public void onInitialize(){
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}