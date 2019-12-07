#include "common.h"
#include "cusInfo.h"
#include "dvdInfo.h"

/* ���α׷� ����� ���� �޴� */
void ShowMenu()
{
	system("cls");

	printf("------- �� �� -------\n");
	printf("1. �ű԰��� \n");
	printf("2. ���˻� \n");
	printf("---------------------\n");
	printf("3. DVD ��� \n");
	printf("4. DVD �˻� \n");
	printf("---------------------\n");
	printf("5. DVD �뿩 \n");
	printf("6. DVD �ݳ� \n");
	printf("---------------------\n");
	printf("7. DVD �뿩�� ��ü ��ȸ \n");
	printf("8. Ư�� �� DVD �뿩 ���� ��ȸ\n");
	printf("---------------------\n");
	printf("9. ����\n");
	printf("---------------------\n");
	printf("����> ");
}

/* �� ������ �⺻ ���� ��� */
void ShowCustomerInfo(cusInfo* pCus)
{
	printf("-----------------------\n");
	printf("> ID: %s\n", pCus->ID);
	printf("> �̸�: %s\n", pCus->name);
	printf("> ��ȭ��ȣ: %s\n", pCus->phoneNum);
	printf("-----------------------\n\n");

	getchar();
}

/* DVD �⺻ ���� ��� */
void ShowDvdInfo(dvdInfo* pDvd)
{
	printf("-----------------------\n");
	printf("> ISBN: %s\n", pDvd->ISBN);
	printf("> ����: %s\n", pDvd->title);
	printf("> �帣: %d\n", pDvd->genre);
	printf("-----------------------\n\n");

	getchar();
}
