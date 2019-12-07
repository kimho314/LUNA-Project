#include "common.h"
#include "cusInfo.h"
#include "cusInfoAccess.h"
#include "screenOut.h"
#include "cusManager.h"

/*
* ���: �ű� ȸ�� ����
* ��ȯ: void
*/
void RegistCustomer()
{
	char ID[ID_LEN] = { 0 };
	char name[NAME_LEN] = { 0 };
	char num[PHONE_LEN] = { 0 };

	while (1)
	{
		printf("ID�Է�: ");
		fgets(ID, ID_LEN, stdin);
		if (IsRegistID(ID))
		{
			puts("�ش� ID�� ��� �߿� �ֽ��ϴ�.");
			getchar();
			continue;
		}
		else
			break;
	}
	printf("�̸� �Է�: ");
	fgets(name, NAME_LEN, stdin);
	printf("��ȭ��ȣ �Է�: ");
	fgets(num, PHONE_LEN, stdin);
	
	if (AddCusInfo(ID, name, num))
	{
		puts("������ �Ϸ�Ǿ����ϴ�");
	}
}

/*
* ���: ID�� ���� ȸ�� ���� �˻�
* ��ȯ: void
*/
void SearchCusInfo()
{
	char ID[ID_LEN] = { 0 };
	cusInfo* tmp_cusInfo = NULL;

	printf("ã�� ID �Է�: ");
	fgets(ID, ID_LEN, stdin);
	tmp_cusInfo = GetCusPtrByID(ID);
	if (tmp_cusInfo != NULL)
	{
		ShowCustomerInfo(tmp_cusInfo);
		puts("��ȸ�� �Ϸ�Ǿ����ϴ�.");
	}
	else
	{
		puts("�ش� ID�� ��ȸ�� �� �����ϴ�.");
		getchar();
		return;
	}
}

