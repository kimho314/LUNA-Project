package day01;

// ������ : �ڷ� ������ ���� ������ ��Ŀ� ���� ����ϰ�
// �� ����� ��� ���� ������ �ǹ��ϴ� ��ȣ���� ��Ī

// 1. ���������� : ++, --

// OperEx1 Ŭ���� ����
public class OperEx1 {
	// main �޼ҵ� ����
	public static void main(String[] args)
	{
		// intŸ�� ���� a�� 100 �Ҵ�
		int a = 100;
		// a�� 100 + 1�� ����� �Ҵ�
		a = a+1;
		// ȭ�鿡 100 + 1�� ����� ���
		System.out.println(a);
		
		// a�� �Ҵ�� ���� 1����
		a++; // a = a+1
		// a�� �Ҵ�� ���� 1�� ������Ų ����� ���
		System.out.println(a);
		System.out.println("----------------");
		
		// intŸ�� ���� b,c�� ���� 10,20 �Ҵ�
		int b = 10;
		int c = 20;
		
		// c�� b���� �Ҵ��ϰ� b�� ���� 1����
		c = b++; // b���� c�� �����ϰ� b�� ���� 1����
		// ȭ�鿡 b�� c�� ���� ��� 
		System.out.println(" b = " + b + " , c = "  + c); // b=11, c=10
		
		// intŸ�� ���� b,c�� ���� 10,20�Ҵ�
		b = 10;
		c = 20;
		// c�� b�� ���� 1������Ű�� ������Ų ������� �Ҵ�
		c = ++b; // b�� ���� 1������Ű�� c�� ����
		// ȭ�鿡 b,c�� ���� ���
		System.out.println(" b = " + b + " , c = "  + c); // b=11, c=11
	}
}