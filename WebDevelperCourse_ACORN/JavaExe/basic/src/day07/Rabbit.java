package day07;

public class Rabbit extends Mammal{
	
	
	Rabbit()
	{
		species = "����";
		head = 1;
		tail = 1;
		color = "���";
		age = 2;
	}
	
	@Override
	public void eating()
	{
		System.out.println("����� �Ծ��");
	}
	
	@Override
	public void sleeping()
	{
		System.out.println("���� �ڿ�");
	}
	
	public void jumping()
	{
		System.out.println("���ѱ���");
	}
	 
}
