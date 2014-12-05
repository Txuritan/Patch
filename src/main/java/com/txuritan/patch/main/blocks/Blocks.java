package com.txuritan.patch.main.blocks;

import com.txuritan.patch.api.tile.blocks.ores.TileOre;
import com.txuritan.patch.main.Info;
import com.txuritan.patch.main.blocks.base.BlockOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blocks
{
	public static final Block oreCopper = (new TileOre(BlocksIDs.oreCopperID, Material.rock)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("copper_ore");
	
	public static final Block oreMecha = (new TileOre(BlocksIDs.oreMechaID, Material.rock)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("mecha_ore");
	public static final Block oreLead = (new TileOre(BlocksIDs.oreLeadID, Material.rock)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("lead_ore");
	public static final Block oreChromedigizoid = (new TileOre(BlocksIDs.oreChromedigizoidID, Material.rock)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("chromedigizoid_ore");
	public static final Block oreMagicite = (new TileOre(BlocksIDs.oreMagiciteID, Material.rock)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("magicite_ore");
	public static final Block oreMeowium = (new TileOre(BlocksIDs.oreMeowiumID, Material.rock)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("meowium_ore");
	
	public static void bregistry()
	{
		GameRegistry.registerBlock(oreCopper, "oreCopper");
		
		GameRegistry.registerBlock(oreMecha, "oreMecha");
		GameRegistry.registerBlock(oreLead, "oreLead");
		GameRegistry.registerBlock(oreChromedigizoid, "oreChromedigizoid");
		GameRegistry.registerBlock(oreMagicite, "oreMagicite");
		GameRegistry.registerBlock(oreMeowium, "oreMeowium");
	}
}
