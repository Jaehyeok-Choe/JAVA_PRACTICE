//���Ŭ������ �ϳ� �̻��� �����ڸ� ������.

package ch06;

class Data_1{
	int value;
	// Data_1(){} // �⺻�����ڸ� �߰�
}

class Data_2{
	int value;
	
	Data_2(){}	// �⺻ ������
	
	Data_2(int x){	// �Ű������� �ִ� ������
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
