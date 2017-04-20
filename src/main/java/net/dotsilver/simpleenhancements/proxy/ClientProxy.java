package net.dotsilver.simpleenhancements.proxy;

import net.dotsilver.simpleenhancements.init.SimpleEnhancementsItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		SimpleEnhancementsItems.registerRenders();
	}
}
