package com.rcx.wtfrocks.registerrocks;

import cavebiomes.utilities.StoneRegister;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Loader;

import erebus.ModBlocks;

public class AddRocksErebus {

	//Method to call registry of Blocks
	public static void BlockRegister()
	{
		String[] umberstoneBlock = {"umberstone"};
		String[] umbercobbleBlock = {"cobbleUmber"};
		StoneRegister umberstone = getStoneRegister(ModBlocks.umberstone, ModBlocks.umberstone, "umberstone", umberstoneBlock, umbercobbleBlock, "erebus");
		umberstone.mossyCobble = false;
		umberstone.genReplaceable = false;
		umberstone.register();
	}
	
	public static StoneRegister getStoneRegister(Block stone, Block cobblestone, String unlocalisedName, String[] stoneNames, String[] cobbleNames, String domain){
		return new StoneRegister(stone, cobblestone, unlocalisedName, stoneNames, cobbleNames, domain);
	}
	public static StoneRegister getStoneRegister(Block stone, Block cobblestone, String unlocalisedName, String stoneNames, String cobbleNames, String domain){
		return new StoneRegister(stone, cobblestone, unlocalisedName, stoneNames, cobbleNames, domain);
	}
}
