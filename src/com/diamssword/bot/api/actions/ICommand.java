package com.diamssword.bot.api.actions;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public interface ICommand {
	
	/**
	 * Is called on time at the bot launch on the {@code 'Commands.init()'} 
	 */
	public void init();
	
	/**
	 * @return the triggering string to detect the command 
	 * exemple : to create the commands {@code '>help'} return the string  {@code 'help'}
	 */
	public String getName();
	
	/**
	 * 
	 * @return A description of the effect of the command (used for exemple in the 'help' command)
	 */
	public String getDesc();
	
	/**
	 * 
	 * @return A guide to use the commands (like sub-commands) (used for exemple in the 'help' command)
	 */
	public String getUsage();
	
	
	/**
	 * Executed when the bot detect the command on a textchannel
	 * @param event the event containings infos on message, guild and textchannel wich issued the command
	 * @param args all the sub-commands (every parts of the message after the command start and splited by a space
	 * for '>command args1 args2 args3arg4' will return in args the list: {args1,args2,args3arg4} 
	 */
	public void execute(MessageReceivedEvent event, String ... args);

}
