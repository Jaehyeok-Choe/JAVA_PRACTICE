package ch06;

public class Ch6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}

class Data{int x;}