package ch06;

public class ch6_17_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result = mm.max(5, 3);
		long result1 = mm.add(5, 3);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}

}

class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {return a / b;}
	
	//두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성
	long max(long a, long b) {
		long result = 0;
		result = a > b ? a : b;
		return result;
	}
}