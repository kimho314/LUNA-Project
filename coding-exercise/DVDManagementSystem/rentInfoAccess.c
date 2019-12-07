#include "common.h"
#include "rentInfo.h"
#include "cusInfo.h"
#include "cusInfoAccess.h"
#include "screenOut.h"

#define RENT_LEN	100

static dvdRentInfo rentList[RENT_LEN];
static int numOfRentCus = 0;

/*
* ��� : �뿩 ������ ����
* ��ȯ : void
*/
void AddRentList(char* ISBN, char* cusID, int rentDay)
{
	strcpy(rentList[numOfRentCus].ISBN, ISBN);
	strcpy(rentList[numOfRentCus].cusID, cusID);
	rentList[numOfRentCus].rentDay = rentDay;
	numOfRentCus++;
}

/*
* ��� : Ư�� ISBN�� DVD �뿩 ���� ��ü ���
* ��ȯ : void
*/
void PrintOutRentAllCusInfo(char* ISBN)
{
	cusInfo* tmp_cusInfo = NULL;
	for (int i = 0; i < numOfRentCus; i++)
	{
		fprintf(stdout, "�뿩��: %d\n", rentList[i].rentDay);
		tmp_cusInfo = GetCusPtrByID(rentList[i].cusID);
		ShowCustomerInfo(tmp_cusInfo);
	}
}

/*
* ��� : ���� �Ⱓ �ȿ� �̷��� Ư�� ���� DVD �뿩 ���� ���
* ��ȯ : void
*/
void PrintOutCusAllRentInfo(char* ID, unsigned int start, unsigned int end)
{
	for (int i = 0; i < numOfRentCus; i++)
	{
		if (!strcmp(rentList[i].cusID, ID))
		{
			if ((rentList[i].rentDay <= end) && (rentList[i].rentDay >= start))
			{
				fprintf(stdout, "--------------------------------------\n");
				fprintf(stdout, "�� ISBN : %s\n", rentList[i].ISBN);
				fprintf(stdout, "�� �뿩�� : %d\n", rentList[i].rentDay);
				fprintf(stdout, "--------------------------------------\n");
			}
		}
	}
}