package day10;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

// �ܺο� Ŭ������ �����߱� ������ �ٸ� ������ ���� �̸���
// Ŭ������ �� ����� �ȴ�
// �̶� �͸� Ŭ������ ����ϸ� �ȴ�.
//class Test extends WindowAdapter
//{
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
//}

public class MyWin extends Frame {
	
	MyWin()
	{
		//WindowAdapter wa = new Test();
//		WindowAdapter wa = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("�����մϴ�.");
//				System.exit(0);
//			}
//		}; // -> �͸�Ŭ����
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		});
		
		setBounds(100,100,600,400);
		setVisible(true);
	}

	
	
	
	public static void main(String[] args) {
		MyWin sw = new MyWin();
	}
}
