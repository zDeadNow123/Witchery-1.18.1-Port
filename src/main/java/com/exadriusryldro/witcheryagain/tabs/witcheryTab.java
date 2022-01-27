package com.exadriusryldro.witcheryagain.tabs;

import com.exadriusryldro.witcheryagain.items.ItemManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class witcheryTab {

    public static final CreativeModeTab WITCHERY_TAB = new CreativeModeTab("witchery") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemManager.WOLFTOKEN.get());
        }
    };

}
