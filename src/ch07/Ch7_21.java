package ch07;

class MyParent{
	private 	int prv;	// ���� Ŭ����
				int dft;	// ���� ��Ű��
	protected 	int prt;	// ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public 		int pub;	// �������� ����.
	
	public void printMembers() {
		System.out.println(prv);	// ok
		System.out.println(dft);	// ok
		System.out.println(prt);	// ok
		System.out.println(pub);	// ok
	}
}

public class Ch7_21 {

	public static void main(String[] args) {
	
		MyParent p = new MyParent();
		/* System.out.println(p.prv);  ���������ڰ� private�̱� ������ ������*/
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);

	}

}
