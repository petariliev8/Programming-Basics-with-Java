package JavaBasics.upr7;

import java.util.Scanner;

public class Gabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzlePrice = 2.6;
        double dollPrice = 3;
        double bearPrice = 4.1;
        double minionPrice = 8.2;
        double truckPrice = 2;

        double toysPrice = 0;
        double finalPrice = 0;
        double result = 0;

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        if ((vacationPrice >= 1 && vacationPrice <= 10000) && (countPuzzles >= 0 && countPuzzles <= 1000) && (countDolls >= 0 && countDolls <= 1000) && (countBears >= 0 && countBears <= 1000) && (countMinions >= 0 && countMinions <= 1000) && (countTrucks >= 0 && countTrucks <= 1000)){
            int countAllToys = countPuzzles + countDolls + countBears + countMinions + countTrucks;
            toysPrice = countPuzzles*puzzlePrice + countDolls*dollPrice + countBears*bearPrice + countMinions*minionPrice + countTrucks*truckPrice;

            if (countAllToys >= 50){
                toysPrice = toysPrice - (toysPrice*0.25);
                finalPrice = toysPrice - (toysPrice*0.1);

                if (finalPrice >= vacationPrice){
                    result = finalPrice - vacationPrice;
                    System.out.printf("Yes! %.2f lv left.", result);
                }
                else{
                    result = vacationPrice - finalPrice;
                    System.out.printf("Not enough money! %.2f lv needed.", result);
                }
            }
            else{
                finalPrice = toysPrice - (toysPrice*0.1);
                if (finalPrice >= vacationPrice){
                    result = finalPrice - vacationPrice;
                    System.out.printf("Yes! %.2f lv left.", result);
                }
                else{
                    result = vacationPrice - finalPrice;
                    System.out.printf("Not enough money! %.2f lv needed.", result);
                }
            }
        }

    }
}

