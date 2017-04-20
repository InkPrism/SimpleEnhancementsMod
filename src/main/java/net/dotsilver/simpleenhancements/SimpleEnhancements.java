package net.dotsilver.simpleenhancements;

import net.dotsilver.simpleenhancements.init.CraftingRegistry;
import net.dotsilver.simpleenhancements.init.SimpleEnhancementsItems;
import net.dotsilver.simpleenhancements.proxy.CommonProxy;
import net.dotsilver.simpleenhancements.stats.AchievementHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION)
public class SimpleEnhancements {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final SimpleEnhancementsTab tabSimpleEnhancements = new SimpleEnhancementsTab("tabSimpleEnhancements");
	
//	@Instance(Reference.MOD_ID)
//	public static SimpleEnhancements instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SimpleEnhancementsItems.init();
		SimpleEnhancementsItems.register();
//		AchievementHandler.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		CraftingRegistry.register();
		MinecraftForge.EVENT_BUS.register(AchievementHandler.class);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
