package day07;

// ��ӿ� Ŭ����
// instanceȭ �ϴ� Ŭ������ �ƴϴ� -> �߻� Ŭ����

public abstract class Mammal {
	String species;
	int head;
	int tail;
	String color;
	int age;
	
	// �� �޼ҵ�� ���� �ݵ�� �������̵� �ϼ���
	public abstract void eating();
	
	public abstract void sleeping();
	
	public void status()
	{
		System.out.println("species : " + species);
		System.out.println("head : " + head);
		System.out.println("tail : " + tail);
		System.out.println("color : " + color);
		System.out.println("age : " + age);
	}
}
