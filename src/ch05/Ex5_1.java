package ch05;

import java.util.Arrays;	// ctrl+shift+o �ڵ����� import �߰�

public class Ex5_1 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub //int[] score; //1. �迭 score�� ����(��������)
		 * //score = new int[5]; //2. �迭�� ����(int������� x 5)
		 * 
		 * int[] score = new int[5]; // �迭�� ����� ������ ���ÿ� score[3] = 100;
		 * 
		 * for(int i = 0; i < score.length; i++) { System.out.println("score["+i+"] = "
		 * + score[i]); }
		 */
		
		//�迭�� ����
		int[] arr = new int[5];
		System.out.println("arr.length="+arr.length);		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]="+ arr[i]);
		}
		//�迭�� �ʱ�ȭ
		String[] stringArr = {"Hi","My","Name","Is","Ben"};
		for(int i = 0; i < stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		
		//�迭�� ���
		int[] iArr = {100,95,80,70,60};
		System.out.println(Arrays.toString(iArr));
		
		//�迭�� ������ ����
		int[] iArr2 = new int[10];
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(iArr2));
	}

}
