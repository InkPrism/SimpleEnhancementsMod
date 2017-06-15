package net.dotsilver.simpleenhancements.proxy;

import net.dotsilver.simpleenhancements.Config;
import net.dotsilver.simpleenhancements.init.ADGItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		if(Config.recipesADGTools) {
			ADGItems.registerRenders();
		}
	}
}
