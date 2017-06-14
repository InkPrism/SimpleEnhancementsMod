package net.dotsilver.simpleenhancements.event;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SimpleEventHandler {
	@SubscribeEvent
	public void onDrops(BlockEvent.HarvestDropsEvent event) {
		ItemStack mainhand = event.getHarvester().getHeldItemMainhand();
		System.out.println(event.getHarvester().getActiveHand());
		// Is it the end portal frame?
		if (event.getState().getBlock() == Blocks.END_PORTAL_FRAME) {
			// Check, if the mainhand carries the right tool
			//if (mainhand != null && mainhand.getItem() == Items.DIAMOND_PICKAXE) {
			if (mainhand != null) {
				int endportalframe_state = Blocks.END_PORTAL_FRAME.getMetaFromState(event.getState());
				// state => over 5, 6, ... = with eye; 1, 2, 3, 4 = without eye
				if (endportalframe_state > 4) {
					event.getDrops().add(new ItemStack(Blocks.END_PORTAL_FRAME));
					event.getDrops().add(new ItemStack(Items.ENDER_EYE));
				} else if (endportalframe_state <= 4) {
					event.getDrops().add(new ItemStack(Blocks.END_PORTAL_FRAME));
				}
			}
		}
	}
}
