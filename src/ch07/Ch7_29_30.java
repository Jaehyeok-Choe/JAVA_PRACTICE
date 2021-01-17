package ch07;

/*[자바의 정석 - 기초편] ch7-29,30 여러 종류의 객체를 배열로 다루기
 * 
 * 다형성 장점 
 * 1. 다형적 매개변수
 * 2. 하나의 배열에 여러종류 객체저장
 * */

class Product2{
	int price;			// 제품의 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스점수
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
	}
}

class Tv2 extends Product2{
	public Tv2() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);	// Tv의 가격을 100만원으로 한다. 
	}
	
	//Object클래스의 toString()을 오버라이딩한다. 
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
	Product2[] cart = new Product2[10];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;	//Product배열에 사용될 카운터
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {			// 구매한 물품에 대한 정보를 요약해서 보여준다. 
		int sum = 0;			// 구입한 물품의 가격 합계
		String itemList = "";	// 구입한 물품목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null)break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum +"만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
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
