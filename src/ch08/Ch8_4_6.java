package ch08;

/*[자바의 정석 - 기초편] ch8-4~6 예외 처리하기, try-catch문의 흐름
 * 
 * - 예외가 발생하면, 이를 처리할 catch블럭을 찾아 내려감
 * - 일치하는 catch블럭이 없으면, 예외는 처리 안됨
 * - Exception이 선언된 catch 블럭은 모든 예외 처리(마지막 catch블럭)
 * 
 * */

public class Ch8_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
					System.out.println("true");
				}System.out.println("ArithmethicException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
