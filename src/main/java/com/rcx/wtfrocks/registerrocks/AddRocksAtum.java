package com.rcx.wtfrocks.registerrocks;

import cavebiomes.utilities.StoneRegister;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Loader;

import com.teammetallurgy.atum.blocks.AtumBlocks;

public class AddRocksAtum {

	//Method to call registry of Blocks
	public static void BlockRegister()
	{
		String[] limestoneBlock = {"AtumStone"};
		String[] limestoneCobbleBlock = {"AtumCobble"};
		StoneRegister atumlimestone = getStoneRegister(AtumBlocks.BLOCK_STONE, AtumBlocks.BLOCK_LIMESTONECOBBLE, "atumlimestone", limestoneBlock, limestoneCobbleBlock, "atum");
		atumlimestone.mossyStone = false;
		atumlimestone.mossyCobble = false;
		atumlimestone.drippingWater = false;
		atumlimestone.genReplaceable = false;
		atumlimestone.register();
	}
	
	public static StoneRegister getStoneRegister(Block stone, Block cobblestone, String unlocalisedName, String[] stoneNames, String[] cobbleNames, String domain){
		return new StoneRegister(stone, cobblestone, unlocalisedName, stoneNames, cobbleNames, domain);
	}
	public static StoneRegister getStoneRegister(Block stone, Block cobblestone, String unlocalisedName, String stoneNames, String cobbleNames, String domain){
		return new StoneRegister(stone, cobblestone, unlocalisedName, stoneNames, cobbleNames, domain);
	}
}
