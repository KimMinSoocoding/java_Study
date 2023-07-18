package chapter18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DateTest {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("pi.txt"));
		dos.writeInt(10);
//		dos.writeDouble(Math.PI);
	}
}
