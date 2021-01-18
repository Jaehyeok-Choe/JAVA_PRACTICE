package ch07;

/*[자바의 정석 - 기초편] ch7-33,34 추상클래스의작성1
 * 
 * - 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다. 
 * */

public class Ch7_33_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		group[0].move(100, 200);
		group[1].move(100, 200);
		group[2].move(100, 200);
	}

}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}

	void stimPack() {
		/* 스팀팩을 사용한다 */}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}

	void load() {
		/* 선택된 대상을 태운다 */}

	void unload() {
		/* 선택된 대상을 내린다 */}
}