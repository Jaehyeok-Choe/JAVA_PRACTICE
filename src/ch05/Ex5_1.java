package ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] score;				//1. 배열 score를 선언(참조변수)
		//score = new int[5];		//2. 배열의 생성(int저장공간 x 5)
		
		int[] score = new int[5];	// 배열의 선언과 생성을 동시에
		score[3] = 100;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score["+i+"] = " + score[i]);
		}		
	}

}
