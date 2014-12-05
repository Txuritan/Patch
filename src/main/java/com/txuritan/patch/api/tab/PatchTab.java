package com.txuritan.patch.api.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.txuritan.patch.main.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PatchTab
{
	public static CreativeTabs tabPatch = new CreativeTabs("tabPatch")
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem()
	    {
	        return Items.patchItem;
	    }
	};
}
