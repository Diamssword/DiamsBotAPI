package com.diamssword.bot.api.audio;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackEndReason;

import net.dv8tion.jda.core.entities.Guild;

public interface IGuildPlayer {


	public Guild getGuild();
	public AudioPlayer getPlayer();
	public void onPlayerPause(AudioPlayer player);

	public void onPlayerResume(AudioPlayer player) ;
	public void onTrackStart(AudioPlayer player, AudioTrack track) ;

	public void onTrackEnd(AudioPlayer player, AudioTrack track, AudioTrackEndReason endReason) ;

	public void onTrackException(AudioPlayer player, AudioTrack track, FriendlyException exception);

	public void onTrackStuck(AudioPlayer player, AudioTrack track, long thresholdMs);

	public void queue(IChannelTrack track);
	public void skip();
	public void clear();
}