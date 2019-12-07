package day08;

// �ڹٿ��� ���� ������ �͵�
// 1. import java.lang.*;
// extends Object
// default constructor
// this : �����ڿ��� �ɹ������� ����Ű�� Ű����
// super();
// access modifier default
public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		// obj1�� �������� Ŭ���� ��ü
		String className = obj1.getClass().getName();
		System.out.println(className);
		
		// object�� Ŭ������ + @ + �ؽ����� 16������ ��ȯ�Ѱ�
		System.out.println(obj1.hashCode());
		System.out.println(Integer.toHexString(obj1.hashCode()));
		System.out.println("-------------------------------");
		
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		
		obj2 = obj3;
		
		if(obj2.equals(obj3))
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		System.out.println("-------------------------------");
		
		
		
	}
}
