package a.b;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Text {
	public static void printBigText(String text) {
		Font font = new Font("Tomaha", Font.PLAIN, 20);
		String s = text;
		BufferedImage img = stringToBufferedImage(font, s);
		int c = 0;
		
		for (int y = 0; y < img.getHeight(); y++) {
			for (int x = 0; x < img.getWidth(); x++) {
				c = img.getRGB(x, y);
				if (Color.black.getRGB() != c) {
					System.out.print(" ");
					continue;
				}
				System.out.print("X");
			}
			System.out.println();
		}
	}
	public static void printBigText(String text, Font font) {
		String s = text;
		BufferedImage img = stringToBufferedImage(font, s);
		int c = 0;
		
		for (int y = 0; y < img.getHeight(); y++) {
			for (int x = 0; x < img.getWidth(); x++) {
				c = img.getRGB(x, y);
				if (Color.black.getRGB() != c) {
					System.out.print(" ");
					continue;
				}
				System.out.print("X");
			}
			System.out.println();
		}
	}
	public static void printBigText(String text, String fontName) {
		Font font = new Font(fontName, Font.PLAIN, 20);
		String s = text;
		BufferedImage img = stringToBufferedImage(font, s);
		int c = 0;
		
		for (int y = 0; y < img.getHeight(); y++) {
			for (int x = 0; x < img.getWidth(); x++) {
				c = img.getRGB(x, y);
				if (Color.black.getRGB() != c) {
					System.out.print(" ");
					continue;
				}
				System.out.print("X");
			}
			System.out.println();
		}
	}
	public static void printBigText(String text, String fontName, int fontSize) {
		Font font = new Font(fontName, Font.PLAIN, fontSize);
		String s = text;
		BufferedImage img = stringToBufferedImage(font, s);
		int c = 0;
		
		for (int y = 0; y < img.getHeight(); y++) {
			for (int x = 0; x < img.getWidth(); x++) {
				c = img.getRGB(x, y);
				if (Color.black.getRGB() != c) {
					System.out.print(" ");
					continue;
				}
				System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public static void newLines(int count) {
		for(int i = 0; i <= count; i++) {
			System.out.print("\n");
		}
	}
	
	
	
	private static BufferedImage stringToBufferedImage(Font font, String s) {
		BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g = img.getGraphics();
		g.setFont(font);
		FontRenderContext frc = g.getFontMetrics().getFontRenderContext();
		Rectangle2D rect = font.getStringBounds(s, frc);
		g.dispose();
		img = new BufferedImage((int) Math.ceil(rect.getWidth()), (int) Math.ceil(rect.getHeight()), BufferedImage.TYPE_4BYTE_ABGR);
		g = img.getGraphics();
		g.setColor(Color.black);
		g.setFont(font);
		FontMetrics fm = g.getFontMetrics();
		int x = 0;
		int y = fm.getAscent();
		g.drawString(s, x, y);
		g.dispose();
		return img;
	}
}
