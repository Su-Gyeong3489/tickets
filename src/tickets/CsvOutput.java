package tickets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CsvOutput {

	private FileWriter fw;         //FileWriter의 전역변수 fw 
	private boolean IfFileExists; //전역변수 IfFileExists로 파일유무확인을 true와 false로 나누어 판단
	CsvValue csv = new CsvValue(); 

	public CsvOutput() {
		   		
		try {                                          //try, catch로 예외 처리  
			File file = new File("result.csv");   //2. (객체 생성)result.csv 생성  	
			if (file.exists() == false) {        //3. 해당 파일이 존재하지 않으면   
				IfFileExists = false;             //  IfFileExists은 false로 정의한다(#41) 
			} else {
				IfFileExists = true;              //4. 해당 파일이 존재하면 
			}		                               //  IfFileExists은 true로 정의한다
			fw = new FileWriter("result.csv", true); //FileWriter에 적기 
			
		} catch (IOException e) {                  //예외처리(예외 추적) 
			e.printStackTrace();
		}
	}
	
	public void fileClose() {                    //fw.close()로 csv파일 저장
		try {
			fw.close();
		}	catch (IOException e) {
			e.printStackTrace();	
		}
	}
	   	
	public void headerWrite() throws IOException { //header 출력(조건: 파일이 존재하면 header 출력하지 않음) 

		if (IfFileExists== false) {
			String header = "날짜," + "권종,"+ "연령대," + "수량," + "가격," +"우대사항,"+"\n";
			fw.write(header); //파일 쓰기 
		}
		
	}
	
	public void printResult() throws IOException  {

		Calendar cal = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String field = sdf.format(cal.getTime()) + "," + csv.str_DayNight + "," + csv.str_AgeGroups + "," +
				String.valueOf(csv.nums) +"," + String.valueOf(csv.ResultPrices) +"," + csv.str_DiscountsOptions + ","  +"\n";	
		
		fw.append(field); //파일 뒤이어 쓰기  
			
	}

}
