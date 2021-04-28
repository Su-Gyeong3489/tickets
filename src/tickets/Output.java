package tickets;

import java.text.DecimalFormat;

public class Output {
	
	CsvValue csv = new CsvValue();
	
	public void print(int ResultPrices) {
		
		System.out.printf("������ %d �� �Դϴ�.\n", csv.ResultPrices);
		System.out.printf("�����մϴ�\n");
		System.out.printf("\n");
		
	}
	
	public void PrintResult() {
		
		csv.sum = 0;
		
		System.out.printf("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n");
		System.out.printf("\n");

		System.out.printf("======================��������===========================\n");
		
		for (int i = 0; i < csv.Result_DayNight.size(); i++) {
			System.out.printf("%s%6.4s%3.3s%3.3s%8.8s%2.2s%8.8s%8.8s\n", csv.Result_DayNight.get(i), csv.Result_AgeGroups.get(i), "X", 
					csv.Result_Nums.get(i), csv.Result_prices.get(i), "��","*�������", csv.Result_DiscountsOptions.get(i));
			csv.sum += csv.Result_prices.get(i);
		}	
		System.out.printf("\n");
		System.out.printf("����� �Ѿ��� %d �� �Դϴ�.\n", csv.sum); 
		System.out.printf("=========================================================\n");		
		
	}

}
