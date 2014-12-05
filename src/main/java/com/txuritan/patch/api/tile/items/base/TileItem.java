package com.txuritan.patch.api.tile.items.base;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.txuritan.patch.api.tab.PatchTab;
import com.txuritan.patch.api.tile.items.dusts.ITileDust;
import com.txuritan.patch.main.Info;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileItem extends Item implements ITileItem
{
	public TileItem(int id)
	{
		super(id);
		this.setCreativeTab(PatchTab.tabPatch);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Info.MODID + ":" + "base/" + (this.getUnlocalizedName().substring(5)));
	}
}
