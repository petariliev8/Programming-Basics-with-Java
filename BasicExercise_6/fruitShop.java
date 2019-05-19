package JavaBasics.upr9;

import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruits = scanner.nextLine();
        String weeksDays = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ((weeksDays.equals("Monday"))
                || (weeksDays.equals("Tuesday"))
                || (weeksDays.equals("Wednesday"))
                || (weeksDays.equals("Thursday"))
                || (weeksDays.equals("Friday"))) {
            if (fruits.equals("banana")) {
                System.out.printf("%.2f",quantity * 2.5);
            } else if (fruits.equals("apple")) {
                System.out.printf("%.2f",quantity * 1.2);
            } else if (fruits.equals("orange")) {
                System.out.printf("%.2f",quantity * 0.85);
            } else if (fruits.equals("grapefruit")) {
                System.out.printf("%.2f",quantity * 1.45);
            } else if (fruits.equals("kiwi")) {
                System.out.printf("%.2f",quantity * 2.7);
            } else if (fruits.equals("pineapple")) {
                System.out.printf("%.2f",quantity * 5.5);
            } else if (fruits.equals("grapes")) {
                System.out.printf("%.2f",quantity * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (((weeksDays.equals("Saturday"))
                || (weeksDays.equals("Sunday")))) {
            if (fruits.equals("banana")) {
                System.out.printf("%.2f",quantity * 2.7);
            } else if (fruits.equals("apple")) {
                System.out.printf("%.2f",quantity * 1.25);
            } else if (fruits.equals("orange")) {
                System.out.printf("%.2f",quantity * 0.9);
            } else if (fruits.equals("grapefruit")) {
                System.out.printf("%.2f",quantity * 1.6);
            } else if (fruits.equals("kiwi")) {
                System.out.printf("%.2f",quantity * 3);
            } else if (fruits.equals("pineapple")) {
                System.out.printf("%.2f",quantity * 5.6);
            } else if (fruits.equals("grapes")) {
                System.out.printf("%.2f",quantity * 4.2);
            }
        } else {
            System.out.println("error");
        }
    }
 }
