package day03;

//�ܵ� ��ȯ��
import java.util.Scanner;
public class Hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��? ");
		int money = sc.nextInt();
		int w50000 = money / 50000;
		int w10000 = money % 50000 / 10000;
		int w5000 = money % 50000 % 10000 / 5000;
		int w1000 = money % 50000 % 10000 % 5000 / 1000;
		int w500 = money % 50000 % 10000 % 5000 % 1000 / 500;
		int w100 = money % 50000 % 10000 % 5000 % 1000 % 500 / 100;
		int w10 = money % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 10;
		int w1 = money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 10 ;
		
		System.out.println("50000���� : " + w50000);
		System.out.println("10000���� : " + w10000);
		System.out.println("5000���� : " + w5000);
		System.out.println("1000���� : " + w1000);
		System.out.println("500���� : " + w500);
		System.out.println("100���� : " + w100);
		System.out.println("10���� : " + w10);
		System.out.println("1���� : " + w1);
		
		sc.close();
	}
}
