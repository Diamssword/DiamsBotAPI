package com.diamssword.bot.api.utils;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class StringUtils {

	public static String removeSpaces(String s)
	{
		return s.trim().replaceAll(" +", " ");
	}

	public static int getMaxFittingFontSize(Graphics g, Font font, String string, int width, int height){
		int minSize = 0;
		int maxSize = 288;
		int curSize = font.getSize();

		while (maxSize - minSize > 2){
			FontMetrics fm = g.getFontMetrics(new Font(font.getName(), font.getStyle(), curSize));
			int fontWidth = fm.stringWidth(string);
			int fontHeight = fm.getLeading() + fm.getMaxAscent() + fm.getMaxDescent();

			if ((fontWidth > width) || (fontHeight > height)){
				maxSize = curSize;
				curSize = (maxSize + minSize) / 2;
			}
			else{
				minSize = curSize;
				curSize = (minSize + maxSize) / 2;
			}
		}

		return curSize;
	}
	public static String weldArgs(String[] args, int startIndex, int endIndex)
	{
		String res="";
		if(startIndex<0)
			startIndex=0;
		if(endIndex <0)
			endIndex = args.length;
		for(int i = startIndex; i<endIndex && i<args.length;i++)
		{
			res =res +" "+args[i];
		}
		return res.replaceFirst(" ", "");
	}
}
