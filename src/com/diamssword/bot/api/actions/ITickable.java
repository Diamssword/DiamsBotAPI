package com.diamssword.bot.api.actions;

import net.dv8tion.jda.core.entities.Guild;

/**
 * Add this to implements a timer event to your class, will be fired every 50 ms
 * Be sure to register your classes in the {@link Registry#registerTickable}!
 * @author Diamssword
 */
public interface ITickable {
	
	/**
	 * Executed once every X ms (managed by {@link ITickable#everyMS()} and once by guild
	 * @param guild
	 */
	public void tick(Guild guild);
	/**
	 * how often the event is fired (min : 50ms)
	 * @return the delay in millisecondes beetween 2 ticks
	 */
	public int everyMS();

}
