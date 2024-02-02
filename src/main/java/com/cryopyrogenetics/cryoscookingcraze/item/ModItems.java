package com.cryopyrogenetics.cryoscookingcraze.item;

import com.cryopyrogenetics.cryoscookingcraze.CryosCookingCraze;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item SPAGHETTI = registerItem("spaghetti", new Item(new FabricItemSettings()));
    public static final Item SAUCE = registerItem("sauce", new Item(new FabricItemSettings()));
    public static final Item PASTA = registerItem("pasta", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPAGHETTI);
        entries.add(SAUCE);
        entries.add(PASTA);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CryosCookingCraze.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CryosCookingCraze.LOGGER.info("Registering Mod Items for " + CryosCookingCraze.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}