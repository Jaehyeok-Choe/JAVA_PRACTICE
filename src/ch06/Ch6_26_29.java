package ch06;

public class Ch6_26_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath3.add(200L, 100L));	// 클래스메서드 호출
		MyMath3 mm = new MyMath3();	// 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());	// 인스턴스메서드 호출
	}

}

class MyMath3{
	long a, b;	// iv
	
	long add() {	// 인스턴스메서드
		return a + b;	// iv
	}
	
	static long add(long a, long b) {	// 클래스메서드(static 메서드)
		return a + b;	// lv
	}
	
}