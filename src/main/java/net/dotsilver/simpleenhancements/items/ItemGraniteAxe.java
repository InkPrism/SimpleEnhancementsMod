package net.dotsilver.simpleenhancements.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGraniteAxe extends ItemAxe{
	public ItemGraniteAxe(Item.ToolMaterial material)
	{
		super(material);
	}
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("žaFinally they've a purpose!");
    }
}
