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
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equalsIgnoreCase(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", words[i][1]);
			}
		}
	}

}
