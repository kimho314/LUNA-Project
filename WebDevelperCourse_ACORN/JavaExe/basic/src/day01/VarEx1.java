package day01;

// VarEx1 Ŭ���� ����
public class VarEx1 {
	// main �޼ҵ� ����
	public static void main(String[] args) {
		// ���� 
		// �ڷ��� ������;
		
		// byteŸ�� ���� b�� 10 �Ҵ�
		byte b;
		b = 10;
		// ȭ�鿡 ���� b�� �� 10 ���
		System.out.println(b);
		
		// ���� b�� 10 + 1�� ������� byteŸ������ ��ȯ �� �Ҵ�
		b = (byte) (b+1);
		// ȭ�鿡 11 ���
		System.out.println(b);
		
		//32��Ʈ ũ���� ������ �����ϴ� c��� ������ �����ϰ�
		int c;
		//c������ 100���� ����
		c = 100;
		//c������ �巷�ִ� ���¤� ȭ�鿡 ���
		System.out.println(c);
		
		// ������ �����ϸ鼭 �ٷ� ���� ���� : �ʱ�ȭ
		int d = 200;
		// d = d+1;
		System.out.println(d);
		
		// 16��Ʈ ũ���� k��� ������ 30���� ����
		short k = 30;
		// k ȭ�鿡 ���
		System.out.println(k);
		// 64 ��Ʈ ũ����  m��� ������ 1000���� ����
		long m = 1000;
		// m ȭ�鿡 ����
		System.out.println(m);
	}
}
