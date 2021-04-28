package tickets;

import java.util.ArrayList;

public class CsvValue {   //csv 출력 및 각 클래스 연결을 위하여 필요한 값을 저장하는 곳 

	static int DayNight;        //1. 주간권, 야간권 선택에 대한 값 저장 
	static String SocialNums;
	static int nums;
	static int age;
	static int AgeRange;
	static int prices;
	static int discounts;
	static int ResultPrices; //최종가격
	
	static int choice1;
	static int choice2;
	
	static String str_AgeGroups; //영유아, 소인, 청소년, 대인, 경로 /ConstValueClass STR_BABIES   
	static String str_DiscountsOptions; //우대적용 /ConstValueClass STR_DISABLED
		
	static String str_DayNight; //주간권, 야간권 /ConstValueClass STR_DAY, STR_NIGHT	
	static ArrayList<String> Result_DayNight = new ArrayList<String>() ; //주간권, 야간권 
	static ArrayList<String> Result_AgeGroups = new ArrayList<String>() ; //연령대
	static ArrayList<Integer> Result_Nums = new ArrayList<Integer>() ;    //수량 arraylist
	static ArrayList<Integer> Result_prices = new ArrayList<Integer>() ;     //최종가격 모음
	static ArrayList<String> Result_DiscountsOptions = new ArrayList<String>() ; //우대적용 모음	
	
	static int sum; 
}
