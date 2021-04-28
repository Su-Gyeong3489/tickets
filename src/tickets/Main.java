package tickets;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		CsvValue csv = new CsvValue();
		InputFromConsole input = new InputFromConsole(); 
		Processing calc = new Processing();
		CsvOutput csvOutput = new CsvOutput(); 
		Output output = new Output();


		csvOutput.headerWrite();

		do {
			input.InputDayNight();            			
			input.InputSocialNums();         
			input.InputNums();
			input.InputDiscounts();

			calc.ages(csv.SocialNums);
			calc.AgeRange(csv.age);
			calc.prices(csv.DayNight, csv.AgeRange);
			calc.ResultPrices(csv.discounts);			
			csvOutput.printResult();

			csv.choice1 = input.inputChoice1();
			if (csv.choice1 == ConstValueClass.CHO_CONTINUE) {
				continue;

			} else if (csv.choice1 == ConstValueClass.CHO_EXIT) {

				output.PrintResult();

				csv.choice2 = input.inputChoice2();

			}

		} while (csv.choice2 != ConstValueClass.CHO_EXIT);

		scan.close();
		csvOutput.fileClose();

	}

}
