package ch05;

public class Ex5_3 {

	public static void main(String[] args) {
		/* 
		 * Ch5-9 배열의 활용(2)
		 * [예제5-3] 최대값과 최소값/ 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다. 
		 * */
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다. 
		int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화 한다.
		
		for (int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}
}
