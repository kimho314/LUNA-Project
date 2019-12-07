package day08;

public class Police {
	String name;
	String position;
	int age;	
	Weapon w;
	
	Police()
	{
		name = "������";
		position = "����";
		age = 20;
	}
	
	Police(Weapon w)
	{
		name = "������";
		position = "����";
		age = 20;
		this.w = w;
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}

	public void patrol()
	{
		System.out.println("������");
	}
	
	public void eatDobut()
	{
		System.out.println("���� �Դ���");
	}
	
	public void attack()
	{
		//System.out.println("�����ϰ� �ֽ��ϴ�.");
		if(w != null)
			w.fire();
		else
			System.out.println("������� ��������...");
	}
	
	public void arrest()
	{
		System.out.println("����� ü���մϴ�.");
	}
}
