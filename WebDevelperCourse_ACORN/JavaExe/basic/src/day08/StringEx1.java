package day08;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		
		if(str1 == str2)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		
		// String�� equals�޼ҵ�� ���ڿ��� �������� �Ǵ��Ѵ�.
		if(str1.equals(str2))
		{
			System.out.println("������ ����");
		}
		else
		{
			System.out.println("�ٸ� ����");
		}
		
		// �ּҾ��
		System.out.println(str1.getClass().getName() + "@" + Integer.toHexString(str1.getClass().hashCode()));
		System.out.println("--------------------------");
		
		String str3 = "JAVA";
		String str4 = "JAVA";
		
		if(str3 == str4)
		{
			System.out.println("���� ��ü");
		}
		else
		{
			System.out.println("�ٸ� ��ü");
		}
		
		str4 = "ORACLE";
		if(str3 == str4)
		{
			System.out.println("���� ��ü");
		}
		else
		{
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println("--------------------------");
		String str = "*";
		// String��  *�� ���϶����� ���ο� �޸𸮸� �Ҵ�޾Ƽ� ����Ѵ�.
		// �� *�� ���� ���ϼ��� �޸𸮸� ���� �Ҵ�޴� Ƚ���� �����ϰ� �̴� �����ս��� ������ �ϴ� ������ �ȴ�.
		for(int i=0; i<10; i++)
			str+="*";
		
	}
}
