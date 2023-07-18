package chapter11;

import java.sql.SQLException;

public class ExceptionEx02 {
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
//		static void m1() throws Exception {
//			throw new Exception(); // 리턴타입같은 개념
//		}
		static void m1() {
			SQLException sql = new SQLException();
			try {
				throw sql;
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		}
	
}
