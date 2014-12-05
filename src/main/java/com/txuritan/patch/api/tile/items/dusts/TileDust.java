package com.txuritan.patch.api.tile.items.dusts;

import com.txuritan.patch.api.tab.PatchTab;
import com.txuritan.patch.main.Info;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class TileDust extends Item implements ITileDust
{
	public TileDust(int id)
	{
		super(id);
		this.setCreativeTab(PatchTab.tabPatch);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Info.MODID + ":" + "dust/" + (this.getUnlocalizedName().substring(5)));
	}
}
