package day07;

public class Dog extends Mammal{
	String name;
	
	Dog()
	{
		species = "Ǫ��";
		head = 1;
		tail = 1;
		color = "���";
		name = "�����";
		age = 3;
	}
	
	@Override
	public void eating()
	{
		System.out.println("��Ḧ �Ծ��");
	}
	
	@Override
	public void sleeping()
	{
		System.out.println("���� �ڿ�");
	}
	
	public void running()
	{
		System.out.println("�������� �޷���");
	}
}
