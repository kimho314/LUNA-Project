package day03;

// break : ���� ����� �ݺ����� Ż��
// break label : ���� �پ��ִ� �ݺ����� Ż��
// continue : �̹��� ����
// continue label : �󺧸��� �پ��ִ� �ݺ������� �̹��� ����
public class StatementEx13 {
	public static void main(String[] args) {
		
		outer:
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
//				if(i < j)
//					break;
				if(i == j)
					continue outer;
				System.out.println("i: " + i + " , j: " + j);
			}
		}
	}
}
