package ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] score;				//1. �迭 score�� ����(��������)
		//score = new int[5];		//2. �迭�� ����(int������� x 5)
		
		int[] score = new int[5];	// �迭�� ����� ������ ���ÿ�
		score[3] = 100;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score["+i+"] = " + score[i]);
		}		
	}

}
