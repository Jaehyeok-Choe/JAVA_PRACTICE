package ch09;

/*[자바의 정석 - 기초편] ch9-7~10 String클래스, 문자열 비교, 빈 문자열*/
/*[자바의 정석 - 기초편] ch9-11 String생성자*/

public class Ch9_7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		
		char c = s.charAt(3);
		System.out.println(c);
		
		String s2 = s.concat(" World!");
		System.out.println(s2);
		
		boolean b = s.contains("el");
		System.out.println(b);
		
		int length = s.length();
		System.out.println(length);
		
		String file = "Hello.txt";
		boolean b2 = file.endsWith(".txt");
		System.out.println(b2);
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String p = s.substring(1,5);
		System.out.println(p);
	}

}
