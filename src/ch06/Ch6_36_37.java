package ch06;

/**
 * ������ this() 
 * - �����ڿ��� �ٸ� ������ ȣ���� �� ��� 
 * - �ٸ� ������ ȣ��� ù �ٿ����� ��밡��
 * - this�� this()�� ����ϰ� ������ �� ������ �ٸ� ���̴�. this�� '���� ����'�̰�, this()�� '������'�̴�. 
 */
class Car3{
	String color;
	String gearType;
	int door;
	
	Car3() {
		this("white", "auto", 4);
	}
	
	Car3(String color){
		 
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class Ch6_36_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
