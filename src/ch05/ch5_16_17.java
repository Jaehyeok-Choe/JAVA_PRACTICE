package ch05;

import java.util.Arrays;

public class ch5_16_17 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수:" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"] = \""+ args[i] + "\"");
		}
	}

}
