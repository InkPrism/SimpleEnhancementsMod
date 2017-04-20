package net.dotsilver.simpleenhancements.stats;

import net.dotsilver.simpleenhancements.init.SimpleEnhancementsItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class AchievementHandler {
	public static Achievement finallyTheyveAPurpose;
	public static AchievementPage SimpleEnhancementsAchievementPage;
	
	public static void register() {
		finallyTheyveAPurpose = (new Achievement("achievement.finallyTheyveAPurpose", "finallyTheyveAPurpose", 0, 0, new ItemStack(Blocks.STONE, 1, 1),null).setSpecial()); // TODO or not TODO...
		SimpleEnhancementsAchievementPage = (new AchievementPage("Simple Enhancements Achievements", finallyTheyveAPurpose));
		AchievementPage.registerAchievementPage(SimpleEnhancementsAchievementPage);
	}
	
	@SubscribeEvent
	public void AGD(ItemCraftedEvent event){
		if(event.crafting.getItem() == SimpleEnhancementsItems.andesite_pickaxe){event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.granite_pickaxe) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.diorite_pickaxe) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if(event.crafting.getItem() == SimpleEnhancementsItems.andesite_sword){event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.granite_sword) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.diorite_sword) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if(event.crafting.getItem() == SimpleEnhancementsItems.andesite_shovel){event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.granite_shovel) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.diorite_shovel) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if(event.crafting.getItem() == SimpleEnhancementsItems.andesite_axe){event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.granite_axe) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.diorite_axe) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if(event.crafting.getItem() == SimpleEnhancementsItems.andesite_hoe){event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.granite_hoe) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
		else if (event.crafting.getItem() == SimpleEnhancementsItems.diorite_hoe) {event.player.addStat(AchievementHandler.finallyTheyveAPurpose, 1);}
	}
}
