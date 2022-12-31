package net.mrnick01.functionalmachineries.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrnick01.functionalmachineries.FunctionalMachineries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FunctionalMachineries.MOD_ID);

    public static final RegistryObject<Item> CHROME_INGOT = ITEMS.register("chrome_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FM_TAB)));
    public static final RegistryObject<Item> RAW_CHROME_CHUNK = ITEMS.register("raw_chrome_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FM_TAB)));
    public static final RegistryObject<Item> CHROME_NUGGET = ITEMS.register("chrome_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FM_TAB)));
    public static final RegistryObject<Item> CHROME_PICKAXE = ITEMS.register("chrome_pickaxe",
            () -> new Item(new Item.Properties().defaultDurability(512)));
    public static final RegistryObject<Item> CHROME_SWORD = ITEMS.register("chrome_sword",
            () -> new Item(new Item.Properties().defaultDurability(512)));
    public static final RegistryObject<Item> CHROME_SHOVEL = ITEMS.register("chrome_shovel",
            () -> new Item(new Item.Properties().defaultDurability(512)));
    public static final RegistryObject<Item> CHROME_AXE = ITEMS.register("chrome_axe",
            () -> new Item(new Item.Properties().defaultDurability(512)));
    public static final RegistryObject<Item> CHROME_HOE = ITEMS.register("chrome_hoe",
            () -> new Item(new Item.Properties().defaultDurability(512)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
