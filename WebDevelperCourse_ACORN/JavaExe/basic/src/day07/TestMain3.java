package day07;

// class : ����� ������ Ÿ��
public class TestMain3 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.name);
		
		p1.scold();
		p1.sing();
		System.out.println("-------------------");
		
		Child c1 = new Child();
		System.out.println(c1.name);
		
		c1.clubbing();
		c1.sing();
		c1.scold();
		
		// m1 = p1; -> �ٸ� Ŭ�����鳢�� �������� ���� �� ����
		// m1.move() (x)
		// ���������� ũ�� : 32bit
		System.out.println("-------------------");
		Parent p2;
		p2 = p1; // (o) -> ���� Ŭ�����鳢�� �������� ���� �� �ִ�.
		p2.sing();
		System.out.println("-------------------");
		
		p2 = c1;
		p2.sing();
		p2.scold();
		
	}
}
