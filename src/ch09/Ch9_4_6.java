package ch09;

/*[자바의 정석 - 기초편] ch9-4~6 hashCode(), toString()
 * 
 * - 객체의 해시코드를 반환하는 메서드
 * - Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
 * - equals()를 오버라이딩하면 hashCode()도 오버라이딩해야 한다.
 * - equals()의 겨로가가 true인 두 객체의 해시코드는 같아야 하기 때문. 
 * */

public class Ch9_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}


class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "Kind:" + kind + ", number:" + number;
	}
}