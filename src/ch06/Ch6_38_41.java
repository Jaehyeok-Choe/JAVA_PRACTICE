package ch06;

/**
 * ������ �ʱ�ȭ 
 * - ��������(lv)�� �����ʱ�ȭ �ؾ���(����� ��!!!)
 * - �������(iv, cv)�� �ڵ� �ʱ�ȭ�ȴ�.
 */
public class Ch6_38_41 {
	static int cv = 1;		// ����� �ʱ�ȭ
	int iv = 1;				// ����� �ʱ�ȭ
	
	static {cv=2;}			// Ŭ���� �ʱ�ȭ ��
	{iv=2;} 				// �ν��Ͻ� �ʱ�ȭ ��
	
	public Ch6_38_41() {	// ������
		iv = 3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
