package ch05;

import java.util.Arrays;

public class ch5_18_20 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		//2�����迭 for�� �ѹ����� ����ϱ�
		 for (int i = 0; i < score.length * score[0].length; i++) {
	            int row = i / score[0].length; // ��
	            int column = i % score[0].length; // ��
	            System.out.print(score[row][column] + "\t");
	 
	 
	            if (column == score[0].length - 1) {
	                System.out.println();
	            }
	        }
	}

}
