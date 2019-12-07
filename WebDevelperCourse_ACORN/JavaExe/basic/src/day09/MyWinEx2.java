package day09;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx2 extends Frame{
	// �ڷ��� ������
	Button btnNorth, btnSouth, btnEast, btnWest, btnCenter;

	
	MyWinEx2()
	{
		setTitle("���� ������");
		
		// ������Ʈ �ʱ�ȭ
		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnEast = new Button("East");
		btnWest = new Button("West");
		btnCenter = new Button("Center");
		
		// �����̳ʿ� ���� -> ��,��,��,�Ͽ� ��ġ
		// ���� ������� ������ ���߾ӿ� ��ġ
		add(btnNorth,"North");
		add(btnSouth,"South");
		add(btnEast,"East");
		add(btnWest,"West");
		add(btnCenter,"Center");
		
		// �����̳ʿ��� ������Ʈ ��ġ�ϴ� ���
		// 1. ��ġ�����ڿ� ���� ��ġ
		//		Frame�� �⺻ ��ġ�����ڴ� ���� ���̾ƿ�
		//		�������̾ƿ� ==> FlowLayout���� ����

		
		//Flowlayout ��ü ����
		//FlowLayout fl = new FlowLayout();
		
		//���� �����̳ʿ� ��ġ�����ڸ� ���� 
		//�쿡�� �·� �߰��� ������� ��ġ�Ѵ�.
		//setLayout(fl);		
		
		Handler1 hd1 = new Handler1();
		btnCenter.addActionListener(hd1);
		btnNorth.addActionListener(hd1);
		btnSouth.addActionListener(hd1);
		btnEast.addActionListener(hd1);
		btnWest.addActionListener(hd1);
		
		setSize(400,400);
		setLocation(300,300);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWinEx2 mw2 = new MyWinEx2();
	}
}

class Handler1 implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand() + " ��ư ����");
	}
}
