package day02;

public class StatementEx8 {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 70;
		int mat = 20;
		
		// ����
		// ���
		int sum = 0;
		double avg = 0.0;
		sum += kor;
		sum += eng;
		sum += mat;
		avg = sum / 3.0;
		System.out.println("sum = " + sum + " avg = " + avg);
		
		// ��� 60�� �̻��̸� �հ�, �ƴϸ� ���հ�
		// ��Ȳ�� ���� ���δٸ� ������ ����
		// if(condition){
		// 	statement;
		// }
		// else if(condition){
		//	statement;
		// }
		// else{
		//  statement;
		// }
		if(avg >= 60.0)
		{
			System.out.println("����� �հ��Դϴ�.");
		}
		else
		{
			System.out.println("����� ���հ��Դϴ�.");
		}
	}
}
