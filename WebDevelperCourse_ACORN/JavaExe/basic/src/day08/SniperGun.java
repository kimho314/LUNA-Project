package day08;

public class SniperGun implements Weapon {
	int bullet;
	
	SniperGun()
	{
		bullet = 5;
	}
	
	@Override
	public void fire()
	{
		if(bullet > 0)
			System.out.println("��������~~~~");
		else
		{
			System.out.println("�Ѿ��� ���������ϴ�.");
			bullet = 0;
		}
	}
	
	@Override
	public void reload()
	{
		System.out.println("��������");
		bullet = 5;
	}
}
