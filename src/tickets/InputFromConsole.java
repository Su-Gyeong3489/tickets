package tickets;

import java.util.Collections;
import java.util.Scanner;

public class InputFromConsole {
	
	CsvValue csv = new CsvValue();
	
	public int InputDayNight() {
		
		System.out.printf("������ �����ϼ���\n");
		System.out.printf("1. �ְ���\n");
		System.out.printf("2. �߰���\n");
		
		Scanner scanner = new Scanner(System.in);
		csv.DayNight = scanner.nextInt();		
		
		if (csv.DayNight == ConstValueClass.DAY) {
			System.out.printf("%d�� %s\n", ConstValueClass.DAY, ConstValueClass.STR_DAY);	
			System.out.printf("-------------------------------------------\n");
			csv.str_DayNight = ConstValueClass.STR_DAY;
		} else if (csv.DayNight == ConstValueClass.NIGHT) {
			System.out.printf("%d�� %s\n", ConstValueClass.NIGHT, ConstValueClass.STR_NIGHT);
			System.out.printf("-------------------------------------------\n");
			csv.str_DayNight = ConstValueClass.STR_NIGHT;
		} else {
			System.out.printf("�Է��Ͻ� ��ȣ�� ��ȿ���� �ʴ� ��ȣ�Դϴ�");
			System.out.printf("-------------------------------------------\n");
		}	
		
		Collections.addAll(csv.Result_DayNight, csv.str_DayNight); 
		
		return csv.DayNight; 
		
	}
	
	public String InputSocialNums() {
		try {
			System.out.printf("�ֹι�ȣ�� �Է��ϼ���.('-' ���� 13�ڸ�)\n");		
			Scanner scanner = new Scanner(System.in);
			csv.SocialNums = scanner.nextLine();			
			System.out.printf("%s\n", csv.SocialNums);
			System.out.printf("-------------------------------------------\n");
		} catch (ArithmeticException e) {
			System.out.println("��ȿ���� �ʴ� �ֹι�ȣ�Դϴ�. '-'�� ������ 13�ڸ��� �Է����ּ���");
		}
		return csv.SocialNums;	
	}

	public int InputNums() {
		
		try {	
			System.out.printf("Ƽ�� ����� �Է��ϼ���.\n");
			Scanner scanner = new Scanner(System.in);
			csv.nums = scanner.nextInt();
			System.out.printf("%d��\n", csv.nums);
			System.out.printf("-------------------------------------------\n");
			Collections.addAll(csv.Result_Nums, csv.nums);
		} catch (Exception e) {
			System.out.println("��ȿ���� �ʴ� ��ȣ�Դϴ�.");
		}
		return csv.nums;
						
	}
	
	public int InputDiscounts() {
		
		System.out.printf("�������� �����ϼ���\n");
		System.out.printf("1. ����(���ɿ� ���� ���� �ڵ� ó��)\n");
		System.out.printf("2. �����\n");
		System.out.printf("3. ����������\n");
		System.out.printf("4. ���ڳ�\n");
		System.out.printf("5. �ӻ��\n");
		
		Scanner scanner = new Scanner(System.in);
		csv.discounts = scanner.nextInt();
		
		if (csv.discounts == ConstValueClass.OPT_NA) {
			System.out.printf("%d�� %s\n", csv.discounts, ConstValueClass.STR_NA);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_NA;
		} else if (csv.discounts == ConstValueClass.OPT_DISABLED) {
			System.out.printf("%d�� %s\n", csv.discounts, ConstValueClass.STR_DISABLED);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_DISABLED;
		} else if (csv.discounts == ConstValueClass.OPT_VETRANS) {
			System.out.printf("%d�� %s\n", csv.discounts, ConstValueClass.STR_VETERANS);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_VETERANS;			
		} else if (csv.discounts == ConstValueClass.OPT_LARGE_FAMILIES) {
			System.out.printf("%d�� %s\n", csv.discounts, ConstValueClass.STR_LARGE_FAMILIES);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_LARGE_FAMILIES;	
		} else if (csv.discounts == ConstValueClass.OPT_PREGNANCY) {
			System.out.printf("%d�� %s\n", csv.discounts, ConstValueClass.STR_PREGNANCY);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_PREGNANCY;
		} else {
			System.out.printf("�Է��Ͻ� ��ȣ�� ��ȿ���� �ʴ� ��ȣ�Դϴ�");
			System.out.printf("-------------------------------------------\n");
		}
		 
		Collections.addAll(csv.Result_DiscountsOptions, csv.str_DiscountsOptions); 
		
		return csv.discounts; 
		
	}
	
	public int inputChoice1() {
		
		
		
		System.out.printf("��� �߱��Ͻðڽ��ϱ�?\n");
		System.out.printf("1. Ƽ�� �߱�\n");
		System.out.printf("2. ����\n");
		
		Scanner scanner = new Scanner(System.in);
		csv.choice1 = scanner.nextInt();

		return csv.choice1;		
	}
	
	public int inputChoice2() {
		
		
		System.out.printf("��� �����Ͻðڽ��ϱ�?\n");
		System.out.printf("1. ���ο� �ֹ�\n");
		System.out.printf("2. ���α׷� ����\n");		
		
		Scanner scanner = new Scanner(System.in);
		csv.choice2 = scanner.nextInt();
		
		return csv.choice2;
	}
	
}
