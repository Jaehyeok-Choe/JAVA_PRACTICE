package ch06;

public class Ch6_26_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath3.add(200L, 100L));	// Ŭ�����޼��� ȣ��
		MyMath3 mm = new MyMath3();	// �ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());	// �ν��Ͻ��޼��� ȣ��
	}

}

class MyMath3{
	long a, b;	// iv
	
	long add() {	// �ν��Ͻ��޼���
		return a + b;	// iv
	}
	
	static long add(long a, long b) {	// Ŭ�����޼���(static �޼���)
		return a + b;	// lv
	}
	
}