package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		/* 
		 * Ch5-10 �迭�� Ȱ��(3)
		 * [����5-4,5] �迭�� ����� ������ �ݺ��ؼ� �ٲ۴�. (���� ����, �ζǹ�ȣ ����) 
		 * */
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10); // 0~9 ���� �� ���� ���Ƿ� ��´�.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
	}
}
