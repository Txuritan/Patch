package com.txuritan.patch.api.tile.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.txuritan.patch.api.tab.PatchTab;
import com.txuritan.patch.api.tile.blocks.ores.ITileOre;
import com.txuritan.patch.main.Info;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileBlock extends Block implements ITileBlock
{
	public TileBlock(int id, Material material)
    {
		super(id, material);
		this.setCreativeTab(PatchTab.tabPatch);
		this.setStepSound(soundStoneFootstep);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Info.MODID + ":" + "base/" + (this.getUnlocalizedName().substring(5)));
	}
}
