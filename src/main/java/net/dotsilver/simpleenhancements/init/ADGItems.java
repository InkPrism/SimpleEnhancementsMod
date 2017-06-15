package net.dotsilver.simpleenhancements.init;

import net.dotsilver.simpleenhancements.Config;
import net.dotsilver.simpleenhancements.Reference;
import net.dotsilver.simpleenhancements.SimpleEnhancements;
import net.dotsilver.simpleenhancements.items.ItemAndesiteAxe;
import net.dotsilver.simpleenhancements.items.ItemAndesiteHoe;
import net.dotsilver.simpleenhancements.items.ItemAndesitePickaxe;
import net.dotsilver.simpleenhancements.items.ItemAndesiteShovel;
import net.dotsilver.simpleenhancements.items.ItemAndesiteSword;
import net.dotsilver.simpleenhancements.items.ItemDioriteAxe;
import net.dotsilver.simpleenhancements.items.ItemDioriteHoe;
import net.dotsilver.simpleenhancements.items.ItemDioritePickaxe;
import net.dotsilver.simpleenhancements.items.ItemDioriteShovel;
import net.dotsilver.simpleenhancements.items.ItemDioriteSword;
import net.dotsilver.simpleenhancements.items.ItemGraniteAxe;
import net.dotsilver.simpleenhancements.items.ItemGraniteHoe;
import net.dotsilver.simpleenhancements.items.ItemGranitePickaxe;
import net.dotsilver.simpleenhancements.items.ItemGraniteShovel;
import net.dotsilver.simpleenhancements.items.ItemGraniteSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ADGItems {
	
	public static Item granite_pickaxe;
	public static Item diorite_pickaxe;
	public static Item andesite_pickaxe;
	public static Item granite_sword;
	public static Item diorite_sword;
	public static Item andesite_sword;
	public static Item granite_shovel;
	public static Item diorite_shovel;
	public static Item andesite_shovel;
	public static Item granite_axe;
	public static Item diorite_axe;
	public static Item andesite_axe;
	public static Item granite_hoe;
	public static Item diorite_hoe;
	public static Item andesite_hoe;
	
	public static void init() {
			granite_pickaxe = new ItemGranitePickaxe(ToolMaterial.STONE).setUnlocalizedName("granite_pickaxe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			diorite_pickaxe = new ItemDioritePickaxe(ToolMaterial.STONE).setUnlocalizedName("diorite_pickaxe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			andesite_pickaxe = new ItemAndesitePickaxe(ToolMaterial.STONE).setUnlocalizedName("andesite_pickaxe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
		
			andesite_sword = new ItemAndesiteSword(ToolMaterial.STONE).setUnlocalizedName("andesite_sword").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			diorite_sword = new ItemDioriteSword(ToolMaterial.STONE).setUnlocalizedName("diorite_sword").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			granite_sword = new ItemGraniteSword(ToolMaterial.STONE).setUnlocalizedName("granite_sword").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
		
			andesite_shovel = new ItemAndesiteShovel(ToolMaterial.STONE).setUnlocalizedName("andesite_shovel").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			diorite_shovel = new ItemDioriteShovel(ToolMaterial.STONE).setUnlocalizedName("diorite_shovel").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			granite_shovel = new ItemGraniteShovel(ToolMaterial.STONE).setUnlocalizedName("granite_shovel").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
		
			andesite_axe = new ItemAndesiteAxe(ToolMaterial.STONE).setUnlocalizedName("andesite_axe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			diorite_axe = new ItemDioriteAxe(ToolMaterial.STONE).setUnlocalizedName("diorite_axe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			granite_axe = new ItemGraniteAxe(ToolMaterial.STONE).setUnlocalizedName("granite_axe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
		
			andesite_hoe = new ItemAndesiteHoe(ToolMaterial.STONE).setUnlocalizedName("andesite_hoe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			diorite_hoe = new ItemDioriteHoe(ToolMaterial.STONE).setUnlocalizedName("diorite_hoe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
			granite_hoe = new ItemGraniteHoe(ToolMaterial.STONE).setUnlocalizedName("granite_hoe").setCreativeTab(SimpleEnhancements.tabSimpleEnhancements);
		
			register();
	}
	
	public static void register()
	{
		GameRegistry.register(granite_pickaxe.setRegistryName("granite_pickaxe"));
		GameRegistry.register(diorite_pickaxe.setRegistryName("diorite_pickaxe"));
		GameRegistry.register(andesite_pickaxe.setRegistryName("andesite_pickaxe"));
		
		GameRegistry.register(granite_sword.setRegistryName("granite_sword"));
		GameRegistry.register(diorite_sword.setRegistryName("diorite_sword"));
		GameRegistry.register(andesite_sword.setRegistryName("andesite_sword"));
		
		GameRegistry.register(granite_shovel.setRegistryName("granite_shovel"));
		GameRegistry.register(diorite_shovel.setRegistryName("diorite_shovel"));
		GameRegistry.register(andesite_shovel.setRegistryName("andesite_shovel"));
		
		GameRegistry.register(granite_axe.setRegistryName("granite_axe"));
		GameRegistry.register(diorite_axe.setRegistryName("diorite_axe"));
		GameRegistry.register(andesite_axe.setRegistryName("andesite_axe"));
		
		GameRegistry.register(granite_hoe.setRegistryName("granite_hoe"));
		GameRegistry.register(diorite_hoe.setRegistryName("diorite_hoe"));
		GameRegistry.register(andesite_hoe.setRegistryName("andesite_hoe"));
	}
	
	public static void registerRenders()
	{
		registerRender(granite_pickaxe);
		registerRender(diorite_pickaxe);
		registerRender(andesite_pickaxe);
		
		registerRender(granite_sword);
		registerRender(diorite_sword);
		registerRender(andesite_sword);
		
		registerRender(granite_shovel);
		registerRender(diorite_shovel);
		registerRender(andesite_shovel);
		
		registerRender(granite_axe);
		registerRender(diorite_axe);
		registerRender(andesite_axe);
		
		registerRender(granite_hoe);
		registerRender(diorite_hoe);
		registerRender(andesite_hoe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
