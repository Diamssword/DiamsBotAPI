package com.diamssword.bot.api.actions.storage;

/**
 * A complete implementations of {@link AGuildStorage} be careful for the Unchecked casts
 * @author Diamssword
 *
 * @param <T>
 */
public class GuildStorage<T extends ISavable> extends AGuildStorage<T>{
	public Class<T> clazz;
	
	/**
	 * 
	 * @param clazz the smae Class of the T object (used to instantiate a new instance if null)
	 */
	public GuildStorage(Class<T> clazz)
	{
		this.clazz = clazz;
	}
	@Override
	public void init(String serverID) {
		try {
			this.set(serverID, clazz.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
