package com.txuritan.patch.main.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.txuritan.patch.api.tile.items.base.TileItem;
import com.txuritan.patch.api.tile.items.coal.TileCoal;
import com.txuritan.patch.api.tile.items.dusts.TileDust;
import com.txuritan.patch.api.tile.items.ingots.TileIngot;
import com.txuritan.patch.api.tile.tools.pickaxe.TilePickaxe;
import com.txuritan.patch.main.Info;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items
{
	public static Item patchItem = (new TileItem(ItemsIDs.patchItemID)).setUnlocalizedName("patchItem");
	
	public static Item coalIngot = (new TileCoal(ItemsIDs.coalIngotID)).setUnlocalizedName("coal_ingot");
	
	public static Item copperIngot = (new TileIngot(ItemsIDs.copperIngotID)).setUnlocalizedName("copper_ingot");
	public static Item steelIngot = (new TileIngot(ItemsIDs.steelIngotID)).setUnlocalizedName("steel_ingot");
	
	public static Item coalDust = (new TileDust(ItemsIDs.coalDustID)).setUnlocalizedName("coal_dust");
	public static Item copperDust = (new TileDust(ItemsIDs.copperDustID)).setUnlocalizedName("copper_dust");
	public static Item steelDust = (new TileDust(ItemsIDs.steelDustID)).setUnlocalizedName("steel_dust");
	public static Item ironDust = (new TileDust(ItemsIDs.ironDustID)).setUnlocalizedName("iron_dust");
	public static Item goldDust = (new TileDust(ItemsIDs.goldDustID)).setUnlocalizedName("gold_dust");
	
	private static String Bone;
	private static String Copper;
	private static String Steel;
	
	public static EnumToolMaterial PatchBone = EnumHelper.addToolMaterial(Bone, 1, 100, 3.0F, 0.5F, 20);
	public static EnumToolMaterial PatchCopper = EnumHelper.addToolMaterial(Copper, 2, 200, 5.0F, 1.5F, 10);
	public static EnumToolMaterial PatchSteel = EnumHelper.addToolMaterial(Steel, 2, 800, 5.0F, 2.5F, 12);

	public static Item pickaxeBone = (new TilePickaxe(ItemsIDs.pickaxeBoneID, Items.PatchBone)).setUnlocalizedName("pickaxeBone").setTextureName(Info.MODID + ":" + "tools/" + "bone/" + "bone_pickaxe");
	public static Item pickaxeCopper = (new TilePickaxe(ItemsIDs.pickaxeCopperID, Items.PatchCopper)).setUnlocalizedName("pickaxeCopper").setTextureName(Info.MODID + ":" + "tools/" + "copper/" + "copper_pickaxe");
	public static Item pickaxeSteel = (new TilePickaxe(ItemsIDs.pickaxeSteelID, Items.PatchSteel)).setUnlocalizedName("pickaxeSteel").setTextureName(Info.MODID + ":" + "tools/" + "steel/" + "steel_pickaxe");
	
	public static Item pickaxeChromedigizoid = (new TilePickaxe(ItemsIDs.pickaxeChromedigizoidID, EnumToolMaterial.IRON)).setUnlocalizedName("pickaxeChromedigizoid").setTextureName(Info.MODID + ":" + "tools/" + "chromedigizoid/" + "chromedigizoid_pickaxe");
	public static Item dustChromedigizoid = (new TileDust(ItemsIDs.dustChromedigizoidID)).setUnlocalizedName("chromedigizoid_dust");
	public static Item ingotChromedigizoid = (new TileIngot(ItemsIDs.ingotChromedigizoidID)).setUnlocalizedName("chromedigizoid_ingot");
	
	public static Item pickaxeLead = (new TilePickaxe(ItemsIDs.pickaxeLeadID, EnumToolMaterial.IRON)).setUnlocalizedName("pickaxeLead").setTextureName(Info.MODID + ":" + "tools/" + "lead/" + "lead_pickaxe");
	public static Item dustLead = (new TileDust(ItemsIDs.dustLeadID)).setUnlocalizedName("lead_dust");
	public static Item ingotLead = (new TileIngot(ItemsIDs.ingotLeadID)).setUnlocalizedName("lead_ingot");
	
	public static Item pickaxeMagicite = (new TilePickaxe(ItemsIDs.pickaxeMagiciteID, EnumToolMaterial.IRON)).setUnlocalizedName("pickaxeMagicite").setTextureName(Info.MODID + ":" + "tools/" + "magicite/" + "magicite_pickaxe");
	public static Item dustMagicite = (new TileDust(ItemsIDs.dustMagiciteID)).setUnlocalizedName("magicite_dust");
	public static Item ingotMagicite = (new TileIngot(ItemsIDs.ingotMagiciteID)).setUnlocalizedName("magicite_ingot");
	
	public static Item pickaxeMecha = (new TilePickaxe(ItemsIDs.pickaxeMechaID, EnumToolMaterial.IRON)).setUnlocalizedName("pickaxeMecha").setTextureName(Info.MODID + ":" + "tools/" + "mecha/" + "mecha_pickaxe");
	public static Item dustMecha = (new TileDust(ItemsIDs.dustMechaID)).setUnlocalizedName("mecha_dust");
	public static Item ingotMecha = (new TileIngot(ItemsIDs.ingotMechaID)).setUnlocalizedName("mecha_ingot");
	
	public static Item pickaxeMeowium = (new TilePickaxe(ItemsIDs.pickaxeMeowiumID, EnumToolMaterial.IRON)).setUnlocalizedName("pickaxeMeowium").setTextureName(Info.MODID + ":" + "tools/" + "meowium/" + "meowium_pickaxe");
	public static Item dustMeowium = (new TileDust(ItemsIDs.dustMeowiumID)).setUnlocalizedName("meowium_dust");
	public static Item ingotMeowium = (new TileIngot(ItemsIDs.ingotMeowiumID)).setUnlocalizedName("meowium_ingot");
	
	public static Item hammerSteel = (new ItemHammer(ItemsIDs.hammerSteelID)).setUnlocalizedName("hammerSteel").setTextureName(Info.MODID + ":" + "tools/" + "steel/" + "steel_hammer");
	
	public static void iregistry()
	{
		GameRegistry.registerItem(patchItem, "patchItem");
		
		GameRegistry.registerItem(coalIngot, "coalIngot");
		GameRegistry.registerItem(copperIngot, "copperIngot");
		GameRegistry.registerItem(steelIngot, "steelIngot");
		
		GameRegistry.registerItem(coalDust, "coalDust");
		GameRegistry.registerItem(copperDust, "copperDust");
		GameRegistry.registerItem(steelDust, "steelDust");

		GameRegistry.registerItem(ironDust, "ironDust");
		GameRegistry.registerItem(goldDust, "goldDust");
	}
}
