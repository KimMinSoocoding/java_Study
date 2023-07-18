package chapter09;

public class Map {
	
	
	Tile[] tiles;
	{
		String str ="시작 > 방콕 > 보너스게임(동전던지기) > 베이징 > 포츈카드 > 독도 > 두바이 > 카이로 > 무인도 > 발리 > 도쿄 > 시드니 > 포츈카드 > 퀘백 > 하와이 > 상파울루 > 올림픽 > 프라하 > 푸켓 > 베를린 > 포츈카드 > 모스크바 > 제네바 > 로마 > 세계여행 > 타히티 > 런던 > 파리 > 포츈카드 > 뉴욕 > 국세청 > 서울";
		String[] strs = str.split(" > ");
		tiles = new Tile[strs.length];
		
		for(int i=0; i < tiles.length; i++) {
			if(i%4 == 0) {
				tiles[i] = new Event(strs[i]);
			}
			else {
				tiles[i] = new City(strs[i]);
			}
		}
	}
}
