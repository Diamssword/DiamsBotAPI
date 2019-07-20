package com.diamssword.bot.api.utils;

import java.util.ArrayList;
import java.util.List;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.MessageChannel;

public class MembersUtil {


	/**
	 * Find members with a name or nickname containing the passed piece of String in the passed list
	 * @param members list of members to look in
	 * @param name piece of string which should be searched 
	 * @return a list of Member matching the string
	 */
	public static List<Member> getMembersMatching(List<Member> members, String name)
	{
		List<Member> res = new ArrayList<Member>();
		if(name.startsWith("<@!"))
		{
			String t = name.replaceFirst("<@!", "").replace(">", "");
			for(Member m : members)
			{
				if(m.getUser().getId().equals(t))
				{
					res.add(m);
					return res;
				}
			}
		}
		if(name.length() > 2)
		{
			name = name.toLowerCase();
			for(Member m :members)
			{
				if(m.getEffectiveName().toLowerCase().contains(name) ||m.getUser().getName().toLowerCase().contains(name))
				{
					res.add(m);
				}
			}
		}
		return res;
	}
	/**
	 * Mention someone without pinging him
	 * @param channel the channel to send the message to.
	 * @param member the member to mention
	 * @param text the text to write, replace the user name by '@member'
	 */
	public static void mentionMember(MessageChannel channel, Member member, String text)
	{
		channel.sendMessage(text).complete().editMessage(text.replaceAll("@member", member.getAsMention())).queue();;
	}
}
