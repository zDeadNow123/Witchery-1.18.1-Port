package com.exadriusryldro.witcheryagain.items;

import com.exadriusryldro.witcheryagain.tabs.witcheryTab;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MoonCharm extends Item {

    public MoonCharm() {
        super(new Item.Properties().stacksTo(1).tab(witcheryTab.WITCHERY_TAB).rarity(Rarity.RARE).durability(50));
    }

    public boolean getIsRepairable(final ItemStack item, final ItemStack otherMaterial) {
        return otherMaterial.equals(new ItemStack(Items.GOLD_INGOT));
    }

    public Rarity getRarity(final ItemStack itemstack) {
        return Rarity.RARE;
    }

    @SubscribeEvent
    public static void RightClickEvent (PlayerInteractEvent.RightClickItem event) {
        Player player;




    }


}
