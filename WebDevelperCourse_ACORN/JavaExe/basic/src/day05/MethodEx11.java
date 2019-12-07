package day05;

public class MethodEx11 {

	static int getMaxValue(int[] m) {
		int maxValue = 0;
		for (int i = 0; i < m.length; i++) {
			if (maxValue < m[i]) {
				maxValue = m[i];
			}
		}
		return maxValue;
	}

	static void printGuGuDan(int dan) {
		System.out.println("--------------" + dan + "��" + "-------------");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

	public static void main(String[] args) {
		// �ִ밪 ���ϱ� �޼���
		int[] m = {23, 25, 22, 11, 66, 77};

		int value = getMaxValue(m);
		System.out.println("�ִ밪 : " + value); // �ִ밪 : 77
		System.out.println("-------------------------------");
		printGuGuDan(3);
		printGuGuDan(7);
	}

}