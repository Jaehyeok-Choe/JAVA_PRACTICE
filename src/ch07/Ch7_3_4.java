package ch07;

/*
*포함 관계
	- 포함(composite)이란?
	- 클래스의 멤버로 참조변수를 선언하는 것
	- 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다
	
*클래스 간의 관계 결정하기
	- 상속관계 '~은 ~이다.(is-a)'
	- 포함관계 '~은 ~을 가지고 있다.(has-a)'
*/

class MyPoint{
	int x;
	int y;
}

/*
 * class Circle extends MyPoint{ int r; }	// 상속
 */

class Circle{								// 포함
	MyPoint p = new MyPoint();
	int r;
}

public class Ch7_3_4 {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		/*
		 * c.x = 1; c.y = 2; c.r = 3;
		 */
		
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.x = " + c.p.x);
		System.out.println("c.y = " + c.p.y);
		System.out.println("c.r = " + c.r);

	}

}
