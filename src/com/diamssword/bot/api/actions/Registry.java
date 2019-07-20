package com.diamssword.bot.api.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Register your commands, actions and tickables here, the will then be initialized by the Main Bot
 * @author Diamssword
 *
 */
public class Registry {
	public static List<ICommand> commands =  new ArrayList<ICommand>();
	
	public static List<IAction> actions=  new ArrayList<IAction>();
	public static Map<ITickable,Long> tickables = new HashMap<ITickable,Long>();
	
	/**
	 * Called by the MainBot, DON'T call this methods yourself
	 */
	public static void init()
	{
		
		for(ICommand cmd : commands)
			cmd.init();
	}
	
	/**
	 * Called by the MainBot, DON'T call this methods yourself
	 */
	public static void initActions()
	{
		for(IAction cmd : actions)
			cmd.init();
	}
	
	/**
	 * Add a new {@link ICommand} here to register it
	 * @param cmd
	 */
	public static void registerCmd(ICommand cmd)
	{
		commands.add(cmd);
	}
	/**
	 * Add a new {@link IAction} here to register it
	 * @param action
	 */
	public static void registerAction(IAction action)
	{
		actions.add(action);
	}
	/**
	 * Add a new {@link ITickable} here to register it
	 * @param tickable
	 */
	public static void registerTickable(ITickable tickable)
	{
		tickables.put(tickable, (long)0);
	}
}
