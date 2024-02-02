package com.cryopyrogenetics.cryoscookingcraze.item;

import com.cryopyrogenetics.cryoscookingcraze.CryosCookingCraze;
import com.cryopyrogenetics.cryoscookingcraze.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CCC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CryosCookingCraze.MOD_ID, "ccc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ccc"))
                    .icon(() -> new ItemStack(ModItems.SPAGHETTI)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SPAGHETTI);
                        entries.add(ModItems.SAUCE);
                        entries.add(ModItems.PASTA);

                        entries.add(ModBlocks.RAW_URANIUM_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        CryosCookingCraze.LOGGER.info("Registering Item Groups for " + CryosCookingCraze.MOD_ID);
    }
}
