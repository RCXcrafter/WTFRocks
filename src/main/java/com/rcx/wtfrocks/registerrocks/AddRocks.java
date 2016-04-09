package com.rcx.wtfrocks.registerrocks;

import cavebiomes.utilities.StoneRegister;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Loader;

public class AddRocks {

	//Method to call registry of Blocks
	public static void BlockRegister()
	{
		String[] clayBlock = {"clay"};
		StoneRegister clay = getStoneRegister(Blocks.clay, Blocks.clay, "clay", clayBlock, clayBlock, "minecraft");
		clay.speleothems = false;
		clay.lavacrust = false;
		clay.mossyStone = false;
		clay.mossyCobble = false;
		clay.drippingWater = false;
		clay.drippingLava = false;
		clay.cobbleFall = false;
		clay.genReplaceable = false;
		clay.register();
		
		String[] endstoneBlock = {"end_stone"};
		StoneRegister endstone = getStoneRegister(Blocks.end_stone, Blocks.end_stone, "endstone", endstoneBlock, endstoneBlock, "minecraft");
		endstone.lavacrust = false;
		endstone.mossyStone = false;
		endstone.mossyCobble = false;
		endstone.drippingWater = false;
		endstone.drippingLava = false;
		endstone.cobbleFall = false;
		endstone.genReplaceable = false;
		endstone.register();
		
		String[] soulsandBlock = {"soul_sand"};
		StoneRegister soulsand = getStoneRegister(Blocks.soul_sand, Blocks.soul_sand, "soulsand", soulsandBlock, soulsandBlock, "minecraft");
		soulsand.speleothems = false;
		soulsand.lavacrust = false;
		soulsand.mossyStone = false;
		soulsand.mossyCobble = false;
		soulsand.drippingWater = false;
		soulsand.genReplaceable = false;
		soulsand.register();
		
		String[] hardenedclayBlockStained = {"hardened_clay_stained_brown", "hardened_clay_stained_orange", "hardened_clay_stained_red", "hardened_clay_stained_silver", "hardened_clay_stained_white", "hardened_clay_stained_yellow"};
		StoneRegister hardenedclaystained = getStoneRegister(Blocks.stained_hardened_clay, Blocks.stained_hardened_clay, "stained_hardened_clay", hardenedclayBlockStained, hardenedclayBlockStained, "minecraft");
		hardenedclaystained.speleothems = false;
		hardenedclaystained.mossyCobble = false;
		hardenedclaystained.cobbleFall = false;
		hardenedclaystained.genReplaceable = false;
		hardenedclaystained.register();
		
		String[] hardenedClayBlock = {"hardened_clay"};
		StoneRegister hardenedclay = getStoneRegister(Blocks.hardened_clay, Blocks.hardened_clay, "hardened_clay", hardenedClayBlock, hardenedClayBlock, "minecraft");
		hardenedclay.speleothems = false;
		hardenedclay.mossyCobble = false;
		hardenedclay.cobbleFall = false;
		hardenedclay.genReplaceable = false;
		hardenedclay.register();
		
		String[] snowBlock = {"snow"};
		StoneRegister snow = getStoneRegister(Blocks.snow, Blocks.snow, "snow", snowBlock, snowBlock, "minecraft");
		snow.speleothems = false;
		snow.lavacrust = false;
		snow.mossyStone = false;
		snow.mossyCobble = false;
		snow.drippingLava = false;
		snow.genReplaceable = false;
		snow.register();
		
		String[] iceBlock = {"ice"};
		StoneRegister ice = getStoneRegister(Blocks.ice, Blocks.ice, "ice", iceBlock, iceBlock, "minecraft");
		ice.speleothems = false;
		ice.lavacrust = false;
		ice.mossyStone = false;
		ice.mossyCobble = false;
		ice.drippingLava = false;
		ice.cobbleFall = false;
		ice.genReplaceable = false;
		ice.register();
		
		String[] packedIceBlock = {"ice_packed"};
		StoneRegister packedice = getStoneRegister(Blocks.packed_ice, Blocks.packed_ice, "packed_ice", packedIceBlock, packedIceBlock, "minecraft");
		packedice.lavacrust = false;
		packedice.mossyStone = false;
		packedice.mossyCobble = false;
		packedice.drippingLava = false;
		packedice.cobbleFall = false;
		packedice.genReplaceable = false;
		packedice.register();
	}
	
	public static StoneRegister getStoneRegister(Block stone, Block cobblestone, String unlocalisedName, String[] stoneNames, String[] cobbleNames, String domain){
		return new StoneRegister(stone, cobblestone, unlocalisedName, stoneNames, cobbleNames, domain);
	}
	public static StoneRegister getStoneRegister(Block stone, Block cobblestone, String unlocalisedName, String stoneNames, String cobbleNames, String domain){
		return new StoneRegister(stone, cobblestone, unlocalisedName, stoneNames, cobbleNames, domain);
	}
}
