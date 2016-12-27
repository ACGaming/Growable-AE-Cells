package shadows.ae2.growable.core;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigFile {

	public static boolean allowBonemeal = false; 

	public static void syncConfig() { // Gets called from preInit
	    try {
	        // Load config
	    	CommonProxy.config.load();

	        // Read props from config
	        Property allowBonemealProp = CommonProxy.config.get(Configuration.CATEGORY_GENERAL, // What category will it be saved to, can be any string
	                "allowBonemeal", // Property name
	                "false", // Default value
	                "If crops can be bonemealed"); // Comment

	        allowBonemeal = allowBonemealProp.getBoolean(); // Get the boolean value, also set the property value to boolean
	    } catch (Exception e) {
	        // Failed reading/writing, just continue
	    } finally {
	        // Save props to config IF config changed
	        if (CommonProxy.config.hasChanged()) CommonProxy.config.save();
	    }
	}
	
	
}
