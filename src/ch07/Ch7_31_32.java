package ch07;

/*[�ڹ��� ���� - ������] ch7-31,32 �߻� Ŭ����, �߻� �޼���
 * 
 * - �̿ϼ� ���赵. �̿ϼ� �޼��带 ���� �ִ� Ŭ����
 * - �ٸ� Ŭ���� �ۼ��� ������ �ֱ� ���� ��. �ν��Ͻ� ���� �Ұ�
 * - ����� ���� �߻� �޼��带 �ϼ��ؾ� �ν��Ͻ� ��������
 * */

abstract class Player{	// �߻� Ŭ����(�̿ϼ� Ŭ����, �̿ϼ� ���赵)
	abstract void play(int pos);	// �߻� �޼���(�̿ϼ� �޼���)
	abstract void stop();	// �߻� �޼���(����θ� �ְ� ������{}�� ���� �޼���)
}

// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos + "��ġ���� play�մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}
}

public class Ch7_31_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player ap = new AudioPlayer();	// ������
		ap.play(100);
		ap.stop();
	}

}
