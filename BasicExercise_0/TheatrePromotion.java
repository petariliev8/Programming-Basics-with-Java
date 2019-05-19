package JavaBasics.Urok3;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticket = 0;

        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {

            switch (day) {
                case "Weekday":
                    if (age >= 0 && age <= 18) {
                        ticket = 12;
                        break;
                    } else if (age >= 19 && age <= 64) {
                        ticket = 18;
                        break;

                    }else if (age >= 65 && age <= 122) {
                        ticket = 12;
                        break;

                    }
                case "Weekend":
                    if (age >= 0 && age <= 18) {
                        ticket = 15;
                        break;
                    } else if (age >= 19 && age <= 64) {
                        ticket = 20;
                        break;

                    }else if (age >= 65 && age <= 122) {
                        ticket = 15;
                        break;

                    }
                case "Holiday":
                    if (age >= 0 && age <= 18) {
                        ticket = 5;
                        break;
                    } else if (age >= 19 && age <= 64) {
                        ticket = 12;
                        break;

                    }else if (age >= 65 && age <= 122) {
                        ticket = 10;
                        break;

                    }
            }
            System.out.println(ticket+"$");


        }


    }
}

