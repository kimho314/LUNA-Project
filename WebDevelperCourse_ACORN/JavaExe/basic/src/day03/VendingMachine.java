package day03;

import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		// ���Ǳ�
		
		// 1. �����   2. �ѵ� �ٹ�Ŀ��   3. ����
		// 4. ����      5. ���̴�
		System.out.println("-------------------");
		System.out.println("�Ծ�� ���Ǳ�");
		System.out.println("�޴�");
		System.out.println("1. �����   2. �յմٹ�Ŀ��   3. ����");
		System.out.println("  2000��           500��              1200��");
		System.out.println("4. ����       5. ���̴�");
		System.out.println("  1000��           900��");
		System.out.println("-------------------");
		
		// 2.����ڷκ��� ���� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� �Ͻÿ�: ");
		int money = sc.nextInt();;
		// 3.����ڰ� �޴��� �����Ѵ�.
		System.out.print("�޴� ����: ");
		int menu = sc.nextInt();
		// 4.������ �����Ѵ�
		System.out.print("���� ����: ");
		int amount = sc.nextInt();
		// 5.�ܾ��� ����ϴٸ� 6������ �����ϴٸ� 7������
		int exchange = 10000;
		int price = 0;
		switch(menu)
		{
		case 1:
			price = 2000;
			break;
		case 2:
			price = 500;
			break;
		case 3:
			price = 1200;
			break;
		case 4:
			price = 1000;
			break;
		case 5:
			price = 900;
			break;
			default:
				System.out.println("menu corrupted input");
				break;
		}
		
		boolean money_flag = false;
		if(money - (price*amount) >= 0)
		{
			money_flag = true;
		}
		else
		{
			money_flag = false;
			System.out.println("���� �����մϴ�.");
		}
		
		if (money_flag) {
			if (exchange >= (money - (price * amount))) {
				switch (menu) {
				case 1:
					System.out.println("�����");
					break;
				case 2:
					System.out.println("�յմٹ�Ŀ��");
					break;
				case 3:
					System.out.println("����");
					break;
				case 4:
					System.out.println("����");
					break;
				case 5:
					System.out.println("���̴�");
					break;
				default:
					break;
				}
				System.out.println(money - (price * amount) + "�� �ܵ��� �Ž��� �����ϴ�.");
			} else {
				System.out.println("�ܵ��� �����մϴ�.");
			}
		}
		// 6.������ ���Ḧ �����Ѵ�
		
		// 7.�ܾ��� �����ϴٴ� �޼����� ���
		
		// 8.�ܵ��� �ش�.
		sc.close();
	}
}
