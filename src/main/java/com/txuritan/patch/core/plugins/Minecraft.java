package com.txuritan.patch.core.plugins;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class Minecraft
{
	public static void recipes()
	{
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> Stick = recipes.iterator();	          
		while (Stick.hasNext())
		{
			ItemStack is = Stick.next().getRecipeOutput();
			if (is != null && is.itemID == Item.stick.itemID)
				Stick.remove();
		};
			
		Iterator<IRecipe> IronBlock = recipes.iterator();	          
		while (Stick.hasNext())
		{
			ItemStack is = IronBlock.next().getRecipeOutput();
			if (is != null && is.blockID == Block.blockIron)
				IronBlock.remove();
		};
	}
}
