package java07_4week;

import java.util.Arrays;

public class java0730_1 {
	
	public static void main(String[] args) {
		/* 1) ���� �ٸ� 6���� ������ ������ �迭�� �����Ѵ�
		 * 2) 1~45 ������ ������ ������ �����.
		 * 3) ���� ������ �迭�� ���Ե� ������ Ȯ���ϰ� ���Ե��� ���� ������ �迭�� �����Ѵ�
		 * 4) ���� ������� ���� �ٸ� 6���� ���� �迭�� ����� ������ 3)�� �ݺ��Ѵ�.
		 * 5) �迭�� ������ ������ �����Ѵ�
		 */
		int[] lotto = new int[6]; //�ε��� 0~5

		for( int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1; //������ ���� 6�� ����
			
			for ( int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { //�ζ� i��°ĭ�̶� i���� ���� ĭ���� �ε����� �� ���ؼ�
					i--;				   //�� �ε������� ���� ���� ���� �� ���� �ݺ��Ѵ�.
					break;				   //�ε����� ���� �� ������ i �ݺ����� ���̰�, �ش� �˿� �ݺ����� ����
				}
			}
		}
		Arrays.sort(lotto); //������ �� ���� �Լ�
		
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
	}

}
