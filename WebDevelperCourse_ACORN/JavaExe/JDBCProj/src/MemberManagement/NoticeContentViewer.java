package CommunitySystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class NoticeContentViewer {
	
	public void printData(ResultSet _rs) throws SQLException
	{
		System.out.println("�����Խñ� ����");

		while (true) {
			boolean ret = _rs.next();
			if (ret == false)
				break;

			int num = _rs.getInt("ROWNUM");
			String title = _rs.getString("TITLE");
			String writerId = _rs.getString("writer_id");
			String regDate = _rs.getString("REGDATE");
			int hit = _rs.getInt("hit");
			String content = _rs.getString("content");
			
			System.out.println("��ȣ : " + num);
			System.out.println("���� : " + title);
			System.out.println("�ۼ��� : " + writerId);
			System.out.println("�ۼ��� : " + regDate);
			System.out.println("��ȸ�� : " + hit);
			System.out.println("���� : " + content);;
		}
		System.out.println("");
	}
	
	public int printMenu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1.��۵��  2.���  3.����  4.����");
		System.out.print("> ");
		int sel = scan.nextInt();
		
		return sel;
	}
}
