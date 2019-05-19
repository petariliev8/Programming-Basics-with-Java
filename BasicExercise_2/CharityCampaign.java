package JavaBasics.Upr6;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int cookers = Integer.parseInt(scanner.nextLine());
        int cake = Integer.parseInt(scanner.nextLine());
        int wafer = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());

        if ((days >=0 && days <=365) && (cookers >=0 && cookers <=1000) && (cake >=0 && cake <=2000) && (wafer >=0 && wafer <=2000) && (pancake >=0 && pancake <=2000)) {

            double money = (days * ((cookers * (cake*45 + wafer*5.8 + pancake*3.2))));

            System.out.printf("%.2f", (money - money/8));

        }
    }
}

