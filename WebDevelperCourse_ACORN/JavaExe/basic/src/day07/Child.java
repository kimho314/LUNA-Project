package day07;

public class Child extends Parent {
	
	Child()
	{
		super();
		System.out.println("child Ŭ������ �⺻ ������");
	}
	
	public void clubbing()
	{
		System.out.println("dancing~~~~~~");
	}
	
	// annotation
	@Override
	public void sing()
	{
		System.out.println("DNA~~~~~~~~~~");
	}
}
