//모든클래스는 하나 이상의 생성자르 가진다.

package ch06;

class Data_1{
	int value;
	// Data_1(){} // 기본생성자를 추가
}

class Data_2{
	int value;
	
	Data_2(){}	// 기본 생성자
	
	Data_2(int x){	// 매개변수가 있는 생성자
		value = x;
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}


public class Ch6_32_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
		Car c = new Car("White","auto",4);
		System.out.println("c's color: " + c.color + " / gear type: " + c.gearType + " / door: " + c.door);
	}

}
