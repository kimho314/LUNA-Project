package day08;

import java.util.Scanner;

public class Hw8 {
	public static void main(String[] args) {
		String socialSecureNum;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�ֹι�ȣ�Է�? : ");
			socialSecureNum = sc.nextLine();
			if (socialSecureNum.length() < 13)
			{
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
			else
				break;
		}
		
		
		String[] birthDate = new String[3];
		int gender;
		//890314

		int j =0;
		// birthDate[0] : year
		// birthDate[1] : month
		// birthDate[2] : day
		for(int i=0; i<6; i+=2)
		{
			birthDate[j] = socialSecureNum.substring(i, i+2);
			j++;
		}
		gender = Integer.parseInt(socialSecureNum.substring(6, 7));
		j=0;
		
		System.out.print(birthDate[0] + "��" + birthDate[1] + "��" + birthDate[2] + "��" + "   ");
		if(gender == 1)
			System.out.println("�����̽ó׿�.");
		else if(gender == 2)
			System.out.println("�����̽ó׿�.");
		else
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		
		sc.close();
	}
}
