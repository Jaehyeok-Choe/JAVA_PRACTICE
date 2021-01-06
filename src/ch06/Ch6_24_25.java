package ch06;

public class Ch6_24_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Data2 d = new Data2(); d.x = 10; System.out.println("main() : x = " + d.x);
		 * 
		 * change(d); System.out.println("After change(d)");
		 * System.out.println("main() : x = " + d.x);
		 */
		
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d2.x = " + d.x);
		System.out.println("d3.x = " + d2.x);
	}
	
	
	static void change(Data2 d) {	// 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x + " + d.x);
	}
	
	static Data3 copy(Data3 d) {	// 참조형 반환타입
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	}
}

class Data2{
	int x;
}

class Data3{
	int x;
}