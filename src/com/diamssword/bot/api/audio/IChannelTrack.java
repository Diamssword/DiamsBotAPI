package com.diamssword.bot.api.audio;

import com.sedmelluq.discord.lavaplayer.track.AudioTrack;

import net.dv8tion.jda.core.entities.VoiceChannel;

public interface IChannelTrack {

	/**
	 * 
	 * @return the track to play
	 */
	public AudioTrack getTrack();
	
	/**
	 * 
	 * @return the channel where the track have to be played
	 */
	public VoiceChannel getChannel();
}
