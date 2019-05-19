package JavaBasics.upr10;

import java.util.Scanner;

public class summerClothes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double graduses = Double.parseDouble(scanner.nextLine());
        String part = scanner.nextLine();


        if (part.equals("Morning")) {
            if ((graduses >= 10) && (graduses <= 18)) {
                System.out.printf("It's %.0f degrees, get your Sweatshirt and Sneakers.", graduses);

            } else if ((graduses > 18) && (graduses <= 24)) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", graduses);

            } else if (graduses >= 25) {
                System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals., graduses");

            }
        } else if (part.equals("Afternoon")) {
            if ((graduses >= 10) && (graduses <= 18)) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", graduses);

            } else if ((graduses > 18) && (graduses <= 24)) {
                System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals.", graduses);

            } else if (graduses >= 25) {
                System.out.printf("It's %.0f degrees, get your Swim Suit and Barefoot.", graduses);


            }
        } else if (part.equals("Evening")) {
            if ((graduses >= 10) && (graduses <= 18)) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", graduses);

            } else if ((graduses > 18) && (graduses <= 24)) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", graduses);

            } else if (graduses >= 25) {
                System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", graduses);


            }
        }
    }
}