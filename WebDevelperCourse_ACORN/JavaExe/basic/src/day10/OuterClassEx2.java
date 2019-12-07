package day10;

public class OuterClassEx2 {
	private int a = 10;
	static int b = 20;
	static final int C = 30;
	
	// static ������ ���� ��ġ -> static inner class
	// outer class�� new���� �ʾƵ�
	// ���� ����� ����
	// outer class�� new�ؾ� �� �� �ִ� ������ ���� �Ұ���
	static class InnerClass2
	{
		int d = 40;
		static int e = 50; 
		static final int F = 60;
		public void print()
		{
			//System.out.println("a : " + a); (x)
			System.out.println("b : " + b);
			System.out.println("C : " + C);
			System.out.println("d : " + d);
			System.out.println("e : " + e);
			System.out.println("F : " + F);
		}
	}
	
	
	public static void main(String[] args) {
		InnerClass2 ic2 = new InnerClass2();
		ic2.print();
	}
}
