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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
