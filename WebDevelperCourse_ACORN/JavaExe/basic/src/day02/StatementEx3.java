package day02;

import java.io.IOException;

public class StatementEx3 {
	public static void main(String[] args) throws IOException {
		// ����ڷκ��� ���ڸ� �Է� �ޱ�
		/*
		System.out.print("���ڸ� �Է��ϼ���: ");
		int userdata = System.in.read();
		userdata -= 48;
		System.out.println(userdata);
		*/
		
		// �Է� ���� �������� ���
		System.out.print("���� �Է��ϼ���: ");
		int input = System.in.read(); // read()�Լ��� ascii���� �о�´�
		input -= '0';
		for(int i=1; i<=9; i++)
		{
			System.out.println(input + " * " + i + " = " + (input * i));
		}
	}
}
