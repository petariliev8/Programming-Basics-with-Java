package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sectors = Double.parseDouble(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());

        double oneSector = capacity/sectors;
        double moneyFull = capacity*ticketPrice;
        double charity = ((moneyFull-(oneSector*ticketPrice*0.75))/8);

        System.out.printf("Total income - %.2f BGN%n",moneyFull);
        System.out.printf("Money for charity - %.2f BGN",charity);
    }
}

