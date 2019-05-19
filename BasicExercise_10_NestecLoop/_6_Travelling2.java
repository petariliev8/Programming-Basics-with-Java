package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _6_Travelling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String country = scanner.nextLine();
            if (country.equals("End")) {
                break;
            }
            double travellingCost = Double.parseDouble(scanner.nextLine());

            for (int i = 0; travellingCost > 0; i++) {
                double saveMoney = Double.parseDouble(scanner.nextLine());
                travellingCost -= saveMoney;
                if (travellingCost <= 0) {
                    System.out.println("Going to " + country + "!");
                    break;
                }


            }

        }

    }
}

