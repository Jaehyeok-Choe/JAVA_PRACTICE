package ch07;

/*[자바의 정석 - 기초편] ch7-39 인터페이스의장점1
 * 
 * - 두 대상(객체) 간의 '연결,대화,소통'을 돕는 '중간 역할'을 한다. 
 * - 선언(설계)와 구현을 분리시킬 수 있게 한다. 
 * - 인터페이스 덕분에 B가 변경되어도 A는 안바꿀 수 있게 된다.(느슨한 결합)
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
