package ch07;

/*[�ڹ��� ���� - ������] ch7-33,34 �߻�Ŭ�������ۼ�1
 * 
 * - ���� Ŭ������ ���������� ���� �� �ִ� �߻�Ŭ������ �ٷ� �ۼ��ϰų� ����Ŭ������ ���� �κ��� �̾Ƽ� �߻�Ŭ������ �����. 
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
		/* �������� ����Ѵ� */}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}

	void changeMode() {
		/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}

	void load() {
		/* ���õ� ����� �¿�� */}

	void unload() {
		/* ���õ� ����� ������ */}
}