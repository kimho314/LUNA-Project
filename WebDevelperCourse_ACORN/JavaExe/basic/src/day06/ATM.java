package day06;

public class ATM {
	// �ɹ� �������� �����̱� ����
	// access modifier : ����������, ����������
	private int balance;
	private String name;
	private String accountNo;
	
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	ATM()
	{
		balance = 0;
		name = "none";
		accountNo = "none";
	}
	
	ATM(int balance, String name, String accountNo)
	{
		this.balance = balance;
		this.name = name;
		this.accountNo = accountNo;
	}
	
	ATM(ATM a)
	{
		this.balance = a.balance;
		this.name = a.name;
		this.accountNo = a.accountNo;
	}
	
	// a�� ��ŭ �Ա�
	void deposit(int a)
	{		
		balance += a;		
		System.out.println(a + "�� ��ŭ �Ա��մϴ�. " + "���� �ܾ� : " + balance);
	}
	
	// a����ŭ ���
	void withdraw(int a)
	{
		if(a > balance)
		{
			System.out.println("���� �ܾ��� �����մϴ�." + "���� �ܾ� : " + balance);
		}
		else
		{
			balance -= a;
			System.out.println(a + "�� ��ŭ ����մϴ�. " + "���� �ܾ� : " + balance);
		}
	}
}
