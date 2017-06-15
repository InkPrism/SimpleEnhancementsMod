package net.dotsilver.simpleenhancements;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.dotsilver.simpleenhancements.event.SimpleEventHandler;
import net.dotsilver.simpleenhancements.init.ADGItems;
import net.dotsilver.simpleenhancements.init.CraftingRegistry;
import net.dotsilver.simpleenhancements.proxy.CommonProxy;
import net.dotsilver.simpleenhancements.stats.AchievementHandler;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION)
public class SimpleEnhancements {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final SimpleEnhancementsTab tabSimpleEnhancements = new SimpleEnhancementsTab("tabSimpleEnhancements");
	
	@Mod.Instance(Reference.MOD_ID)
	public static SimpleEnhancements instance;
	
	public static final Logger logger = LogManager.getLogger(Reference.NAME);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Config.loadConfig(event.getSuggestedConfigurationFile());
		if (Config.recipesADGTools) {
			ADGItems.init();
		}
//		AchievementHandler.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		CraftingRegistry.register();
//		MinecraftForge.EVENT_BUS.register(new AchievementHandler());
		if(Config.breakableEndPortalFrame) {
			MinecraftForge.EVENT_BUS.register(new SimpleEventHandler());
			Blocks.END_PORTAL_FRAME.setHardness(25);
		}
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
