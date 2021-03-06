package ch06;

public class Ch6_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();	//Tv인스턴스를 생성한다.
		t.channel = 7;		//Tv인스턴스의 멤버변수 채널의 값을 7로
		t.channelDown();	//Tv인스턴스의 메서드 채널다운을 호출
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		// 객체마다 별도의 저장공간을 가진다. 
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}

class Tv{
	// Tv의 속성(멤버변수)
	String color;	// 색상
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	//Tv의 기능(메서드)
	void power() {power = !power;}	//TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}	//TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;}	//TV의 채널을 낮추는 기능을 하는 메서드
}
