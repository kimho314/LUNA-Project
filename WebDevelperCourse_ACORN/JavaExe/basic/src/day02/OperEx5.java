package day02;

// 5. ��Ʈ ������
// true : 1	false : 0
// OperEx5 Ŭ���� ����
public class OperEx5 {
	// main �޼ҵ� ����
	public static void main(String[] args) {
		byte a = 10; // 0000 1010
		byte b = 22; // 0001 0110
		
		// a,b�� ������ �� ��Ʈ���� AND������ ������� ȭ�鿡 ���
		System.out.println(" a & b : " + (a & b)); // 0000 0010 -> 2
		// a,b�� ������ �� ��Ʈ���� OR������ ������� ȭ�鿡 ���
		System.out.println(" a | b : " + (a | b)); // 0001 1110 -> 30
		
		byte c = 13; // 0000 1101
		byte d = 21; // 0001 0101
		
		// c & d -> 0000 0101 -> 5
		// c | d -> 0001 1101 -> 29
		System.out.println(" c & d : " + (c & d));
		System.out.println(" c | d : " + (c | d));
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(" b1 & b2 : " + (b1 & b2));
		
		
	}
}
