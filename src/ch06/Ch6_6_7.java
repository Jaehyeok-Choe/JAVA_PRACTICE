package ch06;

public class Ch6_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();	//Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;		//Tv�ν��Ͻ��� ������� ä���� ���� 7��
		t.channelDown();	//Tv�ν��Ͻ��� �޼��� ä�δٿ��� ȣ��
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
		// ��ü���� ������ ��������� ������. 
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}

}

class Tv{
	// Tv�� �Ӽ�(�������)
	String color;	// ����
	boolean power;	// ��������(on/off)
	int channel;	// ä��
	
	//Tv�� ���(�޼���)
	void power() {power = !power;}	//TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}	//TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}	//TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}
