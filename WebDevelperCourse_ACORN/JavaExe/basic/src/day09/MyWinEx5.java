package day09;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx5 extends Frame implements WindowListener{
	
	
	MyWinEx5()
	{
		// �ڵ鷯 ��ü�� ���� �������� ����
		// �� Ŭ�������� �ڵ鷯 ��ü�� ������ �� �� �ֵ��� �� �� �ֵ�.
		this.addWindowListener(this);
		
		setSize(800,600);
		setLocation(100,100);
		setVisible(true);
	}
	
	

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ȱ��ȭ ������ �� ȣ��");
	}




	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����� �Ŀ� ȣ��");
	}




	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���� ���϶� ȣ��");
		
		// 0 : ��������
		// 0�� �ƴ� �ٸ� �� : ������ ����
		System.exit(0);
	}




	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��Ȱ��ȭ �����϶� ȣ��");
	}




	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����ܿ��� �����·� ���ƿö� ȣ��");
	}




	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ �����϶� ȣ��");
	}




	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������â ������ ȣ��");
		
	}
	
	
	
	public static void main(String[] args) {
		MyWinEx5 mw5 = new MyWinEx5();
	}
}
