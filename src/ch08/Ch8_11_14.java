package ch08;

import java.io.*;

/*[�ڹ��� ���� - ������] ch8-11~14 ���ܼ����ϱ�, finally��*/

public class Ch8_11_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}	// main �޼����� ��
	
	static File createFile(String fileName) throws Exception{
		if(fileName==null || fileName.equals("")) {
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		}
		File f = new File(fileName);	// FileŬ������ ��ü�� �����.
		// File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		f.createNewFile();	
		return f;	// ������ ��ü�� ������ ��ȯ�Ѵ�.
		// createFile�޼����� ��
	}
	// Ŭ������ ��
}
