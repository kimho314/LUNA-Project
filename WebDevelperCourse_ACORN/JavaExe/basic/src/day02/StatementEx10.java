package day02;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		// ����ڷκ��� ������ �Է¹޴´�.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��մϴ�: ");
		int score = sc.nextInt();
		//System.out.println("���� : " + score);
		
		switch(score/10)
		{
		case 10:
			System.out.println("A+ grade");
			break;
			
		case 9:
			System.out.println("A grade");
			break;
			
		case 8:
			System.out.println("B grade");
			break;
			
		case 7:
			System.out.println("C grade");
			break;
			
		default:
			System.out.println("D grade");
			break;
		}
	}
}
