package day03;

import java.util.Scanner;
public class ConvertTime {
	public static void main(String[] args) {
		// ����ڰ� �Է��� ���� (��) �ð������� ȯ���ϴ� �ڵ带 �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����? : ");
		int sec = sc.nextInt();
		int day = sec / (24*60*60);
		int hour = sec % (24*60*60) / (60*60);
		int min = sec % (24*60*60) % (60*60) / 60;
		sec = sec % (24*60*60) % (60*60) % 60;
		
		System.out.println(day + "�� " + hour + "�� " + min + "�� " + sec + "��");		
		
		sc.close();
	}
}
