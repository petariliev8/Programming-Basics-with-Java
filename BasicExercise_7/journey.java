package JavaBasics.upr10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");

        double Money = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneySeason = 0.0;



            if (Money <= 100) {
            switch (season) {
                case "summer":
                    moneySeason = Money * 0.3;
                    break;
                case "winter":
                    moneySeason = Money * 0.7;
                    break;


            }
                if (season.equals("summer")) {
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f",moneySeason);
                } else if (season.equals("winter")) {
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f",moneySeason);
                }
        } else if ((Money > 100) && (Money <= 1000)) {
                switch (season) {
                    case "summer":
                        moneySeason = Money * 0.4;
                        break;
                    case "winter" :
                        moneySeason = Money * 0.8;
                        break;

                }
                if (season.equals("summer")) {
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f",moneySeason);
                } else if (season.equals("winter")) {
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f",moneySeason);
                }
            }else if (Money > 1000) {
               moneySeason = Money*0.9;

               if (season.equals("summer")) {
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",moneySeason);
                } else if (season.equals("winter")) {
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",moneySeason);
                }
            }

    }
}