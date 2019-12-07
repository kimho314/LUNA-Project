package day09;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;


public class MyWinEx3 extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button btnRed, btnBlue;
	
	MyWinEx3()
	{
		super("��ȣ�� ��ư");
		//setTitle("��ȣ�� ��ư");
		setSize(400,400);
		setLocation(100,100);
		setVisible(true);
		
		btnRed = new Button("RED");
		btnBlue = new Button("BLUE");
		
//		add(btnBlue,"East");
//		add(btnRed,"West");
		
		// ��ġ�����ڸ� ������� �ʰ� Ŀ�����ϰ� ����
		// ��� ������Ʈ�� ũ��� ��ġ�� ���� �����ؾ� �Ѵ�.
		
		//btnRed.addActionListener(�������̽� �������� => �������̽��� ������ ��ü);
		Handler hd = new Handler();
		btnRed.addActionListener(hd);
		btnBlue.addActionListener(hd);
		
		setLayout(null); // �⺻ ��ġ������ disable
		
		btnRed.setSize(50,50);
		btnRed.setLocation(30, 300);
		btnBlue.setSize(50,50);
		btnBlue.setLocation(320,300);
		
		// ������Ʈ�� ����
		btnBlue.setBackground(Color.blue);
		btnRed.setBackground(Color.red);
		
		add(btnBlue);
		add(btnRed);
	}
	
	public static void main(String[] args) {
		MyWinEx3 mw3 = new MyWinEx3();
	}// main method end
	
	// �Ϲ������� 1���� java���Ͽ� Ŭ������ 1���� ��� ��Ģ
	// public class�� �ƴ϶�� ������ ���� ���� but �� ���� ����
	class Handler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			//String name = e.getActionCommand();
			Object obj = e.getSource();
			System.out.println(obj);
			
			if(obj == btnRed)
			{
				System.out.println("������ư ����");
			}
			else if(obj == btnBlue)
			{
				System.out.println("�Ķ���ư ����");
			}
			
//			if(name.equalsIgnoreCase("RED"))
//			{
//				System.out.println("������ư ����");
//			}
//			else if(name.equalsIgnoreCase("BLUE"))
//			{
//				System.out.println("�Ķ���ư ����");
//			}		
		}
	}
	
}// class end


