package net.dotsilver.simpleenhancements;

import net.dotsilver.simpleenhancements.init.SimpleEnhancementsItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SimpleEnhancementsTab extends CreativeTabs{

	public SimpleEnhancementsTab(String label) {
		super(label);
		
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(SimpleEnhancementsItems.diorite_pickaxe);
	}
	
}
