package ch07;

/** ���� ���(Single Inheritance)
 * 	// java�� ���ϻ�Ӹ��� ����Ѵ�.(C++�� ���߻�� ���)
 *  */
class MyPoint2 extends Object{	// ���
	int x;
	int y;
}

class Circle2 extends Object{	// ����
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
