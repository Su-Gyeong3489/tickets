package tickets;

import java.util.ArrayList;

public class CsvValue {   //csv ��� �� �� Ŭ���� ������ ���Ͽ� �ʿ��� ���� �����ϴ� �� 

	static int DayNight;        //1. �ְ���, �߰��� ���ÿ� ���� �� ���� 
	static String SocialNums;
	static int nums;
	static int age;
	static int AgeRange;
	static int prices;
	static int discounts;
	static int ResultPrices; //��������
	
	static int choice1;
	static int choice2;
	
	static String str_AgeGroups; //������, ����, û�ҳ�, ����, ��� /ConstValueClass STR_BABIES   
	static String str_DiscountsOptions; //������� /ConstValueClass STR_DISABLED
		
	static String str_DayNight; //�ְ���, �߰��� /ConstValueClass STR_DAY, STR_NIGHT	
	static ArrayList<String> Result_DayNight = new ArrayList<String>() ; //�ְ���, �߰��� 
	static ArrayList<String> Result_AgeGroups = new ArrayList<String>() ; //���ɴ�
	static ArrayList<Integer> Result_Nums = new ArrayList<Integer>() ;    //���� arraylist
	static ArrayList<Integer> Result_prices = new ArrayList<Integer>() ;     //�������� ����
	static ArrayList<String> Result_DiscountsOptions = new ArrayList<String>() ; //������� ����	
	
	static int sum; 
}
