package a.b;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
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
}
