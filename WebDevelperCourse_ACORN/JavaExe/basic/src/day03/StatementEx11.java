package day03;

import java.util.Scanner;
public class StatementEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����ڷκ��� �¾ ������ �Է¹޾�
		System.out.print("�⵵�� �Է��ϼ���: ");
		int year = sc.nextInt();
		// �� ���� 12�� ���� �������� ���Ѵ�.
		year %= 12;
		System.out.println(year);
		// �������� ���� ���� �츦 ȭ�鿡 ���
		// � �� ���� ���ߴ� ���α׷� �ۼ�
		// �����ι�������̽�������
		// ���ȣ���츻����߰���
		switch(year)
		{
		case 0:
			System.out.println("�����̶�");
			break;
		case 1:
			System.out.println("�߶�");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("���");
			break;
		case 5:
			System.out.println("�Ҷ�");
			break;
		case 6:
			System.out.println("ȣ���̶�");
			break;
		case 7:
			System.out.println("�䳢��");
			break;
		case 8:
			System.out.println("���");
			break;
		case 9:
			System.out.println("���");
			break;
		case 10:
			System.out.println("����");
			break;
		case 11:
			System.out.println("���");
			break;
			default:
				break;
		}
		sc.close();	
	}
}
