package day05;

public class TestMain2 {
	public static void main(String[] args) {

		// Car c;
		// c = new Car();
		
		Car c = new Car();

		c.���� = "���";
		c.������ = "���";
		c.���� = "����";
		c.���� = 2019;
		c.�ӵ� = 30;
		c.�ڵ� = 1;

		System.out.println("���� : " + c.����);
		System.out.println("������ : " + c.������);
		System.out.println("���� : " + c.����);
		System.out.println("���� : " + c.����);
		System.out.println("�ӵ� : " + c.�ӵ�);
		System.out.println("�ڵ� : " + c.�ڵ�);

		c.drive();
		c.parking();
		c.speed();

	}
}