package ch08;

/*[자바의 정석 - 기초편] ch8-9,10 예외발생시키기*/

public class Ch8_9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	// Exception과 그 자손은 반드시 예외처리를 해줘야 한다.(필수)
			throw new Exception();	// Exception을 고의로 발생시킨다. 
		}catch(Exception e) {}
		// RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다.
		throw new RuntimeException();
	}

}
