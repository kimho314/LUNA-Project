package day08;

public class StaticEx1 {
	// public : ��𿡼��� ���� ����
	// static : �ν��Ͻ� �������� ���� ���� 
	// void : ���ϰ��� ����
	// main : method �̸�
	// (String[] args) : args��� �̸��� ���� StringŸ���� �Ű�����

	public static void main(String[] args) {
		SmartPhone.company = "ȭ����";
		System.out.println(SmartPhone.company);
		SmartPhone.playGame();
		
		SmartPhone.setCompany("Samsung");
		System.out.println(SmartPhone.company);
		
//		SmartPhone sp1 = new SmartPhone("�����ó�Ʈ10", "010-1234-5678", "Samsung", 1248500);
//		SmartPhone sp2 = new SmartPhone("����������", "010-1111-2222", "Samsung", 2398000);
//		
//		sp1.send("010-2222-3333");
//		
//		System.out.println("����ȸ�� : " + sp1.company);
//		System.out.println("����ȸ�� : " + sp2.company);
//		
//		sp1.company = "LG";
//		System.out.println("����ȸ�� : " + sp1.company);
//		System.out.println("����ȸ�� : " + sp2.company);
	}
}
