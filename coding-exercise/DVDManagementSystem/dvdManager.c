#include "common.h"
#include "dvdInfo.h"
#include "dvdInfoAccess.h"
#include "screenOut.h"
#include "dvdManager.h"

extern void PrintOutRentAllCusInfo(char* ISBN);
extern void PrintOutCusAllRentInfo(char* ID, unsigned int start, unsigned int end);

void RegistDvd()
{
	char ISBN[ISBN_LEN] = { 0 };
	char title[TITLE_LEN] = { 0 };
	int genre = 0;
	int ret = -1;

	while (1)
	{
		printf("ISBN�Է�: ");
		fgets(ISBN, ISBN_LEN, stdin);
		if (IsRegistISBN(ISBN))
		{
			puts("�ش� ISBN�� ��� �߿� �ֽ��ϴ�.");
			continue;
		}
		else
			break;
	}
	printf("���� �Է�: ");
	fgets(title, TITLE_LEN, stdin);
	printf("�帣 �Է�(1.ACTION, 2.COMIC, 3.SF, 4.ROMANTIC): ");
	scanf("%d", &genre);

	ret = AddDvdInfo(ISBN, title, genre);
	if (ret)
	{
		puts("DVD ���� �߰��� �Ϸ�Ǿ����ϴ�.");
		getchar();
	}
	else
		return;
}

void SearchDvdInfo()
{
	char ISBN[ISBN_LEN] = { 0 };
	dvdInfo* tmp_dvdinfo = NULL;

	printf("ã�� ISBN�Է�: ");
	fgets(ISBN, ISBN_LEN, stdin);
	tmp_dvdinfo = GetDvdPtrByISBN(ISBN);
	if (tmp_dvdinfo != NULL)
	{
		ShowDvdInfo(tmp_dvdinfo);
		puts("��ȸ�� �Ϸ�Ǿ����ϴ�.");
	}
	else
	{
		puts("�ش� ISBN�� ��ȸ�� �� �����ϴ�.");
		getchar();
		return;
	}
}

void RentDvd()
{
	char ISBN[ISBN_LEN] = { 0 };
	int ret = -1;

	printf("�뿩 DVD ISBN �Է�: ");
	fgets(ISBN, ISBN_LEN, stdin);
	if (IsRentedISBN(ISBN) == 1)
	{
		puts("�뿩�� �����մϴ�. �뿩 ������ �����մϴ�.");
		ret = AddRentInfo(ISBN);
		if (ret)
		{
			puts("�뿩�� �Ϸ� �Ǿ����ϴ�.");
		}
	}
	else
	{
		puts("�뿩�� �Ұ����մϴ�.");
	}

	getchar();
}

void ReturnDvd()
{
	char ISBN[ISBN_LEN] = { 0 };
	int ret = -1;

	printf("�뿩 DVD ISBN �Է�: ");
	fgets(ISBN, ISBN_LEN, stdin);
	if (IsRentedISBN(ISBN) == 0)
	{
		if (ReturnRentedInfo(ISBN))
		{
			puts("�ݳ��� �Ϸ� �Ǿ����ϴ�.");
		}
	}
	else
	{
		puts("�ݳ��� ��ų� ���� DVD�Դϴ�.");
	}

	getchar();
}

void ShowRentCusInfo()
{
	char ISBN[ISBN_LEN] = { 0 };
	int ret = -1;

	printf("ã�� DVD ISBN �Է�: ");
	fgets(ISBN, ISBN_LEN, stdin);
	if (IsRentedISBN(ISBN) != -1)
	{
		PrintOutRentAllCusInfo(ISBN);
		puts("��ȸ�� �Ϸ�Ǿ����ϴ�.");
		getchar();
	}
}

void ShowCusRentInfo()
{
	char ID[ID_LEN] = { 0 };
	int ret = -1;
	int start_day = 0, end_day = 0;

	printf("ã�� ID �Է�: ");
	fgets(ID, ISBN_LEN, stdin);
	printf("���� ��¥�� ������ ��¥ �Է�(YYYYMMDD): ");
	scanf("%d %d", &start_day, &end_day);
	PrintOutCusAllRentInfo(ID, start_day, end_day);
	puts("��ȸ�� �Ϸ�Ǿ����ϴ�.");
	getchar();
}