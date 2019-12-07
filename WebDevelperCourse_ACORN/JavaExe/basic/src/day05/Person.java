package day05;

public class Person {
	// member variable(field)
	String m_name;
	int m_age;
	int m_eye;
	int m_norse;
	int m_mouth;
	String m_gender;
	
	// method
	// constructor : ��ü�� �ʱ�ȭ�� ����Ѵ�
	// Ŭ������� ����
	// ����Ÿ���� ������ void Ű���嵵 ������� �ʴ´�.
	// �ƹ��� �Ű����� �Ǿ��� ������ ==> �⺻ ������
	// ���� �������� ������ JVM�� ��� �⺻�����ڴ� �����ϴ� ������ ����
	// ������ �⺻������ �ʱ�ȭ
	Person()
	{
		m_name = "";
		m_age = 0;
		m_eye = 0;
		m_norse = 0;
		m_mouth = 0;
		m_gender = "";
	}
	
	// constructor overloading
	Person(String name, int age, int eye, int norse, int mouth, String gender)
	{
		m_name = name;
		m_age = age;
		m_eye = eye;
		m_norse = norse;
		m_mouth = mouth;
		m_gender = gender;
	}
	
	void printInfo()
	{
		System.out.println(m_name);
		System.out.println(m_age);
		System.out.println(m_eye);
		System.out.println(m_norse);
		System.out.println(m_mouth);
		System.out.println(m_gender);
	}
	
	void setPInfo(String name, int age, int eye, int norse, int mouth, String gender)
	{
		m_name = name;
		m_age = age;
		m_eye = eye;
		m_norse = norse;
		m_mouth = mouth;
		m_gender = gender;
	}
	
	void eating()
	{
		System.out.println("�ȳȳ�...");
	}
	
	void talking()
	{
		System.out.println("�Ҷ�Ҷ�");
	}
	
	void thinking()
	{
		System.out.println("���� �����Ѵ� ��� �����Ѵ�.");
	}
	
	public static void main(String[] args) {
		
	}
}
