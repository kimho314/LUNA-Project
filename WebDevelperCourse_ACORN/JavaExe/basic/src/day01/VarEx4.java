package day01;

// VarEx4 Ŭ���� ����
public class VarEx4 {
	// main �޼ҵ� ����
	public static void main(String[] args)
	{
		// charŸ���� ���� c1�� 67 �Ҵ�
		char c1 = 67;
		// charŸ���� ���� c2�� 'c'�Ҵ�
		char c2 = 'c';
		// chatŸ���� ���� c3�� 'a'�� unicode������ '\u0061'�� �Ҵ�
		char c3 = '\u0061'; // unicode
		
		// ���ڿ� "c1 : "�� c1�� �Ҵ�� 'c'�� ��ǻ�� ȭ�鿡 ���
		System.out.println("c1 : " + c1);
		// ���ڿ� "c2 : "�� c2�� �Ҵ�� 'c'�� ��ǻ�� ȭ�鿡 ���
		System.out.println("c2 : " + c2);
		// ���ڿ� "c3 : "�� c3�� �Ҵ�� 'a'�� ��ǻ�� ȭ�鿡 ���
		System.out.println("c3 : " + c3);
		
		// char������ m1, m2, m3, m4�� ���� 'J', 'A', 'V', 'A'�� �Ҵ�
		char m1 = 'J';
		char m2 = 'A';
		char m3 = 'V';
		char m4 = 'A';
		
		// m1,m2,m3,m4�� �Ҵ繮 ���� 'J', 'A', 'V', 'A'�� ȭ�鿡 �����ؼ� ���
		// �� ���ڷ� ����ҷ��� �� �տ� ""�� �ٿ��߸� �Ѵ�
		System.out.println("" + m1 + m2  + m3 + m4);
		
		// StringŸ���� ���� str�� ���ڿ� "string"�Ҵ�
		String str = "string";
		// ��ǻ�� ȭ�鿡  ���ڿ� "string" ���
		System.out.println(str);
		System.out.println("---------------");
		// Ư�� ����
		// \n : newline
		// \b : backspace
		// \t : tab
		// \\ : \
		// \' : '
		// \" : "
		
		// ȭ�鿡
		// today
		//  is funny
		//  wednesday.
		// �� ���
		System.out.println("today \n is funny \n wendesday.");
		
		
	}
}
