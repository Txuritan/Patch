package com.txuritan.patch.main.ref;

import com.txuritan.patch.main.blocks.Blocks;
import com.txuritan.patch.main.items.Items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting
{
	public static void recipes()
	{
		ItemStack St = new ItemStack(Item.stick);
		ItemStack Bo = new ItemStack(Item.bone);
		ItemStack Co = new ItemStack(Items.copperIngot);
		ItemStack Sl = new ItemStack(Items.steelIngot);
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
		GameRegistry.addRecipe(new ItemStack(Items.pickaxeBone), "bbb", " s ", " s ", 'e', Bo, 'b', Bo, 's', St);
		GameRegistry.addRecipe(new ItemStack(Items.pickaxeCopper), "bbb", " s ", " s ", 'e', Bo, 'b', Co, 's', St);
		GameRegistry.addRecipe(new ItemStack(Items.pickaxeSteel), "bbb", " s ", " s ", 'e', Bo, 'b', Sl, 's', St);
		GameRegistry.addRecipe(new ItemStack(Items.hammerSteel), "sts", "sts", " t ", 's', Sl, 't', St);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustChromedigizoid, 2), new Object[]{Blocks.oreChromedigizoid, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustChromedigizoid, 1), new Object[]{Items.ingotChromedigizoid, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.dustChromedigizoid.itemID, new ItemStack(Items.ingotChromedigizoid), 0.7f);
		GameRegistry.addSmelting(Blocks.oreChromedigizoid.blockID, new ItemStack(Items.ingotChromedigizoid), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustLead, 2), new Object[]{Blocks.oreLead, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustLead, 1), new Object[]{Items.ingotLead, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.dustLead.itemID, new ItemStack(Items.ingotLead), 0.7f);
		GameRegistry.addSmelting(Blocks.oreLead.blockID, new ItemStack(Items.ingotLead), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustMagicite, 2), new Object[]{Blocks.oreMagicite, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustMagicite, 1), new Object[]{Items.ingotMagicite, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.dustMagicite.itemID, new ItemStack(Items.ingotMagicite), 0.7f);
		GameRegistry.addSmelting(Blocks.oreMagicite.blockID, new ItemStack(Items.ingotMagicite), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustMecha, 2), new Object[]{Blocks.oreMecha, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustMecha, 1), new Object[]{Items.ingotMecha, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.dustMecha.itemID, new ItemStack(Items.ingotMecha), 0.7f);
		GameRegistry.addSmelting(Blocks.oreMecha.blockID, new ItemStack(Items.ingotMecha), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustMeowium, 2), new Object[]{Blocks.oreMeowium, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dustMeowium, 1), new Object[]{Items.ingotMeowium, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.dustMeowium.itemID, new ItemStack(Items.ingotMeowium), 0.7f);
		GameRegistry.addSmelting(Blocks.oreMeowium.blockID, new ItemStack(Items.ingotMeowium), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.copperDust, 2), new Object[]{Blocks.oreCopper, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.copperDust, 1), new Object[]{Items.copperIngot, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.copperDust.itemID, new ItemStack(Items.copperIngot), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coalDust, 1), new Object[]{Items.coalIngot, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coalDust, 2), new Object[]{Block.oreCoal, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coalDust, 1), new Object[]{Item.coal, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.coalDust.itemID, new ItemStack(Items.coalIngot), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.steelDust, 1), new Object[]{Items.steelIngot, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.steelDust.itemID, new ItemStack(Items.steelIngot), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ironDust, 2), new Object[]{Block.oreIron, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ironDust, 1), new Object[]{Item.ingotIron, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.ironDust.itemID, new ItemStack(Item.ingotIron), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.goldDust, 2), new Object[]{Block.oreGold, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.goldDust, 1), new Object[]{Item.ingotGold, (new ItemStack(Items.hammerSteel, 1, OreDictionary.WILDCARD_VALUE))});
		GameRegistry.addSmelting(Items.goldDust.itemID, new ItemStack(Item.ingotGold), 0.7f);
		
		GameRegistry.addSmelting(Blocks.oreCopper.blockID, new ItemStack(Items.copperIngot), 0.7f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coalIngot, 1), new ItemStack(Items.coalDust), new ItemStack(Items.coalDust));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.steelDust, 1), new ItemStack(Items.ironDust), new ItemStack(Items.coalDust));
	}
}
