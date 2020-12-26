package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class ch5_21_23 {

	public static void main(String[] args) {
		/*
		 * int[][] score = { {100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}
		 * }; int sum = 0;
		 * 
		 * for (int i = 0; i < score.length; i++) { for (int j = 0; j < score[i].length;
		 * j++) { System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
		 * 
		 * sum += score[i][j]; } } System.out.println("sum=" + sum);
		 */
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equalsIgnoreCase(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.", words[i][1]);
			}
		}
	}

}
