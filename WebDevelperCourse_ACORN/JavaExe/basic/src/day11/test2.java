package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test2 {
	
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("src/res/test.txt");
		//fout.write(12);
		fout.write('1');
		fout.write('2');
		fout.flush();
		
		fout.close();
		System.out.println("process done");
		
		
		// 1. ���� �Է� ��Ʈ�� fin ��ü�� ������ ��.
		//String file_path = "C:\\eclipse\\workspace\\basic\\src\\images\\�ڿ�ǳ��.bmp";
		//String file_path = "src/images/�ڿ�ǳ��.bmp";
		//FileInputStream fin = new FileInputStream(file_path);
		
		
		// 2. ���Ͽ��� ù ��° 1����Ʈ�� �� ��� �� ��.
		//int num = fin.read();
		//System.out.println(num);
		
		// 3. ���� �Է� ��Ʈ���� ���� ��.
		//fin.close();
	}
}
