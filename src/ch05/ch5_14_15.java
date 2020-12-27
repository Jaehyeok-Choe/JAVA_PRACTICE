package ch05;

public class ch5_14_15 {

	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(4);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1);
		String str4 = str.substring(1,str.length());
		
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
