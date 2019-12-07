#include "common.h"
#include "cusInfo.h"

#define MAX_CUSTOMER	100

static cusInfo* cusList[MAX_CUSTOMER];
static int numOfCustomer = 0;

/*
* ���: cusInfo �Ҵ� �� ����
* ��ȯ: ���� �� '��ϵ� ������ ����', ���� �� 0 ��ȯ
*/
int AddCusInfo(char* ID, char* name, char* num)
{
	cusList[numOfCustomer] = (cusInfo*)malloc(sizeof(cusInfo));
	memset(cusList[numOfCustomer], 0, sizeof(cusList[numOfCustomer]));
	strcpy(cusList[numOfCustomer]->ID, ID);
	strcpy(cusList[numOfCustomer]->name, name);
	strcpy(cusList[numOfCustomer]->phoneNum, num);
	numOfCustomer++;
	
	if (cusList[numOfCustomer - 1] == NULL)
		return 0;
	else
		return numOfCustomer;
}

/*
* ���: �ش� ID�� ������ ��� �ִ� ������ ������ ��ȯ
* ��ȯ: ��� �ȵ� ID�� ��� NULL ������ ��ȯ
*/
cusInfo* GetCusPtrByID(char* ID)
{
	for (int i = 0; i < numOfCustomer; i++)
	{
		if (!strcmp(cusList[i]->ID, ID))
			return cusList[i];
	}

	return NULL;
}

/*
* ���: �ش� ID�� ������ ��� �ִ� ������ ����
* ��ȯ: void
*/
void DelCusPtrByID(char* ID)
{
	for (int i = 0; i < numOfCustomer; i++)
	{
		if (!strcmp(cusList[i]->ID, ID))
		{
			free(cusList[i]);
			numOfCustomer--;
			puts("delete complete");
		}
	}

}

/*
* ���: ���� �� ID���� Ȯ��
* ��ȯ: ���� �Ǿ����� 1, �ƴϸ� 0��ȯ
*/
int IsRegistID(char* ID)
{
	for (int i = 0; i < numOfCustomer; i++)
	{
		if (!strcmp(cusList[i]->ID, ID))
			return 1;
	}
	return 0;
}