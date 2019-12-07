package day04;

import java.util.Scanner;
public class MethodEx1 {
	// printStar() : method
	// int count : parameter -> local variable
	static void printStar(int count) {
		//int count = 7;
		for(int i=1; i<=count; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void printGuGuDan(int dan) {
		// parameter, argument, ����
		// �����ų �� ������ �� ����
		// dan ������ �Ҵ�Ǿ� �ִ�.
		System.out.println("������" + dan + "�� ���");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int count = sc.nextInt();
		//printStar(5);
		//printStar(count);
		
		int dan = sc.nextInt();
		printGuGuDan(dan);
		
		sc.close();
	}
}
