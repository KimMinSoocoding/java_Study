package chapter17;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ProcessEx {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p1 = Runtime.getRuntime().exec("notepad"); //맥이라 윈도우 프로그램을 못찾아서 실행이 안되는것임
		Process p2 = Runtime.getRuntime().exec("mspaint");
		Process p3 = Runtime.getRuntime().exec("help");
		p1.waitFor();
		p2.destroy();
		InputStream is = p3.getInputStream();
		Reader reader = new InputStreamReader(is, "ms949");
		int b = 0;
		while((b = reader.read()) != -1){
			System.out.println((char)b);
		}
		
	}
}
