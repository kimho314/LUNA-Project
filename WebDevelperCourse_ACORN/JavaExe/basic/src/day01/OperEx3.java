package day01;

// 3. ����Ʈ ������

// OperEx4 Ŭ���� ����
public class OperEx3 {
	// main �޼ҵ� ����
	public static void main(String[] args)
	{
		// intŸ�� ���� b�� 10�Ҵ�
		int b = 10; // 0000 1010
		
		// 0000 0010(2)
		// ȭ�鿡 10�� ���������� �� ��Ʈ���� �������� 2ĭ ����Ʈ��Ų ����� ���
		System.out.println(" b >> 2 : " + (b>>2));
		// 0010 1000(40)
		// ȭ�鿡 10�� ���������� �� ��Ʈ���� ���������� 2ĭ ����Ʈ��Ų ����� ���
		System.out.println(" b << 2 : " + (b << 2));
		
		 
	}
}
