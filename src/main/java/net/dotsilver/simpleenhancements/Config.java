package net.dotsilver.simpleenhancements;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Config {
	public static Configuration cfg;
	
	public static final String CAT_GENERAL = "general";
	
	public static boolean recipesADGTools;
	public static boolean recipeNameTag;
	public static boolean recipeNormal2PolishedViceVersa;
	public static boolean recipeBlazeRod;
	public static boolean recipeEndPortalFrame;
	public static boolean recipeRabbitHide;
	public static boolean recipeSponge;
	public static boolean recipeCobweb;
	public static boolean recipeDeadBush;
	public static boolean recipeNetherWart;
	public static boolean recipesMusicDiscs;
	public static boolean breakableEndPortalFrame;
	public static boolean pluckFeathers;
	public static float pluckFeathersDamage;
	
	public static void loadConfig(File file) {
		if (cfg == null) {
			cfg = new Configuration(file);
		}
		
		cfg.load();
		loadVals();
	}
	
	public static void loadVals() {
		cfg.getCategory(CAT_GENERAL).setComment("General");
		
		recipesADGTools = cfg.get(CAT_GENERAL, "recipesADGTools", true, "Add recipes for Andesite, Granite and Diorite.").setRequiresMcRestart(true).getBoolean();
		recipeNameTag = cfg.get(CAT_GENERAL, "recipeNameTag", true, "Add recipe for Name Tags.").setRequiresMcRestart(true).getBoolean();
		recipeNormal2PolishedViceVersa = cfg.get(CAT_GENERAL, "recipeNormal2PolishedViceVersa", true, "Add recipe to turn Polished ADGs into Normal ones and vice versa.").setRequiresMcRestart(true).getBoolean();
		recipeBlazeRod = cfg.get(CAT_GENERAL, "recipeBlazeRod", true, "Add recipe for Blaze Rods.").setRequiresMcRestart(true).getBoolean();
		recipeEndPortalFrame = cfg.get(CAT_GENERAL, "recipeEndPortalFrame", true, "Add recipe for End Portal Frames.").setRequiresMcRestart(true).getBoolean();
		recipeRabbitHide = cfg.get(CAT_GENERAL, "recipeRabbitHide", true, "Add recipe for Rabbit Hides.").setRequiresMcRestart(true).getBoolean();
		recipeSponge = cfg.get(CAT_GENERAL, "recipeSponge", true, "Add recipe for Sponges.").setRequiresMcRestart(true).getBoolean();
		recipeCobweb = cfg.get(CAT_GENERAL, "recipeCobweb", true, "Add recipe for Cobwebs.").setRequiresMcRestart(true).getBoolean();
		recipeDeadBush = cfg.get(CAT_GENERAL, "recipeDeadBush", true, "Add recipe for Dead Bushes.").setRequiresMcRestart(true).getBoolean();
		recipeNetherWart = cfg.get(CAT_GENERAL, "recipeNetherWart", true, "Add recipe for Nether Warts.").setRequiresMcRestart(true).getBoolean();
		recipesMusicDiscs = cfg.get(CAT_GENERAL, "recipesMusicDiscs", true, "Add recipes for Music Discs.").setRequiresMcRestart(true).getBoolean();
		breakableEndPortalFrame = cfg.get(CAT_GENERAL, "breakableEndPortalFrame", true, "Make End Portal Frames breakable.").setRequiresMcRestart(true).getBoolean();
		pluckFeathers = cfg.get(CAT_GENERAL, "pluckFeathers", true, "Rightclicking on chicken gives you feathers. Pluck it!").setRequiresMcRestart(true).getBoolean();
		pluckFeathersDamage = (float)cfg.get(CAT_GENERAL, "pluckFeathersDamage", 2.0, "Damage dealt to the chicken when rightclicked.", 0.0, 5.0).getDouble();
		
		if (cfg.hasChanged())
			cfg.save();
	}
	
	public static class ChangeHandler {
		@SubscribeEvent
		public void onCfgChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(Reference.MOD_ID)) {
				loadVals();
			}
		}
	}
}
