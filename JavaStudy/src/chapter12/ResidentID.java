package chapter12;

import java.time.Month;
import java.util.Scanner;

public class ResidentID {
	public static void main(String[] args) {
		String result ="";
		int[] lastDate = {31,28,31,30,31,30,31,31,30,31,30,31}; 

//		int year = (int)(Math.random()*100);
		int year = getNumberRange(100,1);
//		result += year < 10 ? "0" + year : year;
		result += addLeadZero(year);
		
//		int month = (int)(Math.random()*12) +1;
		int month = getNumberRange(12,1);
//		result += month < 10 ? "0" +month : month;
		result += addLeadZero(month);
		
		
//		int date = (int)(Math.random() * lastDate[month-1]) +1;
		int date = getNumberRange(lastDate[month-1],1);
//		result += date < 10 ? "0" +date : date;
		result += addLeadZero(date);
		
		System.out.println(result);
		
		int num = getNumberRange(4,1);
		if(num >= 3 && year >= 23) {
			 num /= 2;
		}
		result += "-" + num;
		
		System.out.println(result);
		
		num = getNumberRange(100000, 0);
		
		System.out.println(num);
		
		int tmp = num;
		int cnt = 0;
		while(num != 0) {
			num = num/10;
			cnt++;
//			System.out.println(num);
		}
//		System.out.println(cnt);
		
		for(int i = 0 ; i<5 -cnt ; i++ ) {
			result += "0";
		}
		result += tmp;
		System.out.println(result);
		
		// 검증용번호 
		// X=(11−(2A+3B+4C+5D+6E+7F+8G+9H+2I+3J+4K+5L)mod11)mod10 
		int sum = 0;
		int[] multiply = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for(int i=0; i<result.length(); i++) {
			if(i != 6) {
				
				int n = result.charAt(i)-'0';
//				System.out.println(n);
				sum += n * multiply[i];
			}
		}
		System.out.println(sum);
		sum = (11 -sum % 11) % 10;
		result += sum;
		System.out.println(result);
		
	}
	
	
	static int getNumberRange(int range, int suffix) {
		return (int)(Math.random() * range) +suffix;
	}
	static String addLeadZero(int value) {
		return value <10 ? "0" + value : value+"";
	}
}


