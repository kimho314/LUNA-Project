package day08;

public class TestMain2 {
	public static void main(String[] args) {
		Gun g = new Gun();
		SniperGun sg = new SniperGun();
		Bazooka b = new Bazooka();
		Police p = new Police();
		
		p.attack();
		System.out.println("------------");
		//p = new Police(g); // ������ Police��ü�� ���ְ� ���ο� Police��ü�� �����.
		
		p.setW(g);
		p.attack();
		System.out.println("------------");
		
		p.setW(sg);
		p.attack();
		System.out.println("------------");
		
		p.setW(b);
		p.attack();
		
	
	}	
}
