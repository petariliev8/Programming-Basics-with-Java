package JavaBasics.Upr6;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

          double whiskyPrice =  Double.parseDouble(scanner.nextLine());
          double beer =  Double.parseDouble(scanner.nextLine());
          double wine =  Double.parseDouble(scanner.nextLine());
          double rakia =  Double.parseDouble(scanner.nextLine());
          double whisky =  Double.parseDouble(scanner.nextLine());

            if ((whiskyPrice >= 0.00 && whiskyPrice <= 10000.00) && (beer >= 0.00 && beer <= 10000.00) && (wine >= 0.00 && wine <= 10000.00) && (rakia >= 0.00 && rakia <= 10000.00) && (whisky >= 0.00 && whisky <= 10000.00)) {

                double rakiaPrice = whiskyPrice/2;
                double winePrice  = rakiaPrice - ((rakiaPrice*40)/100);
                double beerPrice  = rakiaPrice - ((rakiaPrice*80)/100);


                System.out.printf("%.2f",(whisky*whiskyPrice + beer*beerPrice + wine*winePrice + rakia*rakiaPrice));
            }


    }
}

