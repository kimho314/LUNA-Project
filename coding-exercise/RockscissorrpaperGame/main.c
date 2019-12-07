#include "common.h"
#include "game.h"
#include "gameTime.h"
#include "gameMoney.h"
#include "gameContinue.h"

int main()
{
	int com = 0;
	int you = 0;
	int ret = -1;
	

	ret = setGameContinue();
	
	if (ret == 0)
	{
		puts("��! ������ �����մϴ�.");
		puts("");
		InitGamerMoney();
		printf("\n");
	}

	while (1)
	{
		UpdateBetMoney();
		puts("�١١١١١� ���! �١١١١١�!!");
		com = ChoiceOfCom();
		you = ChoiceOfMe();
		if (you == 4)
		{			
			ShowResult();
			break;
		}
		puts("");


		puts("�١١١١١� ���! �١١١١١�!!");
		ret = WhoIsWinner(com, you);

		if (com == SCISSOR)
			puts("> ��ǻ���� ������ ����. ");
		else if (com == ROCK)
			puts("> ��ǻ���� ������ ����. ");
		else
			puts("> ��ǻ���� ������ ��");

		if (you == SCISSOR)
			puts("> ����� ������ ����. ");
		else if (you == ROCK)
			puts("> ����� ������ ����. ");
		else
			puts("> ����� ������ ��");

		puts("");
		cal_winning_rate(ret);
		ret = UpdateMoney(ret);
		if (ret == 1 || ret == 2)
		{
			ShowResult();
			break;
		}
		ShowMoney();
		printf("\n");
	}
	

	return 0;
}