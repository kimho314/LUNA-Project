package day05;
// Lotto 
public class MethodEx10 {
	public static void main(String[] args) {
		// 1. �迭�� ����
		int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
				18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33,
				34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};

		// 2. �����ϰ� 2���� �̾Ƽ� ȭ�鿡 ���
		// System.out.println(m[22]);
		// System.out.println(m[32]);

		// 0*10 < (int)(Math.random()*10) < 1*10 ;

		for (int i = 1; i <= 1000; i++) {

			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);

			// System.out.println((int)(Math.random()*45));
			// System.out.println((int)(Math.random()*45));

			// System.out.println("�ڸ��ٲٱ���");
			// System.out.println("m[" + a + "]��° ����� �� : " + m[a]);
			// m[19]��° ����� �� : 20
			// System.out.println("m[" + b + "]��° ����� �� : " + m[b]);
			// m[14]��° ����� �� : 15

			int temp = 0;
			temp = m[a];
			m[a] = m[b];
			m[b] = temp;

			// System.out.println("�ڸ��ٲ���");
			// System.out.println("m[" + a + "]��° ����� �� : " + m[a]);
			// m[19]��° ����� �� : 15
			// System.out.println("m[" + b + "]��° ����� �� : " + m[b]);
			// m[14]��° ����� �� : 20
		}

		int[] n = new int[6];

		for (int i = 0; i < 6; i++)
			n[i] = m[i];

		// 3. ���
		// ���� �˰����� �����Ͽ� �ζ� ��ȣ�� ���ĵ� ���·� ���

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		// for (int i = 0; i < 6; i++) {
		//
		// System.out.print(m[i] + "\t"); // 4 21 36 13 17 42 (����)
		// }
		// System.out.println();
	}
}