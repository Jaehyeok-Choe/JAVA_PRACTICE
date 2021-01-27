package ch09;

/*[자바의 정석 - 기초편] ch9-1~3 Object클래스와 equals()
 * 
 * - 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다. 
 * */

public class ch9_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		Value v = (Value)obj;
		
		return this.value==v.value;
	}
}