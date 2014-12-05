package com.txuritan.patch.main.util;

import java.io.File;

import net.minecraftforge.common.Configuration;

import com.txuritan.patch.main.items.ItemsIDs;

import cpw.mods.fml.common.Loader;

public class ItemConfig
{
	public static void init(File configFile)
	{
		Configuration config = new Configuration((new File(Loader.instance().getConfigDir(), "Txuritan/Patch-Items.cfg")));
		
		config.load();
		
		ItemsIDs.pickaxeBoneID = config.getItem("Bone Pickaxe", 4001).getInt() -256;
		
		ItemsIDs.coalDustID = config.getItem("Coal Dust", 4002).getInt() - 256;
		ItemsIDs.coalIngotID = config.getItem("Coal Ingot", 4003).getInt() - 256;
		
		ItemsIDs.dustChromedigizoidID = config.getItem("Chromedigizoid Dust", 4004).getInt() - 256;
		ItemsIDs.ingotChromedigizoidID = config.getItem("Chromedigizoid Ingot", 4005).getInt() - 256;
		ItemsIDs.pickaxeChromedigizoidID = config.getItem("Chromedigizoid Pickaxe", 4006).getInt() -256;
		
		ItemsIDs.copperDustID = config.getItem("Copper Dust", 4007).getInt() - 256;
		ItemsIDs.copperIngotID = config.getItem("Copper Ingot", 4008).getInt() - 256;
		ItemsIDs.pickaxeCopperID = config.getItem("Copper Pickaxe", 4009).getInt() -256;
		
		ItemsIDs.goldDustID = config.getItem("Gold Dust", 4011).getInt() - 256;
		
		ItemsIDs.ironDustID = config.getItem("Iron Dust", 4012).getInt() - 256;
		
		ItemsIDs.dustLeadID = config.getItem("Lead Dust", 4013).getInt() - 256;
		ItemsIDs.ingotLeadID = config.getItem("Lead Ingot", 4014).getInt() - 256;
		ItemsIDs.pickaxeLeadID = config.getItem("Lead Pickaxe", 4015).getInt() -256;
		
		ItemsIDs.dustMagiciteID = config.getItem("Magicite Dust", 4016).getInt() - 256;
		ItemsIDs.ingotMagiciteID = config.getItem("Magicite Ingot", 4017).getInt() - 256;
		ItemsIDs.pickaxeMagiciteID = config.getItem("Magicite Pickaxe", 4018).getInt() -256;
		
		ItemsIDs.dustMechaID = config.getItem("Mecha Dust", 4019).getInt() - 256;
		ItemsIDs.ingotMechaID = config.getItem("Mecha Ingot", 4020).getInt() - 256;
		ItemsIDs.pickaxeMechaID = config.getItem("Mecha Pickaxe", 4021).getInt() -256;
		
		ItemsIDs.dustMeowiumID = config.getItem("Meowium Dust", 4022).getInt() - 256;
		ItemsIDs.ingotMeowiumID = config.getItem("Meowium Ingot", 4023).getInt() - 256;
		ItemsIDs.pickaxeMeowiumID = config.getItem("Meowium Pickaxe", 4024).getInt() -256;
		
		ItemsIDs.patchItemID = config.getItem("Patch", 4025).getInt() - 256;
		
		ItemsIDs.hammerSteelID = config.getItem("Steel Hammer", 4026).getInt() -256;
		ItemsIDs.steelDustID = config.getItem("Steel Dust", 4027).getInt() -256;
		ItemsIDs.steelIngotID = config.getItem("Steel Ingot", 4028).getInt() - 256;
		ItemsIDs.pickaxeSteelID = config.getItem("Steel Pickaxe", 4029).getInt() -256;
		
		config.save();
	}
}
