package day05;

public class MethodEx09 {
	public static void main(String[] args) {
		// 0 < Math.random() < 1 : 0�� 1 ���� ���� �� ��ȯ���ִ� �Լ�
		System.out.println(Math.random()); // 0.35368583482781546

		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("a : " + a + ", b : " + b); // a : 10, b : 20
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a + ", b : " + b); // a : 20, b : 10
	}

}