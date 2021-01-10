package ch07;

/**
 * 상속(Inheritance) 
 * - 자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화블럭 제외) 
 * - 자손의 멤버 개수는 조상보다 적을 수 없다. (같거나 많다.)
 * - 자손의 변경은 조상에 영향을 미치지 않는다. 
 */
/*
 * class Parent{ int age; }
 * 
 * class Child extends Parent{ void play() { System.out.println("놀자~"); } }
 * 
 * class Point{ int x; int y; }
 * 
 * class Point3D extends Point{ int z; }
 * 
 */

class Tv{
	boolean power;	// 전원상태(온/오프)
	int channel;	// 채널
	
	void power() {power = !power;}	
	void channelUp() {++channel;}	
	void channelDown() {--channel;}
}

class SmartTv extends Tv{				// SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;					// 캡션상태(온/오프)
	void displayCaption(String text) {
		if(caption) {					// 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

public class Ch7_1_2 {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;					// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();					// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");

	}

}
