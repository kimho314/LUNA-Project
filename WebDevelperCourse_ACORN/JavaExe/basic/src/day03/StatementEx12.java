package day03;

// �Է��� ���� 3�� ������� �ƴ��� �Ǻ��Ͽ� ���
import java.util.Scanner;
public class StatementEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input integer: ");
		int num = sc.nextInt();
		if(num % 3 == 0)
		{
			System.out.println("3�� ����Դϴ�.");
		}
		else
		{
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}
}
