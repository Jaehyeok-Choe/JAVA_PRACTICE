package ch07;

/*[�ڹ��� ���� - ������] ch7-39 �������̽�������1
 * 
 * - �� ���(��ü) ���� '����,��ȭ,����'�� ���� '�߰� ����'�� �Ѵ�. 
 * - ����(����)�� ������ �и���ų �� �ְ� �Ѵ�. 
 * - �������̽� ���п� B�� ����Ǿ A�� �ȹٲ� �� �ְ� �ȴ�.(������ ����)
 * */

class A{
	public void method(I i) {
		i.method();
	}
}

interface I{
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I{
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}

public class Ch7_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method(new C());
	}

}
