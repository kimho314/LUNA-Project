package day07;

public class Horse extends Mammal implements Flyable {
	
	@Override
	public void eating()
	{
		System.out.println("Ǯ�� ��� �԰� �־��");
	}
	
	@Override
	public void sleeping()
	{
		System.out.println("���ǿ��� ���� �ڰ� �־��");
	}
	
	public void running()
	{
		System.out.println("�� �޸���");
	}
	
	@Override
	public void fly()
	{
		System.out.println("�޷��޷� ���ƿ�");
	}
}
