package ch07;

/*
*���� ����
	- ����(composite)�̶�?
	- Ŭ������ ����� ���������� �����ϴ� ��
	- ���� ������ Ŭ������ �����, �� ���� �����ؼ� Ŭ������ �����
	
*Ŭ���� ���� ���� �����ϱ�
	- ��Ӱ��� '~�� ~�̴�.(is-a)'
	- ���԰��� '~�� ~�� ������ �ִ�.(has-a)'
*/

class MyPoint{
	int x;
	int y;
}

/*
 * class Circle extends MyPoint{ int r; }	// ���
 */

class Circle{								// ����
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
