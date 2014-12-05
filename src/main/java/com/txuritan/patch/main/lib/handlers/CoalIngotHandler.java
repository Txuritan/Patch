package com.txuritan.patch.main.lib.handlers;

import com.txuritan.patch.main.Patch;
import com.txuritan.patch.main.items.Items;
import com.txuritan.patch.main.items.ItemsIDs;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class CoalIngotHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		int var1 = fuel.itemID;
		
		if(var1 == Items.coalIngot.itemID)
		{
			//Six times the burn time of coal
			return 3200;
		}
		
		else
		{
			return 0;
		}
	}
}
