package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class NaverTest {
	public static void main(String[] args) throws Exception {
		FileReader fis = new FileReader("/Users/minsoo/Desktop/오라클 학원/db정리 복사본.txt");
		FileOutputStream fos = new FileOutputStream("abcd.txt", true);
		int b = 0;
		int cnt = 0;
		while((b=fis.read()) != -1) {
			System.out.println(b);
			cnt ++;
			fos.write(b);
		}
		System.out.println(cnt + "bytes");
	}
}
