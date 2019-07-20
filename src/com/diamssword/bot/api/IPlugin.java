package com.diamssword.bot.api;


/**
 * The entry point of the plugin, implementing this interface in one of you class will create an instance of your plugin
 * @author Diamssword
 *
 */
public interface IPlugin {

	
	/**
	 * @return unique ID of the plugin
	 */
	public String id();
	/**
	 * @return User-readable name of the plugin
	 */
	public String name();
	
	/**
	 * Triggered by the Main bot when starting, happens before the JDA bot is setup and connected 
	 * and before any {@link References}, {@link Registry} have been initialized. Don't try to register commands here
	 */
	public void preInit();
	/**
	 * Triggered by the Main bot when starting, happens after the JDA bot is setup and connected 
	 * and after initializing fields like {@link References} and {@link Registry}, but before all commands are registered and intialized
	 * Basically the best place to register your commands
	 */
	public void init();
	
	/**
	  * Triggered by the Main bot when everything is loaded
	 */
	public void postInit();
	
}
