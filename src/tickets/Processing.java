package tickets;

import java.util.Collections;

public class Processing {
	
	CsvValue csv = new CsvValue();
	InputFromConsole Input = new InputFromConsole();
	Output output = new Output();	
	
	public int ages(String SocialNums) { //String SocialNums//Input
	
		String BirthYear = ""; 
		
		if (csv.SocialNums.charAt(6) == '1' || csv.SocialNums.charAt(6) == '2' || csv.SocialNums.charAt(6) == '5' || csv.SocialNums.charAt(6) == '6') {
			 BirthYear += "19";
			 BirthYear += String.valueOf(csv.SocialNums.charAt(0)); //String, CharAt 
			 BirthYear += String.valueOf(csv.SocialNums.charAt(1));
			 csv.age = ConstValueClass.THIS_YEAR - Integer.parseInt(BirthYear); 
								 
		} else if (csv.SocialNums.charAt(6) == '3' || csv.SocialNums.charAt(6) == '4' || csv.SocialNums.charAt(6) == '7' || csv.SocialNums.charAt(6) == '8') {
			BirthYear += "20";
			BirthYear += String.valueOf(csv.SocialNums.charAt(0));
			BirthYear += String.valueOf(csv.SocialNums.charAt(1));
			csv.age = ConstValueClass.THIS_YEAR - Integer.parseInt(BirthYear); 

		}
		
		return csv.age; 
		
	}
	
	public int AgeRange(int age) {
		
		if (age >= 0 && age < 3) {                         //36개월 미만 
			csv.AgeRange = ConstValueClass.AGERANGE_BABIES;
			csv.str_AgeGroups = ConstValueClass.STR_BABIES;			
		} else if (age >= 3 && age <= 12) {               //소인: 36개월~만 12세  
			csv.AgeRange = ConstValueClass.AGERANGE_CHILDREN;
			csv.str_AgeGroups = ConstValueClass.STR_CHILDREN;	
		} else if (age > 12 && age <= 18) {               //청소년: 만 13세~만 18세   
			csv.AgeRange = ConstValueClass.AGERANGE_JUVENILES;
			csv.str_AgeGroups = ConstValueClass.STR_JUVENILES;
		} else if (age > 18 && age <= 64 ) {              //대인
			csv.AgeRange = ConstValueClass.AGERANGE_ADULTS;
			csv.str_AgeGroups = ConstValueClass.STR_ADULTS;
		} else if (age > 64) {                            //경로: 만 65세~  
			csv.AgeRange = ConstValueClass.AGERANGE_SENIORS;
			csv.str_AgeGroups = ConstValueClass.STR_SENIORS;
		}
		 
		Collections.addAll(csv.Result_AgeGroups, csv.str_AgeGroups);
		return csv.AgeRange;		
	}
	
	public int prices(int DayNight, int AgeRange) {
				
		if (csv.DayNight== ConstValueClass.DAY && csv.AgeRange == ConstValueClass.AGERANGE_BABIES) {           //주간권, 영유아  
			csv.prices = ConstValueClass.DAYNIGHT_BABIES * csv.nums;
		} else if (csv.DayNight == ConstValueClass.DAY && csv.AgeRange == ConstValueClass.AGERANGE_CHILDREN) { //주간권, 소인 
			csv.prices = ConstValueClass.DAY_CHILDREN * csv.nums;
		} else if (csv.DayNight == ConstValueClass.DAY && csv.AgeRange == ConstValueClass.AGERANGE_JUVENILES) {//주간권, 청소년 
			csv.prices = ConstValueClass.DAY_JUVENILES * csv.nums;
		} else if (csv.DayNight == ConstValueClass.DAY && csv.AgeRange == ConstValueClass.AGERANGE_ADULTS) {   //주간권, 성인
			csv.prices = ConstValueClass.DAY_ADULTS * csv.nums;
		} else if (csv.DayNight == ConstValueClass.DAY && csv.AgeRange == ConstValueClass.AGERANGE_SENIORS) {  //주간권, 경로 
			csv.prices = ConstValueClass.DAY_SENIORS * csv.nums;
		} else if (csv.DayNight == ConstValueClass.NIGHT && csv.AgeRange == ConstValueClass.AGERANGE_BABIES) { //야간권, 영유아
			csv.prices = ConstValueClass.DAYNIGHT_BABIES * csv.nums;
		} else if (csv.DayNight == ConstValueClass.NIGHT && csv.AgeRange == ConstValueClass.AGERANGE_CHILDREN) { //야간권, 소인
			csv.prices = ConstValueClass.NIGHT_CHILDREN * csv.nums;
		} else if (csv.DayNight == ConstValueClass.NIGHT && csv.AgeRange == ConstValueClass.AGERANGE_JUVENILES) { //야간권, 청소년
			csv.prices = ConstValueClass.NIGHT_JUVENILES * csv.nums;
		} else if (csv.DayNight == ConstValueClass.NIGHT && csv.AgeRange == ConstValueClass.AGERANGE_ADULTS) {    //야간권, 성인  
			csv.prices = ConstValueClass.NIGHT_ADULTS * csv.nums;
		} else if (csv.DayNight == ConstValueClass.NIGHT && csv.AgeRange == ConstValueClass.AGERANGE_SENIORS) {  //야간권, 경로 
			csv.prices = ConstValueClass.NIGHT_SENIORS * csv.nums;
		} 			
		 
		return csv.prices;
		
	}
	
	public int ResultPrices(int discounts) {
		
		if (csv.discounts == ConstValueClass.OPT_NA) {
			csv.ResultPrices = csv.prices;
		} else if (csv.discounts == ConstValueClass.OPT_DISABLED) {
			csv.ResultPrices = ((int)(((csv.prices - csv.prices * ConstValueClass.DISABLED) + 9) / 10) * 10);
		} else if (csv.discounts == ConstValueClass.OPT_VETRANS) {
			csv.ResultPrices = ((int)(((csv.prices - csv.prices * ConstValueClass.VETERANS) + 9) / 10) * 10);
		} else if (csv.discounts == ConstValueClass.OPT_LARGE_FAMILIES) {
			csv.ResultPrices = ((int)(((csv.prices - csv.prices * ConstValueClass.LARGE_FAMILIES) + 9) / 10) * 10);
		} else if (csv.discounts == ConstValueClass.OPT_PREGNANCY) {
			csv.ResultPrices = ((int)(((csv.prices - csv.prices * ConstValueClass.PREGNANCY) + 9) / 10) * 10);
		}
				
		output.print(csv.ResultPrices);
		Collections.addAll(csv.Result_prices, csv.ResultPrices);
		return csv.ResultPrices;
		
	}
	
}
