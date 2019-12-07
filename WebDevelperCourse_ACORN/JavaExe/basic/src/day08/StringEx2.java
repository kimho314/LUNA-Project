package day08;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		
		// 4��° ����(�迭�� �ε���)
		System.out.println(str.charAt(3));
		
		String str2= "Monday";
		
		// ���ڿ� ����
		String str3 = str.concat(" " + str2);
		System.out.println(str3);
		
		String str4 = "Today is".concat(" Friday");
		System.out.println(str4);
		
		// method chaining
		String msg = "Today is".concat(" Friday").concat(" Tomorrow is").concat(" Satuday");
		System.out.println(msg);
		
		System.out.println(str.contains("java"));
		
		// equalsIgnoreCase(); : ��ҹ��� ������ �ʰ� ��
		boolean isSame = str.equalsIgnoreCase("JAVA ORACLE");
		System.out.println(isSame);
		
		// �ش� ������ ��ġ�� ����
		// (�� �迭�� �ε����̹Ƿ� 0����...)
		int position = str.indexOf('r');
		System.out.println("r position : " + position);
		
		// ���ڿ� ���� : length();
		System.out.println(str.length());
		
		// ���ڿ��� �κ����� : substring();
		// substring(2,6) : 2������ 6�� ������ ����
		String str5 = str.substring(2,6);
		System.out.println(str5);
		
		// ���ڿ��� char�迭�� �����ϴ� �޼���
		char[] ch2 = str.toCharArray();		
		// �迭�� �ݺ� ����ؼ� ȭ�鿡 ���
		for(int i=0; i<ch2.length; i++)
		{
			System.out.println(ch2[i]);
		}
		System.out.println("");
		
		int a = 20;
		
		// valueOf �޼ҵ带 ���ؼ� ���ڿ� �� ��ȯ
		String value = String.valueOf(a);
		System.out.println(value);
		
		
		// id + @ + domain: id�� ����
		String email = "dagda@hanafos.com";
		System.out.println(email.substring(0,5));
		System.out.println(email.substring(0,email.indexOf("@")));
		
		System.out.println(str.toString());
	}
}
