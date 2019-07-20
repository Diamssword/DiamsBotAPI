package com.DiamsBotPlugin.exemple;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.diamssword.bot.api.actions.ICommand;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class NewCommand implements ICommand{
	@Override
	public void init() {
		Logger.getLogger("DiamsBotPlugin").log(Level.INFO, "Initializing NewCommand");

	}

	@Override
	public String getName() {
		return "plugin";
	}

	@Override
	public String getDesc() {
		return "My plugin worked";
	}

	@Override
	public String getUsage() {
		return "Nothing..really";
	}

	/**
	 * Envoie le message YOLO dans le chat 
	 * (notez le queue() à la fin, il est essentiel à la plupart des actions d'envois du bot)
	 */
	@Override
	public void execute(MessageReceivedEvent event, String... args) {
		
		//si la commande est suivi de l'arguement 'diams' on fait autre chose. 
		if(args.length > 0 && args[0].equals("diams"))
		{
			event.getChannel().sendMessage("Ceci est un plugin de test").queue();
		}
		else
			event.getChannel().sendMessage("YOLO").queue();
	}
}
