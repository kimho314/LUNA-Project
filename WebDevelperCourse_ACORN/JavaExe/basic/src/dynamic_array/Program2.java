package dynamic_array;

import test3.Exam;

public class Program2 {
	
	public static void main(String[] args) {
		ObjectList list = new ObjectList();
		// ��� ���� ��� ���� ������ �� �ִ�.
		list.add("hello");
		list.add(30);
		list.add(new Exam());
		
		// ���� �Լ��� ����Ϸ��� ������ ��ȯ�ؾ� �Ѵ�.
		//((Exam)list.get(2)).input();
		
		///////////////////////////////////////
		
		GList<String> glist = new GList();
		glist.add("hello");
		System.out.println(glist.get(0));
	}
}
