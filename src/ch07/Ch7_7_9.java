package ch07;

/*
 * 오버라이딩(OVERRIDING) - 상속받은 조상의 메서드를 자신에게 맞게 변경하는 것
 * 오버라이딩의 조건 
 * - 선언부가 조상 클래스의 메서드와 일치해야 한다.
 * - 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 * - 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.  
 * 
 * 오버로딩 vs 오버라이딩
 * 오버로딩 - 기존에 없는 새로운 메서드를 정의하는것(new)
 * 오버라이딩 - 상속받은 메서드의 내용을 변경하는것(change, modify)
 * 
 * class Parent{
 * 		void parentMethod(){}
 * }
 * 
 * class Child extends Parent{
 * 		void parentMethod(){}		=	오버라이딩
 * 		void parentMethod(int i){}	=	오버로딩
 * 
 * 		void childMethod(){}		=	메서드 정의
 * 		void childMethod(int i){}	=	오버로딩
 * 		void childMethod(){}		=	중복정의
 */

class MyPoint4{
	int x;
	int y;
	
	MyPoint4(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

/*
 * class MyPoint3D extends MyPoint4{ int z; //조상의 getLocation()을 오버라이딩 String
 * getLocation() { return "x: " + x + ", y: " + y + ", z: " + z; } }
 */
public class Ch7_7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint4 p = new MyPoint4(3,5);
		System.out.println(p);
	}

}
