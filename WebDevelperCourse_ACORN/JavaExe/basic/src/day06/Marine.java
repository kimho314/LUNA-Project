package day06;

public class Marine {
	int hp, offensepower, range, movingspeed, attackspeed, defensepower, mp;
	int x,y;
	
	public Marine()
	{
		hp = 100;
		mp = 100;
		x = 0;
		y = 0;
		offensepower = 3;
		range = 4;
		movingspeed = 2;
		attackspeed = 2;
		defensepower = 2;
	}
	
	public Marine(int hp_in)
	{
		this();
		hp = hp_in;
	}
	
	public Marine(int hp_in, int x_in, int y_in)
	{
		this();
		hp = hp_in;
		x = x_in;
		y = y_in;
	}
	
	void reconnaissance()
	{
		System.out.println("�ٹ��� �̻�...");
	}
	
	void move()
	{
		System.out.println("Go Go Go ~~~");
	}
	
	void hold()
	{
		System.out.println("Hold...");
	}
	
	void steempack()
	{
		movingspeed += 3;
		defensepower += 3;
	}
	
	void attack(Marine x)
	{
		System.out.println("�εεεε�~~~~");
		x.hp -= this.offensepower;
	}
	
	void attack(Medic m)
	{
		System.out.println("�εεεε�~~~~");
		m.setHp(m.getHp() - offensepower);
	}
	
	void attack(SiegeTank st)
	{
		System.out.println("�εεεε�~~~~");
		st.hp -= this.offensepower;
	}
	
	void attack()
	{
		System.out.println("�εεεε�~~~");
	}
}
