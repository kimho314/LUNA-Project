package day05;

public class TestMain {
	public static void main(String[] args) {
		// ���赵�� ������ ��ü �����

		// Ŭ������ ��������;
		Person p;
		p = new Person();

		// ��ü�� ������ �ִ� ������ ���� �Ҵ�
		p.m_name = "ȫ�浿";
		p.m_age = 20;
		p.m_eye = 2;
		p.m_norse = 1;
		p.m_mouth = 1;
		p.m_gender = "�ȳ�";

		System.out.println(p); // day5.Person@306a30c7 : ������
		System.out.println("���� : " + p.m_age);
		System.out.println("�̸� : " + p.m_name); 
		System.out.println("�� : " + p.m_eye); 
		System.out.println("�� : " + p.m_norse); 

		p.eating(); // �ȳ�
		p.talking(); // �����
		p.thinking(); // ��� ����
	}

}