package com.diamssword.bot.api.actions;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public interface IAction {
	
	/**
	 * @return case-insensitive, space sensitive, phrases to trigger action
	 */
	public String[] getTriggers(Guild g);
	/** 
	 * @return A description of the effect of the command (used for exemple in the 'help' command)
	 */
	public String usage();
	/**
	 * 
	 * @return the name of the Action
	 */
	public String name();
	
	/**
	 * Executed when the bot detect on of the triggers on a textchannel
	 * @param event the event containings infos on message, guild and textchannel wich issued the Action
	 * @param trigger the string wich triggered the Action
	 * @param before the part of the message before the triggering string
	 * @param after the part of the message after the triggering string
	 * for '>command args1 args2 args3arg4' will return in args the list: {args1,args2,args3arg4} 
	 */
	public void execute(MessageReceivedEvent event,String trigger, String before,String after);
	
	/**
	 * Is called on time at the bot launch on the {@code 'Commands.initActions()'} 
	 */
	public void init();
}
