package day04;

public class MethodEx5 {
	// add �޼ҵ� ���� �� ����
	static int add(int c, int d) {
		// �Ű������� ���� c,d�� ȭ�鿡 ���
		System.out.println("c : " + c + " , d : " + d);
		// c�� d�� ���� ������� ��ȯ
		return c+d;
	}
	
	// main �޼ҵ� ����
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		// a,b�� ����ִ� �� 100,200�� add�Լ��� �Ű������� �ѱ�� 
		// �� ���� ���� ��ȯ �޾Ƽ� result������ �Ҵ��Ѵ�
		int result = add(a,b);
		System.out.println("result : " + result);
	}
}
