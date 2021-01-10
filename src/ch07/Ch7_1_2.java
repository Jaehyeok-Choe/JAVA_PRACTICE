package ch07;

/**
 * ���(Inheritance) 
 * - �ڼ��� ������ ��� ����� ��ӹ޴´�.(������, �ʱ�ȭ�� ����) 
 * - �ڼ��� ��� ������ ���󺸴� ���� �� ����. (���ų� ����.)
 * - �ڼ��� ������ ���� ������ ��ġ�� �ʴ´�. 
 */
/*
 * class Parent{ int age; }
 * 
 * class Child extends Parent{ void play() { System.out.println("����~"); } }
 * 
 * class Point{ int x; int y; }
 * 
 * class Point3D extends Point{ int z; }
 * 
 */

class Tv{
	boolean power;	// ��������(��/����)
	int channel;	// ä��
	
	void power() {power = !power;}	
	void channelUp() {++channel;}	
	void channelDown() {--channel;}
}

class SmartTv extends Tv{				// SmartTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption;					// ĸ�ǻ���(��/����)
	void displayCaption(String text) {
		if(caption) {					// ĸ�� ���°� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
}

public class Ch7_1_2 {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;					// ���� Ŭ�����κ��� ��ӹ��� ���
		stv.channelUp();					// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");

	}

}
