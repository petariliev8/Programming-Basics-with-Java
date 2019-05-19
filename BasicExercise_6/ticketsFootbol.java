package JavaBasics.upr9;

import java.util.Scanner;

public class ticketsFootbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String tickets = scanner.nextLine();
        double people = Double.parseDouble(scanner.nextLine());

        double moneyless = (money - ((money / 100) * 75));
        double moneyles9 = (money - ((money / 100) * 60));
        double moneyles24 = (money - ((money / 100) * 50));
        double moneyles49 = (money - ((money / 100) * 40));
        double moneyles50 = (money - ((money / 100) * 25));


        if ((money >= 1000 && money <= 1000000)
                && (people >= 1 && people <= 200)) {
            if (tickets.equals("VIP")) {
                double Ticket = 499.99;
                if (people > 0 && people <= 4) {

                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",(moneyless - (people * Ticket)));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",(Math.abs(moneyless - (people * Ticket))));
                        System.out.println(" leva.");
                    }


                } else if (people >= 5 && people <= 9) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles9 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles9 - (people * Ticket)));
                        System.out.println(" leva.");
                    }

                } else if (people >= 10 && people <= 24) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles24 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles24 - (people * Ticket)));
                        System.out.println(" leva.");
                    }
                } else if (people >= 25 && people <= 49) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles49 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles49  - (people * Ticket)));
                        System.out.println(" leva.");
                    }
                } else if (people >= 50) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles50 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles50 - (people * Ticket)));
                        System.out.println(" leva.");

                    }
                }

            } else if (tickets.equals("Normal")) {
                double Ticket = 249.99;


                if (people > 0 && people <= 4) {

                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyless - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyless - (people * Ticket)));
                        System.out.println(" leva.");
                    }


                } else if (people >= 5 && people <= 9) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles9 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles9 - (people * Ticket)));
                        System.out.println(" leva.");
                    }

                } else if (people >= 10 && people <= 24) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.println(moneyles24 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles24 - (people * Ticket)));
                        System.out.println(" leva.");
                    }
                } else if (people >= 25 && people <= 49) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles49 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles49 - (people * Ticket)));
                        System.out.println(" leva.");
                    }
                } else if (people >= 50) {
                    if ((moneyless - (people * Ticket)) >= 0) {
                        System.out.printf("Yes! You have ");
                        System.out.printf("%.2f",moneyles50 - (people * Ticket));
                        System.out.println(" leva left.");
                    } else if ((moneyless - (people * Ticket)) < 0) {
                        System.out.printf("Not enough money! You need ");
                        System.out.printf("%.2f",Math.abs(moneyles50 - (people * Ticket)));
                        System.out.println(" leva.");

                    }
                }
            }
        }
    }
}