package ch06;

/**
 * 생성장 this() 
 * - 생성자에서 다른 생성자 호출할 때 사용 
 * - 다른 생성자 호출시 첫 줄에서만 사용가능
 * - this와 this()는 비슷하게 생겼을 뿐 완전히 다른 것이다. this는 '참조 변수'이고, this()는 '생성자'이다. 
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
