package day05;

public class Human {
	String name;
	int eye;
	String gender;
	int arm;
	int age;
	String job;
	String ��Ư;
	
	Human()
	{
		name = "ȫ�浿";
		eye = 2;
		gender = "��";
		arm = 2;
		age = 20;
		job = "����";
		��Ư = "��ƿ";
	}
	
	void ��ƿ()
	{
		System.out.println("�������� �� ������");
	}
	
	void �޸���()
	{
		System.out.println("��� ���");
	}
	
	void �����Դ޸���()
	{
		System.out.println("������ �޷���");
	}
	
	void ������()
	{
		System.out.println("���� ��½ ���� ��¼");
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		
		System.out.println(h.name); // ȫ�浿
		System.out.println(h.eye); // 2 
		System.out.println(h.gender);// ��
		System.out.println(h.arm); // 2
		System.out.println(h.age); // 20
		System.out.println(h.job); // ����
		System.out.println(h.��Ư);// ��ƿ

		h.��ƿ(); // �������� �� ������!! 

		h.�޸���(); // "��� ���"
		h.�����Դ޸���(); // "������ �޷���
		h.������(); // ���� ��½ ���� ��½
	}
}
