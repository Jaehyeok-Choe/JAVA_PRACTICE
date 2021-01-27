package ch09;

/*[�ڹ��� ���� - ������] ch9-4~6 hashCode(), toString()
 * 
 * - ��ü�� �ؽ��ڵ带 ��ȯ�ϴ� �޼���
 * - ObjectŬ������ hashCode()�� ��ü�� �ּҸ� int�� ��ȯ�ؼ� ��ȯ
 * - equals()�� �������̵��ϸ� hashCode()�� �������̵��ؾ� �Ѵ�.
 * - equals()�� �ܷΰ��� true�� �� ��ü�� �ؽ��ڵ�� ���ƾ� �ϱ� ����. 
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