package day03;

// ArrayEx4 Ŭ���� ����
public class ArrayEx4 {
	// main �޼ҵ� ����
	public static void main(String[] args) {
		// int�� 3x2 �迭 ����
		int[][] b = new int[3][2];
		
		// �迭�� �� ��ҿ� 10, 20, 30, 40, 50, 60 �Ҵ�
		// b[0][0] = 0,  b[0][1] = 10
		// b[1][0] = 20, b[1][1] = 30
		// b[2][0] = 40, b[2][1] = 50
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				b[i][j] = ((i*2) + (j+1))*10;
				// �迭�� �� ��ҵ��� ȭ�鿡 ���
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
