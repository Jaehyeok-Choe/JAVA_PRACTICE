package ch07;

/*[자바의 정석 - 기초편] ch7-38인터페이스와 다형성*/

abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable2{
	void move(int x, int y);	// public abstract가 생략됨
	void attack(Fightable2 f);	// public abstract가 생략됨
}

class Fighter2 extends Unit2 implements Fightable2{
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	
	public void attack(Fightable2 f) {
		System.out.println(f+"를 공격");
	}
}
public class Ch7_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter2 f  = new Fighter2();
		f.move(100, 200);
		f.attack(new Fighter2());
	}

}
