package ch05;

import java.util.Arrays;

public class ch5_24 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"ccc","bbb"},{"aaa", "bbb"}};
		String[][] str2D2 = {{"aaa","bbb"},{"aaa", "bbb"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {3,5,7,1,2};
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}

}
