package day04;

public class MethodEx2 {
	static void max(int a, int b) {
		if (a==b) {
			System.out.println("�� ���� �����ϴ�.");
			return;
		}
		int max = (a>b) ? a : b;
		System.out.println("max : " + max);
	}
	
	static void min(int a, int b) {
		if(a==b) {
			System.out.println("�� ���� �����ϴ�.");
			return;
		}
		int min = (a<b) ? a : b;
		System.out.println("min : " + min);
	}
	
	static int sum(int a, int b) {
		int ret = a+b;
		//System.out.println("sum : " + ret);
		// return : ���� �۾��� �ߴ��ϰ�
		// �� ���� ���� �޼��忡�� ���޽�Ų��.
		return ret;
	}
	
	static int subtraction(int a, int b) {
		int ret = a-b;
		
		return ret;
	}
	
	// �޼����� ���� : �޼��� �ñ״���
	
	// �޼����� ����
	// static [���ϰ��� �ڷ���] [�޼����](
	//			�ڷ��� �Ű�������, �ڷ��� �Ű�������, ...){
	//			return ��;
	// }
	
	public static void main(String[] args) {
		max(50, 200);		
		max(200, 200);		
		min(200, 300);
		
		int ret = -1;
		ret = sum(100, 200);
		System.out.println("sum : " + ret);
		
		ret = subtraction(300, 50);
		System.out.println("minus : " + ret);
	}
}
