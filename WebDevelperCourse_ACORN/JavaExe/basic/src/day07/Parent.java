package day07;

public class Parent {
	String name, gender, job;
	int age;
	
	Parent()
	{
		System.out.println("�θ��� �⺻ ������");		
	}
	
	Parent(String name)
	{
		this.name = name;
		System.out.println("�θ��� �Ű����� �ִ� ������");
	}
	
	public void sing()
	{
		System.out.println("�� ���̰� ���~~~~");
	}
	
	public void breath()
	{
		System.out.println("��~~~��~~~");
	}
	
	public void eat()
	{
		System.out.println("�����Ÿ� �Ծ��.");
	}
	
	public void scold()
	{
		System.out.println("�´� �������� ����� ����� ������.");
	}
}
