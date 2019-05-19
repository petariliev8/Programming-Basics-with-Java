package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class fenStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int item =Integer.parseInt(scanner.nextLine());
        int counter = item;
        int allmoney = 0;
        int moneyItem = 0;

        while (counter>0) {
            String nameItem = scanner.nextLine();
            counter--;
            switch (nameItem) {
                case "hoodie":
                    moneyItem=30;
                    break;
                case "keychain":
                    moneyItem=4;
                    break;
                case "T-shirt":
                    moneyItem=20;
                    break;
                case "flag":
                    moneyItem=15;
                    break;
                case "sticker":
                    moneyItem=1;
                    break;
            }
            allmoney+=moneyItem;



        }
        if ((budget-allmoney)>=0) {
            System.out.printf("You bought %d items and left with %d lv.",item,(budget-allmoney));
        } else {
            System.out.printf("Not enough money, you need %d more lv.",(allmoney-budget));
        }

    }
}

