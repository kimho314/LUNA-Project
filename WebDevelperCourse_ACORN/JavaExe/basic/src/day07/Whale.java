package day07;

public class Whale extends Mammal implements Flyable{
	
	Whale()
	{
		species = "�������";
		tail = 1;
		head = 1;
		color = "ȸ��";
		age = 5;
	}
	
	@Override
	public void eating()
	{
		System.out.println("���츦 �Ծ��");
	}
	
	@Override
	public void sleeping()
	{
		System.out.println("�� �ٴٿ� ���� ����");
	}
	
	public void swimming()
	{
		System.out.println("��~~�� ��~~~��");
	}
	
	@Override
	public void fly()
	{
		System.out.println("���� ��~~~");
	}
}
