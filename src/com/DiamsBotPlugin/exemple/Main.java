package com.DiamsBotPlugin.exemple;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.diamssword.bot.api.IPlugin;
import com.diamssword.bot.api.actions.Registry;

/**
 * Plugin d'exemple ! Sentez vous libre de copier et modifier!
 * @author Diamssword
 *
 */
public class Main implements IPlugin {

	@Override
	public String id() {
		return "Diams_bot_plugin2";
	}

	@Override
	public String name() {
		return "DiamsBot Second Plugin";
	}

	@Override
	public void preInit() {
		Logger.getLogger("DiamsBotPlugin").log(Level.SEVERE, "Mon PLUGIN est reveillé!");
	}

	@Override
	public void init() {
		Registry.registerCmd(new NewCommand());	
	}

	@Override
	public void postInit() {
		Logger.getLogger("DiamsBotPlugin").log(Level.SEVERE, "Tout est lancé Chef!");
	}
}

