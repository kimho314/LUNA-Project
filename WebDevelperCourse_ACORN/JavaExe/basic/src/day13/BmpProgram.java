package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/images/�ڿ�ǳ��.bmp");
		
		// ���� byte�� �迭�� ����Ͽ� bmp������
		// ����� �������� �ϸ� ����� �������� ����
		// �ֳ��ϸ� �ڹٿ��� byte���� ������ -128~127�����ε�
		// �� ������ �Ѿ�� ���� �ð�� �������� ���� �ǰ� ������
		// �̸� ����Ͽ� �ִ�� 255���� ���� �� �ִ� �ڷ����� 
		// ����ؾ� �Ѵ�
		// byte[] buf = new byte[6];
		int[] buf = new int[10];
		
		for(int i=0; i<buf.length; i++)
		{
			buf[i] = fin.read();
			//System.out.println(buf[i]);
		}
		
		
		System.out.printf("%03X %03X\n", buf[0], buf[1]);
		
		
		int bmpSize = 0;
		// buf[2] : 0x2E -> LSB
		// buf[3] : 0x89
		// buf[4] : 0x33
		// buf[5] : 0x00 -> MSB
		// 0x00 33 89 2E   
		for(int i=2; i<=5; i++)
		{			
			bmpSize |= (buf[i] << (8*(i-2)));
		}
		System.out.println("1. Size : " + bmpSize + " byte");
		fin.close();
		
		fin = new FileInputStream("src/images/�ڿ�ǳ��.bmp");
		
		byte[] buf2 = new byte[10];
		fin.read(buf2);
		
		bmpSize = 0;
		// mask����� ����� ���
		bmpSize = ((int)buf2[2] & 0xFF) << 0|
				((int)buf2[3] & 0xFF) << 8|
				((int)buf2[4] & 0xFF) << 16|
				((int)buf2[5] & 0xFF) << 24;
			
		
		System.out.println("2. Size : " + bmpSize + " byte");
		
		fin.close();
	}
}
