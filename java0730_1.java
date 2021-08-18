package java07_4week;

import java.util.Arrays;

public class java0730_1 {
	
	public static void main(String[] args) {
		/* 1) 서로 다른 6개의 정수를 저장할 배열을 선언한다
		 * 2) 1~45 사이의 임의의 정수를 만든다.
		 * 3) 얻은 정수가 배열에 포함된 수인지 확인하고 포함되지 않은 정수만 배열에 저장한다
		 * 4) 같은 방법으로 서로 다른 6개의 수가 배열에 저장될 때까지 3)을 반복한다.
		 * 5) 배열을 오름차 순으로 정렬한다
		 */
		int[] lotto = new int[6]; //인덱스 0~5

		for( int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1; //랜덤한 숫자 6개 생성
			
			for ( int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { //로또 i번째칸이랑 i보다 작은 칸들의 인덱스랑 다 비교해서
					i--;				   //그 인덱스들이 서로 같지 않을 때 까지 반복한다.
					break;				   //인덱스가 같은 게 나오면 i 반복수를 줄이고, 해당 검열 반복문을 종료
				}
			}
		}
		Arrays.sort(lotto); //오름차 순 정렬 함수
		
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
	}

}
