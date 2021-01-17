package ch07;

/*[�ڹ��� ���� - ������] ch7-29,30 ���� ������ ��ü�� �迭�� �ٷ��
 * 
 * ������ ���� 
 * 1. ������ �Ű�����
 * 2. �ϳ��� �迭�� �������� ��ü����
 * */

class Product2{
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);	// ���ʽ������� ��ǰ������ 10%
	}
}

class Tv2 extends Product2{
	public Tv2() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);	// Tv�� ������ 100�������� �Ѵ�. 
	}
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�. 
	public String toString() {return "Tv";}
}

class Computer2 extends Product2{
	public Computer2() {
		super(200);
	}
	
	public String toString() {return "Computer";}
}

class Audio2 extends Product2{
	public Audio2() {
		super(50);
	}
	
	public String toString() {return "Audio";}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;	//Product�迭�� ���� ī����
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {			// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�. 
		int sum = 0;			// ������ ��ǰ�� ���� �հ�
		String itemList = "";	// ������ ��ǰ���
		
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null)break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum +"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

public class Ch7_29_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
		
	}

}
