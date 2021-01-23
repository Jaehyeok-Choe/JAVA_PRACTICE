package ch07;

/*[자바의 정석 - 기초편] ch7-42~44 내부클래스의 종류, 특징, 선언
 *
 *  - 내부 클래스의 장점
 *  	1. 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 
 *  	2. 코드의 복잡성을 줄일 수 있다. (캡슐화)
 * */


class AAA{	//	AAA는 BBB의 내부 클래스
	int i = 100;
	BBB b = new BBB();
	
	class BBB{	//	BBB는 AAA의 내부 클래스
		void method() {
			/*
			 * AAA a = new AAA(); System.out.println(a.i);
			 */
			System.out.println(i);	//	객체 생성없이 외부 클래스의 멤버 접근가능
		}
	}
}


/*
 * class CCC{ BBB b = new BBB(); }
 */

public class Ch7_42_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BBB b = new BBB(); b.method();
		 */
	}

}
