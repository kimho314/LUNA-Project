package day06;

// extends Person : Person Ŭ�����κ��� �ɹ� ������ �޼ҵ带 ��� ����
public class SuperMan extends Person {
	private int redCape;	
	
	SuperMan()
	{
		// �θ� Ŭ������ ������ ȣ�� -> ��������
		super(); // �θ� Ŭ������ �⺻ ������ ȣ��
		redCape = 1;
		System.out.println("SuperNam �⺻������");
	}
	
	SuperMan(String name, int age, int redCape)
	{
		super(name, age);
		this.redCape = redCape;
		System.out.println("SuperMan �Ű����� 3��¥�� ������");		
	}
	

	public int getRedCape() {
		return redCape;
	}
	

	public void setRedCape(int redCape) {
		this.redCape = redCape;
	}


	public void flying()
	{
		System.out.println("superman is flying~~~~");
	}
	
	public void blazing()
	{
		System.out.println("superman is blazing~~~~");
	}
	
}
