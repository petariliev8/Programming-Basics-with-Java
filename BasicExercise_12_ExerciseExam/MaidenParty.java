package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PriceParty = Double.parseDouble(scanner.nextLine());
        int massage = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int keychain = Integer.parseInt(scanner.nextLine());
        int caricature = Integer.parseInt(scanner.nextLine());
        int suprise = Integer.parseInt(scanner.nextLine());

        double massagePrice = 0.60;
        double rosePrice = 7.2;
        double keyPrice = 3.6;
        double cariPrice = 18.2;
        double suprisePrise = 22;

        if((massage+rose+keychain+caricature+suprise)>=25) {
            double price = (massage*massagePrice+rose*rosePrice+keychain*keyPrice+caricature*cariPrice+suprise*suprisePrise)*0.65 ;
            price = price*0.9;
            if (price>=PriceParty) {
                System.out.printf("Yes! %.2f lv left.",(price-PriceParty));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.",PriceParty-price);

            }
        } else {
            double price = (massage*massagePrice+rose*rosePrice+keychain*keyPrice+caricature*cariPrice+suprise*suprisePrise) ;
            price = price*0.9;
            if (price>=PriceParty) {
                System.out.printf("Yes! %.2f lv left.",(price-PriceParty));
            } else {
                System.out.printf("Not enough money! %.2f lv needed.",PriceParty-price);

            }
        }
    }
}

