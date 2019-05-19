package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _6_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int saveMoney = 0;
        int allmoney = 0;
        double newMoney = 0;
        

        String country = scanner.nextLine();
        double minMoney = Double.parseDouble(scanner.nextLine());


        while (true) {

            for (double save = 0; save < minMoney ; save+=newMoney) {
                newMoney = Double.parseDouble(scanner.nextLine());

            }
            System.out.println("Going to "+country+"!");

            country = scanner.nextLine();
            if (country.equals("End")) {
                break;
            }
            minMoney = Double.parseDouble(scanner.nextLine());

        }
    }
}

