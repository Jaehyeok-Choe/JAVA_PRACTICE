package ch07;

/*[�ڹ��� ���� - ������] ch7-42~44 ����Ŭ������ ����, Ư¡, ����
 *
 *  - ���� Ŭ������ ����
 *  	1. ���� Ŭ�������� �ܺ� Ŭ������ ������� ���� ������ �� �ִ�. 
 *  	2. �ڵ��� ���⼺�� ���� �� �ִ�. (ĸ��ȭ)
 * */


class AAA{	//	AAA�� BBB�� ���� Ŭ����
	int i = 100;
	BBB b = new BBB();
	
	class BBB{	//	BBB�� AAA�� ���� Ŭ����
		void method() {
			/*
			 * AAA a = new AAA(); System.out.println(a.i);
			 */
			System.out.println(i);	//	��ü �������� �ܺ� Ŭ������ ��� ���ٰ���
		}
	}
}


/*
 * class CCC{ BBB b = new BBB(); }
 */

public class Ch7_42_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BBB b = new BBB(); b.method();
		 */
	}

}
