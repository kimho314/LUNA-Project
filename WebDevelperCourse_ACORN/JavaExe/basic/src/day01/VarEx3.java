package day01;

// VarEx3 Ŭ���� ����
public class VarEx3 {
	// main �޼ҵ� ����
	static public void main(String[] args) {
		
		// byteŸ�� ���� b1, b2�� ���� 10, 20�Ҵ�
		byte b1 = 10;
		byte b2 = 20;
		// intŸ�� ���� c�� b1�� b2�� �Ҵ�� ������ ���� ������� �Ҵ�
		int c = b1 + b2;
		
		// ���� c�� �Ҵ�� �� 30�� ȭ�鿡 ���
		System.out.println(c);
		System.out.println("----------------");
		
		// intŸ�� ���� a�� 100�Ҵ�
		int a = 100;
		// longŸ�� ���� b�� 200�Ҵ�
		long b = 200;
		// ����ȯ : (�ڷ���)
		
		// ���� a�� b�� ���� ������� intŸ������ ��ȯ �� intŸ���� ���� k�� �Ҵ�
		int k = (int)(a + b);
		// ȭ�鿡 ���� k�� 300�� ���
		System.out.println(k);
	}
}
