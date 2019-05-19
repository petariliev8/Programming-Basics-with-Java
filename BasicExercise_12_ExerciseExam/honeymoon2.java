package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class honeymoon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String city = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double moneyNight2 = 0;
        double flight = 0;
        double allmoney = 0;

        switch (city) {
            case "Cairo":
                moneyNight2 = 250 * 2;
                flight = 600;
                allmoney = flight + moneyNight2 * nights;

                if (nights >= 1 && nights <= 4) {
                    allmoney = allmoney * 0.97;
                } else if (nights > 4 && nights <= 9) {
                    allmoney = allmoney * 0.95;
                } else if (nights > 9 && nights <= 24) {
                    allmoney = allmoney * 0.90;
                } else if (nights > 24 && nights <= 49) {
                    allmoney = allmoney * 0.83;
                } else if (nights >= 50) {
                    allmoney = allmoney * 0.70;
                }

                break;
            case "Paris":
                moneyNight2 = 150 * 2;
                flight = 350;
                allmoney = flight + moneyNight2 * nights;

                if (nights > 4 && nights <= 9) {
                    allmoney = allmoney * 0.93;
                } else if (nights > 9 && nights <= 24) {
                    allmoney = allmoney * 0.88;
                } else if (nights > 24 && nights <= 49) {
                    allmoney = allmoney * 0.78;
                } else if (nights >= 50) {
                    allmoney = allmoney * 0.70;
                }

                break;
            case "Lima":
                moneyNight2 = 400 * 2;
                flight = 850;
                allmoney = flight + moneyNight2 * nights;

                if (nights > 24 && nights <= 49) {
                    allmoney = allmoney * 0.81;
                } else if (nights >= 50) {
                    allmoney = allmoney * 0.70;
                }
                break;
            case "New York":
                moneyNight2 = 300 * 2;
                flight = 650;
                allmoney = flight + moneyNight2 * nights;

                if (nights >= 1 && nights <= 4) {
                    allmoney = allmoney * 0.97;
                } else if (nights > 4 && nights <= 9) {
                    allmoney = allmoney * 0.95;
                } else if (nights > 9 && nights <= 24) {
                    allmoney = allmoney * 0.88;
                } else if (nights > 24 && nights <= 49) {
                    allmoney = allmoney * 0.81;
                } else if (nights >= 50) {
                    allmoney = allmoney * 0.70;
                }

                break;
            case "Tokyo":
                moneyNight2 = 350 * 2;
                flight = 700;
                allmoney = flight + moneyNight2 * nights;

                if (nights > 9 && nights <= 24) {
                    allmoney = allmoney * 0.88;
                } else if (nights > 24 && nights <= 49) {
                    allmoney = allmoney * 0.83;
                } else if (nights >= 50) {
                    allmoney = allmoney * 0.70;
                }

                break;
        }
        if (budget >= allmoney) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
        }


    }
}

