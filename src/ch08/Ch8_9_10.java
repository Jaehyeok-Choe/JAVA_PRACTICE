package ch08;

/*[�ڹ��� ���� - ������] ch8-9,10 ���ܹ߻���Ű��*/

public class Ch8_9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	// Exception�� �� �ڼ��� �ݵ�� ����ó���� ����� �Ѵ�.(�ʼ�)
			throw new Exception();	// Exception�� ���Ƿ� �߻���Ų��. 
		}catch(Exception e) {}
		// RuntimeException�� �� �ڼ��� ����ó���� ������ �ʾƵ� �������� �ȴ�.
		throw new RuntimeException();
	}

}
