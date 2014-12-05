package com.txuritan.patch.main.items;

import com.txuritan.patch.main.Patch;
import com.txuritan.patch.api.tab.PatchTab;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammer extends Item
{
	private ItemStack emptyItem = null;
	private static int maxDamage = 500;
	
	public ItemHammer(int par1)
    {
        super(par1);
        this.setMaxStackSize(1);
        this.setCreativeTab(PatchTab.tabPatch);
    }
	
	@Override
	public boolean hasContainerItem()
	{
		return true;
	}
	
	public void setEmptyItem(ItemStack ei)
	{
		this.emptyItem = ei;
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
	{
		return false;
	}
	
	@Override
	public ItemStack getContainerItemStack(ItemStack itemStack)
	{
		int alter = itemStack.getItemDamage() + 1;
		
		itemStack.setItemDamage(alter);
		return itemStack;
	}
	
	public static ItemStack copyStack(ItemStack stack, int n)
	{
		return new ItemStack(stack.itemID, n, stack.getItemDamage());
	}
}
