package day03;

// ArayEx5 Ŭ���� ����
public class ArrayEx5 {
	// main �޼ҵ� ����
	public static void main(String[] args) {
		// ũ�Ⱑ 4x3�� int�� �迭 ���� �� �� �Ҵ�
		// m[0][0] = 2, m[0][1] = 1, m[0][2] = 7
		// m[1][0] = 4, m[1][1] = 1, m[1][2] = 3
		// m[2][0] = 2, m[2][1] = 6, m[2][2] = 9
		// m[3][0] = 4, m[3][1] = 7, m[3][2] = 1
		int[][] m = {{2,1,7}, {4,1,3}, {2,6,9}, {4, 7, 1}};
		
		// �迭 m�� ���� ���̿� ���� ���̸� ���
		System.out.println("lenght : " + m.length + " " + m[0].length);
		// �迭 m�� �� ��ҵ��� ȭ�鿡 ���
		for(int i=0; i<m.length; i++)
		{
			for(int j=0; j<m[i].length; j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
