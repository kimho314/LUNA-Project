package day09;

import java.awt.Frame;

public class MyWinEx1 extends Frame {
	
	MyWinEx1()
	{
		super(); // �θ��� �⺻�����ڸ� ȣ��
		// ȭ�鿡 ���̱� ����
		this.setVisible(true);
		// â�� ũ�⸦ �ʺ� 800px, ���� 600px�� ����
		// ȭ���� ���� ����� (0,0)���� ����
		this.setSize(800,600);
		// â�� ȭ���� ���� ������κ��� (200,100)��ŭ �̵���Ų��
		setLocation(200,100);
		// â�� Ÿ��Ʋ �ֱ�
		setTitle("�������� ������");
	}
	
	public static void main(String[] args) {
		MyWinEx1 mw1 = new MyWinEx1();
		
		
	}
}
