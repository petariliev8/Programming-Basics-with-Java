package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class honeymoon {
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
                break;
            case "Paris":
                moneyNight2 = 150 * 2;
                flight = 350;
                break;
            case "Lima":
                moneyNight2 = 400 * 2;
                flight = 850;
                break;
            case "New York":
                moneyNight2 = 300 * 2;
                flight = 650;
                break;
            case "Tokyo":
                moneyNight2 = 350 * 2;
                flight = 700;
                break;
        }
        if (nights >= 1 && nights <= 4) {
            if (city.equals("Cairo") || city.equals("New York")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 3;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            } else {
                allmoney = (flight + moneyNight2 * nights);
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            }
        } else  if (nights > 4 && nights <= 9) {
            if (city.equals("Cairo") || city.equals("New York")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 5;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            } else if (city.equals("Paris")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 7;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }

            } else {
                allmoney = (flight + moneyNight2 * nights);
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            }
        }else if (nights > 9 && nights <= 24) {
            if (city.equals("Cairo")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 10;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            } else if (city.equals("Paris") || city.equals("New York")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 12;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            } else {
                allmoney = (flight + moneyNight2 * nights);
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            }
        }else if (nights > 24 && nights <= 49) {
            if (city.equals("Cairo") || city.equals("Tokyo")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 17;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            }else if (city.equals("Lima") || city.equals("New York")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 19;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            }else if (city.equals("Paris")) {
                allmoney = (flight + moneyNight2 * nights);
                allmoney = allmoney - (allmoney / 100) * 22;
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            } else {
                allmoney = (flight + moneyNight2 * nights);
                if (budget >= allmoney) {
                    System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
                }
            }
        }else if (nights >= 50) {
            allmoney = (flight + moneyNight2 * nights);
            allmoney = allmoney - (allmoney / 100) * 30;
            if (budget >= allmoney) {
                System.out.printf("Yes! You have %.2f leva left.", (budget - allmoney));
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", (allmoney - budget));
            }


        }


    }
}

