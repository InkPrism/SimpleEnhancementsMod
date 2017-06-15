package net.dotsilver.simpleenhancements.init;

import net.dotsilver.simpleenhancements.Config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRegistry {
	public static void register(){
		if (Config.recipesADGTools) {
			//Granite Pickaxe
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_pickaxe), "AAA", " B ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 1), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_pickaxe), "AAA", " B ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 2), 'B', new ItemStack(Items.STICK));
		
			//Diorite Pickaxe
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_pickaxe), "AAA", " B ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 3), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_pickaxe), "AAA", " B ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 4), 'B', new ItemStack(Items.STICK));
		
			//Andesite Pickaxe
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_pickaxe), "AAA", " B ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 5), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_pickaxe), "AAA", " B ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 6), 'B', new ItemStack(Items.STICK));
		
			//Granite Sword
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_sword), "A", "A", "B", 'A', new ItemStack(Blocks.STONE, 1, 1), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_sword), "A", "A", "B", 'A', new ItemStack(Blocks.STONE, 1, 2), 'B', new ItemStack(Items.STICK));
		
			//Diorite Sword
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_sword), "A", "A", "B", 'A', new ItemStack(Blocks.STONE, 1, 3), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_sword), "A", "A", "B", 'A', new ItemStack(Blocks.STONE, 1, 4), 'B', new ItemStack(Items.STICK));
		
			//Andesite Sword
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_sword), "A", "A", "B", 'A', new ItemStack(Blocks.STONE, 1, 5), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_sword), "A", "A", "B", 'A', new ItemStack(Blocks.STONE, 1, 6), 'B', new ItemStack(Items.STICK));
		
			//Granite Shovel
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_shovel), "A", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 1), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_shovel), "A", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 2), 'B', new ItemStack(Items.STICK));
		
			//Diorite Shovel
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_shovel), "A", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 3), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_shovel), "A", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 4), 'B', new ItemStack(Items.STICK));
		
			//Andesite Shovel
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_shovel), "A", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 5), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_shovel), "A", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 6), 'B', new ItemStack(Items.STICK));
		
			//Granite Axe
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_axe), "AA ", "AB ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 1), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_axe), " AA", " BA", " B ", 'A', new ItemStack(Blocks.STONE, 1, 2), 'B', new ItemStack(Items.STICK));
		
			//Diorite Axe
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_axe), "AA ", "AB ", " B ", 'A', new ItemStack(Blocks.STONE, 1, 3), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_axe), " AA", " BA", " B ", 'A', new ItemStack(Blocks.STONE, 1, 4), 'B', new ItemStack(Items.STICK));
		
			//Andesite Axe
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_axe), "AA", "B ", "B", 'A', new ItemStack(Blocks.STONE, 1, 5), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_axe), "AA", "B", "B", 'A', new ItemStack(Blocks.STONE, 1, 6), 'B', new ItemStack(Items.STICK));
				
			//Granite Hoe
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_hoe), "AA", " B", " B", 'A', new ItemStack(Blocks.STONE, 1, 1), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.granite_hoe), "AA", " B", " B", 'A', new ItemStack(Blocks.STONE, 1, 2), 'B', new ItemStack(Items.STICK));
		
			//Diorite Hoe
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_hoe), "AA", " B", " B", 'A', new ItemStack(Blocks.STONE, 1, 3), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.diorite_hoe), "AA", " B", " B", 'A', new ItemStack(Blocks.STONE, 1, 4), 'B', new ItemStack(Items.STICK));
		
			//Andesite Hoe
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_hoe), "AA", " B", " B", 'A', new ItemStack(Blocks.STONE, 1, 5), 'B', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(ADGItems.andesite_hoe), "AA", " B", " B", 'A', new ItemStack(Blocks.STONE, 1, 6), 'B', new ItemStack(Items.STICK));
		}
		if(Config.recipeNameTag) {
			//NameTag
			GameRegistry.addRecipe(new ItemStack(Items.NAME_TAG), "  A", " B ", "C  ", 'A', new ItemStack(Items.SLIME_BALL), 'B', new ItemStack(Items.STRING), 'C', new ItemStack(Items.PAPER));
			GameRegistry.addRecipe(new ItemStack(Items.NAME_TAG), "A  ", " B ", "  C", 'A', new ItemStack(Items.SLIME_BALL), 'B', new ItemStack(Items.STRING), 'C', new ItemStack(Items.PAPER));
		}
		if(Config.recipeNormal2PolishedViceVersa) {	
			//Normal to Polished
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1, 1), "A", 'A', new ItemStack(Blocks.STONE, 1, 2));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1, 3), "A", 'A', new ItemStack(Blocks.STONE, 1, 4));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1, 5), "A", 'A', new ItemStack(Blocks.STONE, 1, 6));
			//Polished to Normal
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1, 2), "A", 'A', new ItemStack(Blocks.STONE, 1, 1));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1, 4), "A", 'A', new ItemStack(Blocks.STONE, 1, 3));
			GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 1, 6), "A", 'A', new ItemStack(Blocks.STONE, 1, 5));
		}
		if(Config.recipeBlazeRod) {
			//Blaze Powder to Blazerod
			GameRegistry.addRecipe(new ItemStack(Items.BLAZE_ROD), "A", "A", 'A', new ItemStack(Items.BLAZE_POWDER));
		}
		if(Config.recipeEndPortalFrame) {
			//EndportalFrame Recipe
			GameRegistry.addRecipe(new ItemStack(Blocks.END_PORTAL_FRAME), "A A", "BCB", 'A',new ItemStack(Items.ENDER_PEARL), 'B', new ItemStack(Blocks.OBSIDIAN), 'C', new ItemStack(Blocks.END_STONE));
		}
		if(Config.recipeRabbitHide) {
			//Rabbit Hide
			GameRegistry.addRecipe(new ItemStack(Items.RABBIT_HIDE, 4), "A", 'A', new ItemStack(Items.LEATHER));
		}
		if(Config.recipeSponge) {
			//Sponge Recipe
			GameRegistry.addRecipe(new ItemStack(Blocks.SPONGE), "AB", "BA", 'A', new ItemStack(Items.DYE, 1, 11), 'B', new ItemStack(Blocks.WOOL));
			GameRegistry.addRecipe(new ItemStack(Blocks.SPONGE), "BA", "AB", 'A', new ItemStack(Items.DYE, 1, 11), 'B', new ItemStack(Blocks.WOOL));
		}
		if(Config.recipeCobweb) {
			//CobWeb Recipe
			GameRegistry.addRecipe(new ItemStack(Blocks.WEB), "A A", " A ", "A A", 'A', new ItemStack(Items.STRING));
			GameRegistry.addRecipe(new ItemStack(Blocks.WEB), " A ", "A A", " A ", 'A', new ItemStack(Items.STRING));
		}
		if(Config.recipeDeadBush) {
			//DeadBush Recipes
			GameRegistry.addRecipe(new ItemStack(Blocks.DEADBUSH), "A A", "AAA", " A ", 'A', new ItemStack(Items.STICK));
			GameRegistry.addRecipe(new ItemStack(Items.STICK, 6), "A", 'A', new ItemStack(Blocks.DEADBUSH));
			GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING), "AB", 'A', new ItemStack(Blocks.SAPLING), 'B', new ItemStack(Items.DYE, 1, 0));
		}
		if(Config.recipeNetherWart) {
			//NetherWart Recipe
			GameRegistry.addRecipe(new ItemStack(Blocks.NETHER_WART), "AB", 'A', new ItemStack(Blocks.RED_MUSHROOM), 'B', new ItemStack(Items.FERMENTED_SPIDER_EYE));
		}
		if(Config.recipesMusicDiscs) {
			//Music Discs Recipes
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_WARD), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.GUNPOWDER));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_WAIT), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 12));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_STRAD), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 15));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_STAL), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 0));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_MELLOHI), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 9));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_MALL), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 5));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_FAR), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 10));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_CHIRP), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 1));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_CAT), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 2));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_BLOCKS), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 14));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_13), " A ", "ABA", " A ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.DYE, 1, 11));
		
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_11), "AB", 'A', new ItemStack(Items.RECORD_STAL), 'B', new ItemStack(Items.SHEARS));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_11), "BA", 'A', new ItemStack(Items.RECORD_STAL), 'B', new ItemStack(Items.SHEARS));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_11), "A", "B", 'A', new ItemStack(Items.RECORD_STAL), 'B', new ItemStack(Items.SHEARS));
			GameRegistry.addRecipe(new ItemStack(Items.RECORD_11), "B", "A", 'A', new ItemStack(Items.RECORD_STAL), 'B', new ItemStack(Items.SHEARS));
		}
	}
}
