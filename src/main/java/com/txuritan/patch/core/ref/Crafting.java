package com.txuritan.patch.core.ref;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting
{
	public static void recipes()
	{
		ItemStack B = new ItemStack(Block.stoneBrick);
		ItemStack S = new ItemStack(Block.slowSand);
		ItemStack O = new ItemStack(Block.obsidian);
		ItemStack G = new ItemStack(Block.blockGold);
		ItemStack ST = new ItemStack(Block.stone);
		ItemStack W = new ItemStack(Block.whiteStone);
		ItemStack E = new ItemStack(Block.blockEmerald);
		
		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 4, 3), "cc ", "cc ", "   ", 'c', B);
		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 4, 3), " cc", " cc", "   ", 'c', B);
		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 4, 3), "   ", "cc ", "cc ", 'c', B);
		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 4, 3), "   ", " cc", " cc", 'c', B);
		GameRegistry.addRecipe(new ItemStack(Block.whiteStone), "ooo", "ogo", "sss", 'o', O, 's', S, 'g', G);
		GameRegistry.addRecipe(new ItemStack(Block.endPortalFrame), "o o", "wew", "sws", 'e', E, 'w', W, 's', ST, 'o', O);
	}
}
