package ch05;

import java.util.Arrays;	// ctrl+shift+o 자동으로 import 추가

public class Ex5_1 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub //int[] score; //1. 배열 score를 선언(참조변수)
		 * //score = new int[5]; //2. 배열의 생성(int저장공간 x 5)
		 * 
		 * int[] score = new int[5]; // 배열의 선언과 생성을 동시에 score[3] = 100;
		 * 
		 * for(int i = 0; i < score.length; i++) { System.out.println("score["+i+"] = "
		 * + score[i]); }
		 */
		
		//배열의 길이
		int[] arr = new int[5];
		System.out.println("arr.length="+arr.length);		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]="+ arr[i]);
		}
		//배열의 초기화
		String[] stringArr = {"Hi","My","Name","Is","Ben"};
		for(int i = 0; i < stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		
		//배열의 출력
		int[] iArr = {100,95,80,70,60};
		System.out.println(Arrays.toString(iArr));
		
		//배열에 랜덤값 세팅
		int[] iArr2 = new int[10];
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(iArr2));
	}

}
