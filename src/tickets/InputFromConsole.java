package tickets;

import java.util.Collections;
import java.util.Scanner;

public class InputFromConsole {
	
	CsvValue csv = new CsvValue();
	
	public int InputDayNight() {
		
		System.out.printf("권종을 선택하세요\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
		
		Scanner scanner = new Scanner(System.in);
		csv.DayNight = scanner.nextInt();		
		
		if (csv.DayNight == ConstValueClass.DAY) {
			System.out.printf("%d번 %s\n", ConstValueClass.DAY, ConstValueClass.STR_DAY);	
			System.out.printf("-------------------------------------------\n");
			csv.str_DayNight = ConstValueClass.STR_DAY;
		} else if (csv.DayNight == ConstValueClass.NIGHT) {
			System.out.printf("%d번 %s\n", ConstValueClass.NIGHT, ConstValueClass.STR_NIGHT);
			System.out.printf("-------------------------------------------\n");
			csv.str_DayNight = ConstValueClass.STR_NIGHT;
		} else {
			System.out.printf("입력하신 번호는 유효하지 않는 번호입니다");
			System.out.printf("-------------------------------------------\n");
		}	
		
		Collections.addAll(csv.Result_DayNight, csv.str_DayNight); 
		
		return csv.DayNight; 
		
	}
	
	public String InputSocialNums() {
		try {
			System.out.printf("주민번호를 입력하세요.('-' 제외 13자리)\n");		
			Scanner scanner = new Scanner(System.in);
			csv.SocialNums = scanner.nextLine();			
			System.out.printf("%s\n", csv.SocialNums);
			System.out.printf("-------------------------------------------\n");
		} catch (ArithmeticException e) {
			System.out.println("유효하지 않는 주민번호입니다. '-'를 제외한 13자리를 입력해주세요");
		}
		return csv.SocialNums;	
	}

	public int InputNums() {
		
		try {	
			System.out.printf("티켓 장수를 입력하세요.\n");
			Scanner scanner = new Scanner(System.in);
			csv.nums = scanner.nextInt();
			System.out.printf("%d장\n", csv.nums);
			System.out.printf("-------------------------------------------\n");
			Collections.addAll(csv.Result_Nums, csv.nums);
		} catch (Exception e) {
			System.out.println("유효하지 않는 번호입니다.");
		}
		return csv.nums;
						
	}
	
	public int InputDiscounts() {
		
		System.out.printf("우대사항을 선택하세요\n");
		System.out.printf("1. 없음(연령에 따른 우대는 자동 처리)\n");
		System.out.printf("2. 장애인\n");
		System.out.printf("3. 국가유공자\n");
		System.out.printf("4. 다자녀\n");
		System.out.printf("5. 임산부\n");
		
		Scanner scanner = new Scanner(System.in);
		csv.discounts = scanner.nextInt();
		
		if (csv.discounts == ConstValueClass.OPT_NA) {
			System.out.printf("%d번 %s\n", csv.discounts, ConstValueClass.STR_NA);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_NA;
		} else if (csv.discounts == ConstValueClass.OPT_DISABLED) {
			System.out.printf("%d번 %s\n", csv.discounts, ConstValueClass.STR_DISABLED);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_DISABLED;
		} else if (csv.discounts == ConstValueClass.OPT_VETRANS) {
			System.out.printf("%d번 %s\n", csv.discounts, ConstValueClass.STR_VETERANS);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_VETERANS;			
		} else if (csv.discounts == ConstValueClass.OPT_LARGE_FAMILIES) {
			System.out.printf("%d번 %s\n", csv.discounts, ConstValueClass.STR_LARGE_FAMILIES);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_LARGE_FAMILIES;	
		} else if (csv.discounts == ConstValueClass.OPT_PREGNANCY) {
			System.out.printf("%d번 %s\n", csv.discounts, ConstValueClass.STR_PREGNANCY);
			System.out.printf("-------------------------------------------\n");
			csv.str_DiscountsOptions = ConstValueClass.STR_PREGNANCY;
		} else {
			System.out.printf("입력하신 번호는 유효하지 않는 번호입니다");
			System.out.printf("-------------------------------------------\n");
		}
		 
		Collections.addAll(csv.Result_DiscountsOptions, csv.str_DiscountsOptions); 
		
		return csv.discounts; 
		
	}
	
	public int inputChoice1() {
		
		
		
		System.out.printf("계속 발권하시겠습니까?\n");
		System.out.printf("1. 티켓 발권\n");
		System.out.printf("2. 종료\n");
		
		Scanner scanner = new Scanner(System.in);
		csv.choice1 = scanner.nextInt();

		return csv.choice1;		
	}
	
	public int inputChoice2() {
		
		
		System.out.printf("계속 진행하시겠습니까?\n");
		System.out.printf("1. 새로운 주문\n");
		System.out.printf("2. 프로그램 종료\n");		
		
		Scanner scanner = new Scanner(System.in);
		csv.choice2 = scanner.nextInt();
		
		return csv.choice2;
	}
	
}
