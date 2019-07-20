package com.diamssword.bot.api;

import com.diamssword.bot.api.actions.storage.IStorage;
import com.diamssword.bot.api.audio.IGPlayerManager;
import com.diamssword.bot.api.audio.IttsMaker;

public class References {

	/**
	 * A class used to convert String to audio file, you can use it to create a chat bot
	 */
	public static IttsMaker TTSMaker;
	
	/**
	 * The audio Manager, designed mainly to play audio on a specific channel or to a specific member
	 */
	public static IGPlayerManager PlayerManager;
	
	/**
	 * used to store all data on disk, will recover them automatically on app restart
	 */
	public static IStorage Storage;
}
