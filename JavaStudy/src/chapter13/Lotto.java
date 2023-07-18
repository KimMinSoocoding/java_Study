package chapter13;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {	
	public static void main(String[] args) {
		// set은 집합이고 가장큰 특징은 중복 안됨 
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 6) {
			lotto.add(new Random().nextInt(45)+1);
		}
		System.out.println(lotto);
	}

}
