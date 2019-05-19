package JavaBasics.upr8;

import java.util.Scanner;

public class wordRecordSwemming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double d = (Math.floor(b / 15))*12.5  ;
        double e = b * c + d;

        if ((a >= 0 && a <= 100000) && (b >= 0 && b <= 100000) && (c >= 0 && c <= 1000)) {

            if (a > e) {
                System.out.printf("Yes, he succeeded! The new world record is ");
                System.out.printf("%.2f",e);
                System.out.println(" seconds.");
            } else if (a <= e) {
                System.out.printf("No, he failed! He was ");
                System.out.printf("%.2f", (Math.abs(a - e)));
                System.out.println(" seconds slower.");
            }


        }
    }

}