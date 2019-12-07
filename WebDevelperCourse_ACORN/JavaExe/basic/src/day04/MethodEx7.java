package day04;

public class MethodEx7 {
	// �ſ� ����� ���� ���ϴ� �޼ҵ� ����
	static int arraySum(int[] m) {
		int sum = 0;
		for(int i=0; i<m.length; i++) {
			sum += m[i];
		}
		return sum;
	}
	
	// �迭 ����� ����� ���ϴ� �޼ҵ� ����
	static float arrayAvg(int[] m) {
		// casting operator -> (float)
		return arraySum(m) / (float)m.length;
	}
	
	// method overloading
	// parameter�� ����, Ÿ��, ������ ���� ������ �̸��� ���� �������� �Լ��� ����°�
	// �Լ��� ��ȯ���� overloading�� ������ ����.
	// �޼ҵ� ������� ���Ǽ��� �ش�ȭ ��Ų��. -> �Ű������� Ÿ���� ���� �Ű澵 �ʿ䰡 ��������.
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(float a, float b) {
		return (int)(a+b);
	}
	
	// �R��° �Լ��� �Ű������� ����, Ÿ�� �� ������ ������ ���Ƽ� overloading�� �ȵȴ�.
	// ��ȯ���� �ٸ��� �ƹ��� ����� ����
//	static float add(int a, int b) {
//		return a+b;
//	}
	
	// main �޼ҵ� ����
	public static void main(String[] args) {
		int[] m = {10,20,30,40};
		
		int sum = arraySum(m);		
		float avg = arrayAvg(m);
		
		System.out.println("�迭 ����� �հ� : " + sum);
		System.out.println("�迭 ����� ��� : " + avg);
	}
}