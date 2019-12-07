package day10;

public class OuterClassEx1 {
	private int a = 10;
	static int b = 20;
	static final int C = 30;
	
	// ��� ������ ���� ��ġ�� ���� ����ϴ�
	// Member Inner Class
	class InnerClass
	{
		int d = 40;
		//static int e = 50; (x) // Inner class������ static������ ������ �� ����.
		static final int F = 60;
		public void print()
		{
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("C : " + C);
			System.out.println("d : " + d);
			//System.out.println(" e : " + e);
			System.out.println("F : " + F);
		}
	}
	
	
	public static void main(String[] args) {
		OuterClassEx1 oce = new OuterClassEx1();
		System.out.println(oce.a);
		
		OuterClassEx1.InnerClass ic = oce.new InnerClass();
		System.out.println(ic.d);
		ic.print();
	}
}
