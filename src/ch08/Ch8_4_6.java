package ch08;

/*[�ڹ��� ���� - ������] ch8-4~6 ���� ó���ϱ�, try-catch���� �帧
 * 
 * - ���ܰ� �߻��ϸ�, �̸� ó���� catch���� ã�� ������
 * - ��ġ�ϴ� catch���� ������, ���ܴ� ó�� �ȵ�
 * - Exception�� ����� catch ���� ��� ���� ó��(������ catch��)
 * 
 * */

public class Ch8_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
					System.out.println("true");
				}System.out.println("ArithmethicException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
