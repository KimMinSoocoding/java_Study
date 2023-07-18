package chapter09;

import java.util.Scanner;

public class MarbleEx {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	    
		Map map = new Map();
		
		Player[] players = new Player[2];
		players[0] = new Player("일론머스크");
		players[1] = new Player("빌게이츠");
		
		for(int i = 0 ;; i++) {
			Player p = players[i%2];
			System.out.println(players[i%2].name + "님의 차례 입니다. 엔터키를 입력하세요");
			scanner.nextLine();
			p.idx = (p.idx + p.roll()) % 32;
			System.out.println("현재 위치는" + map.tiles[p.idx].name +"입니다");
		}

	}
}
