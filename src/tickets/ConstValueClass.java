package tickets;

public class ConstValueClass {
	
	final static int OPT_NA = 1;
	final static int OPT_DISABLED = 2;
	final static int OPT_VETRANS = 3;
	final static int OPT_LARGE_FAMILIES = 4;
	final static int OPT_PREGNANCY = 5;
		
	final static String STR_NA = "없음"; //해당 사항이 아닐 시 
	
	final static int DAY = 1; 
	final static int NIGHT = 2;
	
	//*출력 표시 
	final static String STR_DAY = "주간권";  
	final static String STR_NIGHT = "야간권"; 
	
	//티켓 요금 
	final static int DAYNIGHT_BABIES = 5000;
	
	final static int DAY_CHILDREN = 44000;
	final static int DAY_JUVENILES = 47000;	
	final static int DAY_ADULTS = 56000;
	final static int DAY_SENIORS = 44000;
	
	final static int NIGHT_CHILDREN = 37000;
	final static int NIGHT_JUVENILES = 40000;	
	final static int NIGHT_ADULTS = 46000;
	final static int NIGHT_SENIORS = 37000;
	
	final static int AGERANGE_BABIES = 1;    //유아 이용권: 5000원
	final static int AGERANGE_CHILDREN= 2;   // 	
	final static int AGERANGE_JUVENILES = 3;
	final static int AGERANGE_ADULTS = 4;
	final static int AGERANGE_SENIORS = 5;  
	
	//*출력 표시 	
	final static String STR_BABIES = "영유아"; 
	final static String STR_CHILDREN = "소인";
	final static String STR_JUVENILES = "청소년";
	final static String STR_ADULTS = "대인";    
	final static String STR_SENIORS = "경로";
			
	//연령 계산 시 올해년도 
	final static int THIS_YEAR = 2021;
	//할인율 
	final static double DISABLED = 0.4;
	final static double VETERANS = 0.5;
	final static double LARGE_FAMILIES = 0.2;
	final static double PREGNANCY = 0.15; 

	//*출력 표시 
	final static String STR_DISABLED = "장애인";     
	final static String STR_VETERANS = "국가유공자";
	final static String STR_LARGE_FAMILIES = "다자녀 가정";
	final static String STR_PREGNANCY = "임산부"; 
	
	final static int CHO_CONTINUE = 1;
	final static int CHO_EXIT = 2;

	
		
}
