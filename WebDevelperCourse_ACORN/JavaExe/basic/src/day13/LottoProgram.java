package day13;

import java.util.Scanner;
import java.lang.Math;

public class LottoProgram {
	
	public static void main(String[] args) {
		
		// ������
		int[] lotto = new int[6];
		int[] res = new int[6];
		Scanner sc = new Scanner(System.in);	
		
		
		// ���
		genLottoResult(res);
		printMenu();
		
		switch(inputMenu(sc))
		{
		case 1:
			inputLottoManual(lotto, res, sc);
			break;
			
		case 2:
			inputLottoAuto(lotto, res);
			break;
			
		case 3:
			exitProgram();
			break;		
			
		default:
			errorMessage();
			break;
		}
		
		sc.close();
	}

	private static void genLottoResult(int[] res) {
		// TODO Auto-generated method stub
		for(int i=0; i<res.length; i++)
		{
			res[i] = (int)(Math.random()*45) + 1; 
			
			while(true)
			{
				boolean flag = false;
				for(int j=0; j<i; j++)
				{
					if(res[i] == res[j])
					{
						flag = true;
						break;
					}
				}
				
				if(flag == true)
				{
					res[i] = (int)(Math.random()*45) + 1; 
					continue;
				}
				else
					break;
			}
		}
		
		System.out.println("�ζ� ���");
		for(int i=0; i<res.length; i++)
		{
			System.out.print("[" + res[i] + "]" + " ");
		}
		System.out.println("");
	}

	private static void errorMessage() {
		// TODO Auto-generated method stub
		System.out.println("�߸�� �Է� ����");
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		System.out.println("�ζ� ���α׷� ���� ");
		System.exit(0);
	}

	private static void inputLottoAuto(int[] lotto, int[] res) {
		// TODO Auto-generated method stub
		System.out.println("�ζ� �ڵ� �Է�");
		
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i] = (int)(Math.random()*45) + 1; 
			while(true)
			{
				boolean flag = false;
				for(int j=0; j<i; j++)
				{
					if(lotto[i] == lotto[j])
					{
						flag = true;
						break;
					}
				}
				
				if(flag == true)
				{
					lotto[i] = (int)(Math.random()*45) + 1; 
					continue;
				}
				else
					break;
			}
		}
		
		for(int i=0; i<lotto.length; i++)
			System.out.println(lotto[i]);
		
		System.out.println("�ڵ� �Է� �Ϸ�");
		
		boolean ret = checkLotto(lotto, res);
		if(ret)
			System.out.println("1�� ��÷");
		else
			System.out.println("��");
	}

	private static boolean checkLotto(int[] lotto, int[] res) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i=0; i<lotto.length; i++)
		{
			if(lotto[i] == res[i])
				cnt++;
		}
		
		if(cnt == 6)
			return true;
		else
			return false;
	}

	private static void inputLottoManual(int[] lotto, int[] res, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("�ζ� ���� �Է�");
		
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i] = sc.nextInt();
		}
		
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
		System.out.println("");
		
		System.out.println("���� �Է� �Ϸ�");
		
		boolean ret = checkLotto(lotto, res);
		if(ret)
			System.out.println("1�� ��÷");
		else
			System.out.println("��");
	}

	private static int inputMenu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("����: ");		
		int ret = sc.nextInt();
		
		return ret;
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("=== �ζ� �޴� ===");
		System.out.println("   1. ����");
		System.out.println("   2. �ڵ�");
		System.out.println("   3. ����");
		System.out.println("==============");
	}
}
