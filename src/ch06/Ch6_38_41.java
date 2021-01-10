package ch06;

/**
 * 변수의 초기화 
 * - 지역변수(lv)는 수동초기화 해야함(사용전 꼭!!!)
 * - 멤버변수(iv, cv)는 자동 초기화된다.
 */
public class Ch6_38_41 {
	static int cv = 1;		// 명시적 초기화
	int iv = 1;				// 명시적 초기화
	
	static {cv=2;}			// 클래스 초기화 블럭
	{iv=2;} 				// 인스턴스 초기화 블럭
	
	public Ch6_38_41() {	// 생성자
		iv = 3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
