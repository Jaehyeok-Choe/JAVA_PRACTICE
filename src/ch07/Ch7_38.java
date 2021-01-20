package ch07;

/*[�ڹ��� ���� - ������] ch7-38�������̽��� ������*/

abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�.");}
}

interface Fightable2{
	void move(int x, int y);	// public abstract�� ������
	void attack(Fightable2 f);	// public abstract�� ������
}

class Fighter2 extends Unit2 implements Fightable2{
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	
	public void attack(Fightable2 f) {
		System.out.println(f+"�� ����");
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
