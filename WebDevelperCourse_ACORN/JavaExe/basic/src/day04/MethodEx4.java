package day04;

public class MethodEx4 {
	static int arrSum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static float arrAvg(int[] a) {
		float avg = (float)arrSum(a) / (float)a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		int[] m = {10,20,30,40};
		
		System.out.println("���� �޼��忡�� m :" + m);
		
		// �迭�� �հ� : 100
		// �迭�� ��� : 250.0
		int ret1 = arrSum(m);
		float ret2 = arrAvg(m);
		System.out.println("�迭�� �հ� : " + ret1);
		System.out.println("�迭�� ��� : " + ret2);
	}
}
