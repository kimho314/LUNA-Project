package day02;

import java.io.IOException;
import java.util.Scanner;
public class StatementEx9 {
	public static void main(String[] args)  throws IOException {
		// 1. ����ڷκ��� ���ڸ� �Է¹޴´�.
		System.out.print("���ڸ� �Է��ϼ���: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(score);
		
		// 2. �� ���� �Ǵ��Ͽ� �޼����� ����Ѵ�.
		// 90 ==> A
		// 80 ==> B
		// 70 ==> C
		// 60 ==> D
		if(score >= 90)
		{
			System.out.println("A grade");
		}
		else if((score < 90) && (score >= 80))
		{
			System.out.println("B grade");
		}
		else if((score < 80) && (score >= 70))
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("D grade");
		}
	}
}
