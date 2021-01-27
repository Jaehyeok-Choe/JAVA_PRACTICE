package ch09;

/*[�ڹ��� ���� - ������] ch9-1~3 ObjectŬ������ equals()
 * 
 * - ��� Ŭ������ �ְ� ����. ���� 11���� �޼��常�� ������ �ִ�. 
 * */

public class ch9_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		}else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
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