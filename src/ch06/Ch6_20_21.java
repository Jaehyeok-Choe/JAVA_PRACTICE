package ch06;

public class Ch6_20_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath2 gugudan = new MyMath2();
		gugudan.printGugudan(2);
	}

}

class MyMath2{
	void printGugudan(int dan) {
		if(!(2 <= dan && dan <= 9))
			return;
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
}