package com.rcx.wtfrocks;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.rcx.wtfrocks.registerrocks.AddRocks;
import com.rcx.wtfrocks.registerrocks.AddRocksAtum;
import com.rcx.wtfrocks.registerrocks.AddRocksErebus;

@Mod(modid = WTFRocks.MODID, version = WTFRocks.VERSION, dependencies = WTFRocks.DEPS)
public class WTFRocks
{
    public static final String MODID = "wtfrocks";
    public static final String VERSION = "%version%";
    public static final String DEPS = "required-after:WTFCore";

    @Instance(MODID)
    public static WTFRocks instance;


    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	AddRocks.BlockRegister();

    	if (Loader.isModLoaded("atum")){
    		AddRocksAtum.BlockRegister();
    	}

    	if (Loader.isModLoaded("erebus")){
    		AddRocksErebus.BlockRegister();
		}
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
    
}
