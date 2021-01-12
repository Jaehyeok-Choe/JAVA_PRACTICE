package ch07;
/*[자바의 정석 - 기초편] ch7-10,11 참조변수 super, 생성자 super()
 * 
 * super() - 조상의 생성자
 * - 생성자의 첫 줄에 반드시 생성자를 호출해야한다.
 * - 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입
 * */

class Point5{
	int x;
	int y;
	
	Point5(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y; 
	}
}

class Point5D extends Point5{
	int z;
	
	Point5D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {	//오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}

public class Ch7_10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point5D p = new Point5D(1,2,3);
	}

}
