package net.mrnick01.functionalmachineries.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FM_TAB = new CreativeModeTab("fmtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHROME_INGOT.get());
        }
    };
}
