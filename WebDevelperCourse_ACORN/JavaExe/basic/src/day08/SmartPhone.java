package day08;

public class SmartPhone {
	String productNmae, phoneNumber;
	static String company;
	int price;
	
	static
	{
		SmartPhone.company = "nono";
	}
	
	// �Ű����� �ִ� ������
	public SmartPhone(String productNmae, String phoneNumber, String company, int price) {
		super();
		this.productNmae = productNmae;
		this.phoneNumber = phoneNumber;
		//this.company = company;
		this.price = price;
	}
	
	public static void setCompany(String company)
	{
		SmartPhone.company = company;
	}
	
	// ����, �߽�, �����ϱ�
	public void receive()
	{
		System.out.println("������");
	}	
	

	public void send(String number)
	{
		System.out.println(number + " �߽���");
	}
	
	public static void playGame()
	{
		System.out.println("������");
	}
}
