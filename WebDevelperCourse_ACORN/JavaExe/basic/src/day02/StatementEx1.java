package day02;

// ���
//	�ݺ��� : for, while, do~while
public class StatementEx1 {
	public static void main(String[] args) {
		
		// 3�� ������ ���
		/*
		for(int i=1; i<=9; i++)
		{
			System.out.println("3 * " + i + " = " + (3*i));
		}
		*/
		
		
		// for loop : for(�ʱ��; ���ǽ�; ������)
		// �ʱ�� : for������ ���� ������ �ʱⰪ�� �Ҵ�
		// ���ǽ� : ���ǽ��� ������� �������� true�̸� ���๮���� �����ϰ�
		// false�̸� ������ ����������		
		// ������ : for������ ���� ������ ����, ���� ó�� ���ش�
		for(int i=1; i<=9; i++)
		{
			// i : ���� ����
			System.out.println(" 3 * " + i + " = " + (3 * i));
		}
		
		// 19�� ���
		for(int i=1; i<=10; i++)
		{
			System.out.println(" 19 * " + i + " = " + (19 * i));
		}
		
		
	}
}
