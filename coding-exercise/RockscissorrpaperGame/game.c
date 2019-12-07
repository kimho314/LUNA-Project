#include <time.h>
#include "common.h"
#include "game.h"

int ChoiceOfCom()
{
	int num = 0;

	srand((unsigned int)time(NULL));
	num = rand() % 3 + 1;

	return num;
}

int ChoiceOfMe()
{
	int choice = 0;

	printf("����<1> ����<2> ��<3>  ����<4> ����?  ");
	scanf("%d", &choice);
	assert(choice == 1 || choice == 2 || choice == 3 || choice == 4);
	

	return choice;
}

int WhoIsWinner(int com, int you)
{
	int ret = 0;

	if (com > you)
	{
		puts("��ǻ���� �¸��Դϴ�!");
		ret = 1;
	}
	else if (you > com)
	{
		puts("����� �¸��Դϴ�!");
		ret = 2;
	}
	else if ((com == 1) && (you == 3))
	{
		puts("��ǻ���� �¸��Դϴ�!");
		ret = 1;
	}
	else if ((com == 3) && (you == 1))
	{
		puts("����� �¸��Դϴ�!");
		ret = 2;
	}
	else
		puts("�����ϴ�!");
	
	return ret;
}