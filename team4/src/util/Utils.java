package util;

import java.util.Scanner;

public class Utils {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
}
