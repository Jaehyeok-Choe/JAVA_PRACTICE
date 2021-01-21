package ch07;

/*[자바의 정석 - 기초편] ch7-39 인터페이스의장점1
 * 
 * - 두 대상(객체) 간의 '연결,대화,소통'을 돕는 '중간 역할'을 한다. 
 * - 선언(설계)와 구현을 분리시킬 수 있게 한다. 
 * - 인터페이스 덕분에 B가 변경되어도 A는 안바꿀 수 있게 된다.(느슨한 결합)
 * */

/*[자바의 정석 - 기초편] 7-40,41 디폴트 메서드와 static메서드에 대한 강의입니다. 객체지향개념의 마지막 강의
 * 
 * - 인터페이스에 디폴트 메서드, static메서드 추가가능
 * - 인터페이스에 새로운 메서드(추상 메서드)를 추가하기 어려움
 * 			해결책 => 디폴트 메서드(default method)
 * - 디폴트 메서드는 인스턴스 메서드(인터페이스 원칙 위반)
 * - 디폴트 메서드가 기존의 메서드와 충돌할 때의 해결책
 * 		1. 여러 인터페이스의 디폴트 메서드 간의 충돌
 * 			- 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
 * 		2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
 * 			- 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다. 
 * */


class A{
	public void method(I i) {
		i.method();
	}
}

interface I{
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class Ch7_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method(new C());
	}

}
