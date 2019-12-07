#include "common.h"
#include "gameMoney.h"


int betMoney = 0;
int comMoney = 1000;
int youMoney = 0;


int UpdateMoney(int ret)
{
	int err = 0;

	if (ret == 1)
	{
		comMoney += betMoney;
		youMoney -= betMoney;
	}
	if (ret == 2)
	{
		comMoney -= betMoney;
		youMoney += betMoney;
	}

	if (comMoney == 0)
	{
		err = 1;
	}
	if (youMoney == 0)
	{
		err = 2;
	}

	return err;
}

void ShowMoney()
{
	printf("���̸� �Ӵ�: %5d\n", youMoney);
	printf("��ǻ�� �Ӵ�: %5d\n", comMoney);
}

void InitGamerMoney()
{
	int gamerMoney = 0;

	printf("# ����� �Ӵϸ� �Է��ϼ���: ");
	scanf("%d", &gamerMoney);
	assert(gamerMoney > 0);

	youMoney = gamerMoney;
	ShowMoney();
}

void UpdateBetMoney()
{
	int money = 0;
	
	while (1)
	{
		printf("�ǵ��� �����մϴ�: ");
		scanf("%d", &money);
		assert(money > 0);

		if (money > youMoney)
		{
			printf("�����ϰ� �ִ� �ݾ� ������ �ż���!\n");
			continue;
		}
		else if (money > comMoney)
		{
			printf("��ǻ�� ���� �ݾ� �ʰ��Դϴ�!\n");
			continue;
		}
		else
			break;

	}
	betMoney = money;
}

void setMoney(int comMoney_in, int gamerMoney_in)
{
	comMoney = comMoney_in;
	youMoney = gamerMoney_in;
}

int getComMoney()
{
	return comMoney;
}

int getGamerMoney()
{
	return youMoney;
}

