package CommunitySystem;

import java.util.Scanner;

public class CommunitySystemContext {
	
	public int print()
	{
		int sel = 0;
		System.out.println("===���� �޴�===");
		System.out.println("1. ȸ�� ����");
		System.out.println("2. �Խñ� ����");
		System.out.println("3. ����");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		sel = scan.nextInt();
		if(sel < 1 && sel > 3)
		{
			sel = -1;
		}
		
		return sel;
	}
	
}
