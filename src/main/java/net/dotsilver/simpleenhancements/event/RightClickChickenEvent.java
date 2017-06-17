package net.dotsilver.simpleenhancements.event;

import net.dotsilver.simpleenhancements.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RightClickChickenEvent {
	@SubscribeEvent
	public void onChickenRightClick(EntityInteractSpecific event) {
		ItemStack mainhand_item = event.getEntityPlayer().getHeldItemMainhand();
		EntityPlayer player = event.getEntityPlayer();
		EnumHand hand = event.getEntityPlayer().getActiveHand().MAIN_HAND;
		World world = event.getWorld();
		
		if (event.getTarget().getName().equals("Chicken") && event.getHand() == EnumHand.MAIN_HAND) {
			if (!world.isRemote) {
				event.getTarget().attackEntityFrom(DamageSource.GENERIC, Config.pluckFeathersDamage);
				//Mooooh...
				if (mainhand_item.isEmpty()) {
					//player.setHeldItem(hand, new ItemStack(Items.FEATHER));
					player.inventory.addItemStackToInventory(new ItemStack(Items.FEATHER));
				} else if (!player.inventory.addItemStackToInventory(new ItemStack(Items.FEATHER))) {
					player.dropItem(new ItemStack(Items.FEATHER), false);
				}
			}
			if (world.isRemote) {
				world.playSound(event.getEntityPlayer(), event.getTarget().getPosition(),SoundEvents.ENTITY_CHICKEN_HURT, SoundCategory.NEUTRAL, 1.0f, 1.0f);
			}
		}
	}
}
