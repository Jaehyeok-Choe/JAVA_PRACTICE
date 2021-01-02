package ch06;

import java.util.Scanner;

public class Ch6_14_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum = 0;
		System.out.println("Enter first number: ");
		firstNum = sc.nextInt();
		System.out.println("Enter second number: ");
		secondNum = sc.nextInt();
		System.out.println("First input + Second input = " + add(firstNum,secondNum));
		System.out.println("First input x Second input = " + multiply(firstNum,secondNum));
	}
	
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

}
