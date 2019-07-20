package com.diamssword.bot.api.utils;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.annotation.Nullable;
import javax.imageio.ImageIO;

import com.diamssword.bot.api.References;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.impl.DataMessage;

public class LoadUtils {


	/**
	 * load an image in the ressource folder
	 * @param path relative to the ressources folder
	 * @return
	 */
	public static BufferedImage loadImg(String path)
	{
		URL url = References.class.getClass().getResource("/diamssword/ressources/"+path);
		if(url != null)
		{
			try {
				return ImageIO.read(url);
			} catch (IOException e) {
				e.printStackTrace();
				return new BufferedImage(40, 40, 1);
			}
		}
		return new BufferedImage(40, 40, 1);
	}
	
	/**
	 * shortcut methods to send a file to a text channel
	 * @param channel the channel to send a file
	 * @param data the file itself in raw byte array
	 * @param name the name of the file (for exemple 'image.png' will display it as an image on discord)
	 * @param text an additional text message to send
	 */
	public static void sendFile(MessageChannel channel, byte[] data, String name, @Nullable String text)
	{
		if(text == null)
			text="";
		channel.sendFile(data, name,new DataMessage(false, text, "", null)).queue();
	}
	
	/**
	 * Fetch the text content of this URL (mainly used to get api datas (for exemple in json format)
	 * @param url
	 * @return a string form of the returneds datas
	 */
	public static String urlToString(URL url)
	{
		
		String res="";
		try {
			URLConnection openConnection = url.openConnection();
			try {

				openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
				openConnection.connect();

			} catch (Exception e) {
				System.out.println("Couldn't create a connection to the link, please recheck the link.");
				e.printStackTrace();
			}
			Scanner s = new Scanner(openConnection.getInputStream());
			
			while(s.hasNextLine())
				res = res+s.nextLine();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
		
	}
	
	/**
	 * Download a BufferedImage from an URL 
	 * @param url
	 * @return a bufferedImage or null if an error as occured
	 */
	public static BufferedImage dlImage(URL url)
	{
		try {

			URLConnection openConnection = url.openConnection();
			try {

				openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
				openConnection.connect();

			} catch (Exception e) {
				e.printStackTrace();
			}

				return ImageIO.read(new BufferedInputStream(openConnection.getInputStream()));
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}
}
