package a.b;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class IO {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static Scanner scn = new Scanner(System.in);
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void out(Object o) {
		System.out.println(o);
	}
	public static void outnl(Object o) {
		System.out.print(o);
	}
	public static void prl() {
		System.out.print("\n");
	}
	public static String in() {
		try {
			return in.readLine();
		} catch(Exception e) {e.printStackTrace();}
		return null;
	}
	public static double readDouble(String prompt, String incorrectMessage) {
		out(prompt);
		double val;
		while(true) {
			try {
				val = scn.nextDouble();
				break;
			} catch(InputMismatchException ex) {
				outnl(incorrectMessage);
			}
		}
		return val;
	}
	public static double readDouble(String prompt) {
		out(prompt);
		double val;
		while(true) {
			try {
				val = scn.nextDouble();
				break;
			} catch(InputMismatchException ex) {
				outnl("You need to input a double value.");
			}
		}
		return val;
	}
	public static int readInt(String prompt, String incorrectMessage) {
		out(prompt);
		int val;
		while(true) {
			try {
				val = scn.nextInt();
				break;
			} catch(InputMismatchException ex) {
				outnl(incorrectMessage);
			}
		}
		return val;
	}
	public static int readInt(String prompt) {
		out(prompt);
		int val;
		while(true) {
			try {
				val = scn.nextInt();
				break;
			} catch(InputMismatchException ex) {
				outnl("You need to input an integer value.");
			}
		}
		return val;
	}
	public static boolean readBoolean(String prompt, String incorrectMessage) {
		out(prompt);
		boolean val;
		while(true) {
			try {
				val = scn.nextBoolean();
				break;
			} catch(InputMismatchException ex) {
				outnl(incorrectMessage);
			}
		}
		return val;
	}
	public static boolean readBoolean(String prompt) {
		out(prompt);
		boolean val;
		while(true) {
			try {
				val = scn.nextBoolean();
				break;
			} catch(InputMismatchException ex) {
				outnl("You need to input a boolean value.");
			}
		}
		return val;
	}
	
	public static void printPicture(String path) {
		try {
			BufferedImage in = ImageIO.read(new File(path));
			BufferedImage imgUnscled = new BufferedImage(in.getWidth(), in.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
			Graphics2D g = imgUnscled.createGraphics();
			g.drawImage(in, 0, 0, null);
			g.setBackground(Color.white);
			g.dispose();
			BufferedImage img = scale(imgUnscled, BufferedImage.TYPE_4BYTE_ABGR, 125, 50, 125D/imgUnscled.getWidth(), 50D/imgUnscled.getHeight());
			int c = 0;
			for(int y = 0; y < img.getHeight(); y++) {
				for(int x = 0; x < img.getWidth(); x++) {
					c = img.getRGB(x, y);
					if(c == Color.white.getRGB()) {
						System.out.print(" ");
						continue;
					}
					System.out.print("X");
				}
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static BufferedImage scale(BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
	    BufferedImage dbi = null;
	    if(sbi != null) {
	        dbi = new BufferedImage(dWidth, dHeight, imageType);
	        Graphics2D g = dbi.createGraphics();
	        AffineTransform at = AffineTransform.getScaleInstance(fWidth, fHeight);
	        g.drawRenderedImage(sbi, at);
	    }
	    return dbi;
	}
}
