package fr.fifou.economy.items;

import fr.fifou.economy.ModEconomy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGear extends Item 
{
	public static final String NAME = "item_gear";
		
	public ItemGear() 
	{
		super();
		ItemsRegistery.setItemName(this, NAME);
		this.maxStackSize = 64;
		this.setCreativeTab(ModEconomy.tabEconomy);
		this.setUnlocalizedName(NAME);
	}
	
}
