package ch07;

public class Ch7_24_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	//car = (Car)fe;���� ����ȯ�� ������
		//car.water();		// ������ ����!! CarŸ���� ���������δ� water()�� ȣ���� �� ����. 
		fe2 = (FireEngine)car;	// �ڼ�Ÿ�� <- ����Ÿ��(����ȯ ���� �Ұ�)
		fe2.water();
		
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}