package ch07;

/** 단일 상속(Single Inheritance)
 * 	// java는 단일상속만을 허용한다.(C++은 다중상속 허용)
 *  */
class MyPoint2 extends Object{	// 상속
	int x;
	int y;
}

class Circle2 extends Object{	// 포함
	MyPoint2 p2;
	int r;
	
	Circle2(){
		p2 = new MyPoint2();
	}
}
public class Ch7_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c2 = new Circle2();
		System.out.println(c2.toString());
	}

}
