package ch07;

/*
 * �������̵�(OVERRIDING) - ��ӹ��� ������ �޼��带 �ڽſ��� �°� �����ϴ� ��
 * �������̵��� ���� 
 * - ����ΰ� ���� Ŭ������ �޼���� ��ġ�ؾ� �Ѵ�.
 * - ���� �����ڸ� ���� Ŭ������ �޼��庸�� ���� ������ ������ �� ����.
 * - ���ܴ� ���� Ŭ������ �޼��庸�� ���� ������ �� ����.  
 * 
 * �����ε� vs �������̵�
 * �����ε� - ������ ���� ���ο� �޼��带 �����ϴ°�(new)
 * �������̵� - ��ӹ��� �޼����� ������ �����ϴ°�(change, modify)
 * 
 * class Parent{
 * 		void parentMethod(){}
 * }
 * 
 * class Child extends Parent{
 * 		void parentMethod(){}		=	�������̵�
 * 		void parentMethod(int i){}	=	�����ε�
 * 
 * 		void childMethod(){}		=	�޼��� ����
 * 		void childMethod(int i){}	=	�����ε�
 * 		void childMethod(){}		=	�ߺ�����
 */

class MyPoint4{
	int x;
	int y;
	
	MyPoint4(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

/*
 * class MyPoint3D extends MyPoint4{ int z; //������ getLocation()�� �������̵� String
 * getLocation() { return "x: " + x + ", y: " + y + ", z: " + z; } }
 */
public class Ch7_7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint4 p = new MyPoint4(3,5);
		System.out.println(p);
	}

}
