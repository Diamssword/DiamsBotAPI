package com.diamssword.bot.api.audio;

import java.util.logging.Logger;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;

import net.dv8tion.jda.core.entities.Invite.Guild;
import net.dv8tion.jda.core.entities.Member;

public interface IGPlayerManager {

	public final static AudioPlayerManager playerManager = new DefaultAudioPlayerManager();
	public static final Logger LOG = Logger.getLogger("DiamsBot-Audio");
	public IGuildPlayer getGuildPlayer(String guildID);
	public IGuildPlayer getGuildPlayer(Guild g);
	public void queueTrack(String GuildID,IChannelTrack track);
	public void queueTrack(Guild guild,IChannelTrack track);
	
	/**
	 * 
	 * @param source can be a youtube url, a local path...
	 * @param guildID the id of the guild
	 * @param member the member to deliver this audio
	 */
	public void loadTrackForMember(String source, String guildID,Member member );
}
