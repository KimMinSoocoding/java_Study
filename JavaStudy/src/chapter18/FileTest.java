package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;

public class FileTest {
	public static void main(String[] args) throws Exception {
//		FileReader fis = new FileReader("/Users/minsoo/Desktop/오라클 학원/db정리 복사본.txt");
		URL url = new URL("https://www.naver.com");
		InputStream fis = url.openStream();
		
		FileOutputStream fos = new FileOutputStream("/Users/minsoo/Desktop/abcd.html", true);
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
