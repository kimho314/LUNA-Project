package day08;

public class StaticEx2 {
	int a = 10;
	static int b = 20;
	
	// static block -> static variable�̳� static function���� ������
	// static block�� ���� ���� ����ȴ�.
	static
	{
		int c = 30;
		System.out.println("static block : " + c);
	}
	
	StaticEx2()
	{
		System.out.println("�⺻������");
	}
	
	static void print()
	{
		System.out.println(" b : " + b);
	}
}
