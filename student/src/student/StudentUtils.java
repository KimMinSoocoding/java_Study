package student;

import java.util.Scanner;

public class StudentUtils {
	private static Scanner scanner = new Scanner(System.in); // static 붙여주기 
	
	public static String nextLine(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
}
