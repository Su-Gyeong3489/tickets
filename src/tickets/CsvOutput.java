package tickets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CsvOutput {

	private FileWriter fw;         //FileWriter�� �������� fw 
	private boolean IfFileExists; //�������� IfFileExists�� ��������Ȯ���� true�� false�� ������ �Ǵ�
	CsvValue csv = new CsvValue(); 

	public CsvOutput() {
		   		
		try {                                          //try, catch�� ���� ó��  
			File file = new File("result.csv");   //2. (��ü ����)result.csv ����  	
			if (file.exists() == false) {        //3. �ش� ������ �������� ������   
				IfFileExists = false;             //  IfFileExists�� false�� �����Ѵ�(#41) 
			} else {
				IfFileExists = true;              //4. �ش� ������ �����ϸ� 
			}		                               //  IfFileExists�� true�� �����Ѵ�
			fw = new FileWriter("result.csv", true); //FileWriter�� ���� 
			
		} catch (IOException e) {                  //����ó��(���� ����) 
			e.printStackTrace();
		}
	}
	
	public void fileClose() {                    //fw.close()�� csv���� ����
		try {
			fw.close();
		}	catch (IOException e) {
			e.printStackTrace();	
		}
	}
	   	
	public void headerWrite() throws IOException { //header ���(����: ������ �����ϸ� header ������� ����) 

		if (IfFileExists== false) {
			String header = "��¥," + "����,"+ "���ɴ�," + "����," + "����," +"������,"+"\n";
			fw.write(header); //���� ���� 
		}
		
	}
	
	public void printResult() throws IOException  {

		Calendar cal = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String field = sdf.format(cal.getTime()) + "," + csv.str_DayNight + "," + csv.str_AgeGroups + "," +
				String.valueOf(csv.nums) +"," + String.valueOf(csv.ResultPrices) +"," + csv.str_DiscountsOptions + ","  +"\n";	
		
		fw.append(field); //���� ���̾� ����  
			
	}

}
