package day03;

public class ArrayEx1 {
	public static void main(String[] args) {
		// �迭 : ������ ����� ���ӵ� ������ �Ҵ�Ǵ� ����
		// �ڷ���[] ������;
		int[] m;
		m = new int[3];
		// m[index] : �ش� �ε����� �ִ� ���� ������ �� �ִ�.
		System.out.println("m : " + m); 
		
		/*
		 * m[0] = 10; m[1] = 20; m[2] = 30;
		 * 
		 * System.out.println("m[[0] = " + m[0] + " m[1] = " + m[1] + " m[2] = " +
		 * m[2]);
		 */		
		
		for(int i=0; i<m.length; i++)
		{
			m[i] = (i+1)*10;
			System.out.println("m[" + i + "] = " + m[i]);
		}
		
		System.out.println("m[0] : " + m[0]);
		System.out.println("m.length : " + m.length);
	}
}
