package com.txuritan.patch.api.tile.blocks.ores;

import com.txuritan.patch.api.tab.PatchTab;
import com.txuritan.patch.main.Info;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class TileOre extends Block implements ITileOre
{
	public TileOre(int id, Material material)
    {
		super(id, material);
		this.setCreativeTab(PatchTab.tabPatch);
		this.setStepSound(soundStoneFootstep);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Info.MODID + ":" + "ore/" + (this.getUnlocalizedName().substring(5)));
	}
}
