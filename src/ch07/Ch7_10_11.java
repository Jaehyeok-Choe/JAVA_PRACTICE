package ch07;
/*[�ڹ��� ���� - ������] ch7-10,11 �������� super, ������ super()
 * 
 * super() - ������ ������
 * - �������� ù �ٿ� �ݵ�� �����ڸ� ȣ���ؾ��Ѵ�.
 * - �׷��� ������ �����Ϸ��� �������� ù �ٿ� super();�� ����
 * */

class Point5{
	int x;
	int y;
	
	Point5(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y; 
	}
}

class Point5D extends Point5{
	int z;
	
	Point5D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {	//�������̵�
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}

public class Ch7_10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point5D p = new Point5D(1,2,3);
	}

}
