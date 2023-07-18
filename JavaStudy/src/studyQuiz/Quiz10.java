package studyQuiz;

import java.util.Arrays;

public class Quiz10 {
	public static void main(String[] args) {
		
		//버블정렬 :  모르겠습니다 ....................... 쩜쩜 ..... 
		
		// 배열 정렬하기 (오름차순) 버블정렬 
		// 시간복잡도 , 빅o
		int[] arr = {5,4,1,3,2};
		
		for(int j = 0 ; j <arr.length - 1 ; j++) {
			boolean change = false;
			int cnt = 0; 
			for(int i = 0; i < arr.length -1 - j; i++) {
				if(arr[i] > arr[i+1]) {
					int tmp1 = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp1; 
					change = true;
					cnt++;
				}
			}
			if(!change) break;
			System.out.println(j + 1 + "회차 ::" + Arrays.toString(arr)+ cnt + "번 이동");
		}
		
	}
}
