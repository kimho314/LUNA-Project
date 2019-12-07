#include "common.h"
#include "screenOut.h"
#include "phoneFunc.h"


enum{INPUT=1, SHOWALL, SEARCH, DELETE, CHANGE, QUIT};

int main()
{
	int inputMenu = 0;

	LoadDataFromFile();
	while (1)
	{
		ShowMenu();
		fputs("�����ϼ��� : ", stdout);
		scanf("%d", &inputMenu);
		getchar();

		switch (inputMenu)
		{
		case INPUT:
			InputPhoneData();
			break;

		case SHOWALL:
			ShowAllData();
			break;

		case SEARCH:
			SearchPhoneData();
			break;

		case DELETE:
			DeletePhoneData();
			break;

		case CHANGE:
			ChangePhoneData();
			break;
		}

		if (inputMenu == QUIT)
		{
			StoreDataToFile();
			puts("�̿��� �ּż� ������~");
			break;
		}
	}

	return 0;
}