package day03;

// �迭 : ���� Ÿ���� �����͸� �ϳ��� �̸�����
// ��� ó�����ִ� ���
// ������ ���� : �ּ�(������)�� ������ �ִ�
// �迭�� �ε����� ����ؼ� �迭�� �� ��ҿ�  ���� ����
// �ε����� ��ȣ�� 0�� ���� �����Ѵ�

// �迭�� �Ϲ� �������� ���� [] ����
// �ڷ���[] ������;
// �ڷ��� ������[];

// �迭�� ���� �ϸ� �޸𸮿� ������ ������
// ���� ���� �� �ִ� ��Ұ� ��������� �ʴ´�
// new��� �����ڿ� ���ؼ� �迭 ��Ұ� �����Ǿ�����.

public class ArrayEx2 {
	public static void main(String[] args) {
		
//		  int[] k = new int[3]; 
//		  for(int i=0; i<k.length; i++) 
//		  { 
//			  k[i] = (k.length - i) * 10;
//			  //System.out.println(k[i]);
//		  }
//		  System.out.println(k[1]);
		
		int[] d = {41, 29, 36};
		int idx = 0;
		for(int elem : d)
		{
			idx++;
			if(idx == 2)
				System.out.println(elem);
		}
	}
}
