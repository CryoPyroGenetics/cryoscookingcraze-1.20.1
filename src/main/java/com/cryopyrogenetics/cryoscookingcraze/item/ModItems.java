package com.cryopyrogenetics.cryoscookingcraze.item;

import com.cryopyrogenetics.cryoscookingcraze.CryosCookingCraze;
import com.cryopyrogenetics.cryoscookingcraze.ItemWithTooltip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems{
    //registering items
    public static final Item SPAGHETTI = registerItem("spaghetti", new ItemWithTooltip(new FabricItemSettings().food(ModFoodComponents.SPAGHETTI), Text.translatable("tooltip.cryoscookingcraze.spaghetti.tooltip")));
    public static final Item SAUCE = registerItem("sauce", new ItemWithTooltip(new FabricItemSettings(), Text.translatable("tooltip.cryoscookingcraze.sauce.tooltip")));
    public static final Item PASTA = registerItem("pasta", new ItemWithTooltip(new FabricItemSettings(), Text.translatable("tooltip.cryoscookingcraze.pasta.tooltip")));

    //adding items to the ~~ingredient~~ Food and Drink base mc tab group
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPAGHETTI);
        entries.add(SAUCE);
        entries.add(PASTA);
    }

    //method for registering items, god i love boilerplate
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CryosCookingCraze.MOD_ID, name), item);
    }

    //for use onInitialize
    public static void registerModItems() {
        CryosCookingCraze.LOGGER.info("Registering Mod Items for " + CryosCookingCraze.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}