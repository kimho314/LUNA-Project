package CommunitySystem;

import java.util.Scanner;

public class CommunitySystemViewer {
	
	public int printMenu()
	{
		int sel = 0;
		System.out.println("==== ���� �޴� ====");
		System.out.println("1. ȸ�� ����");
		System.out.println("2. �Խñ� ����");
		System.out.println("3. ����");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		sel = scan.nextInt();
		
		return sel;
	}
}
