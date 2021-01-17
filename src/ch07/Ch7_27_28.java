package ch07;
/*[�ڹ��� ���� - ������] ch7-27,28 �Ű�����������*/

class Product{
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);	// ���ʽ������� ��ǰ������ 10%
	}
}

class Tv1 extends Product{
	public Tv1() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);	// Tv�� ������ 100�������� �Ѵ�. 
	}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�. 
	public String toString() {return "Tv";}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	
	public String toString() {return "Computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}

public class Ch7_27_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
		
	}

}
