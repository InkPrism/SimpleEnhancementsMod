package net.dotsilver.simpleenhancements;

import net.dotsilver.simpleenhancements.init.ADGItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class SimpleEnhancementsTab extends CreativeTabs{

	public SimpleEnhancementsTab(String label) {
		super(label);
		
	}

	@Override
	public ItemStack getTabIconItem() {
		if (Config.recipesADGTools) {
			return new ItemStack(ADGItems.diorite_pickaxe);
		} else {
			return new ItemStack(Blocks.GRASS);
		}
	}
	
}
