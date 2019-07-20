package com.diamssword.bot.api.audio;

import java.io.File;

public interface IttsMaker {
	
	/**
	 *Return a .wav file based on the string passed and the lang used
	 * @param lang
	 * @param speech
	 * @return a wav file
	 */
	public File speak(Langues lang,String speech);
}
