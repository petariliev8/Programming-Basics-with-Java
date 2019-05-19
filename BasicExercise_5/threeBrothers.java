package JavaBasics.upr8;

import java.util.Scanner;

public class threeBrothers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = Double.parseDouble(scanner.nextLine());
        double B = Double.parseDouble(scanner.nextLine());
        double C = Double.parseDouble(scanner.nextLine());
        double D = Double.parseDouble(scanner.nextLine());

        if ((A>=0 &&A<=99)&&(B>=0 &&B<=99)&&
        (C>=0 &&C<=99)&&(D>=0 &&D<=99)) {

            double hoursOfBrothers = A+B+C;
            double hoursWithest = hoursOfBrothers+(hoursOfBrothers*0.15);

            if (hoursOfBrothers>=D) {
                double hours = hoursOfBrothers/60;
                double minutes = hoursOfBrothers % 60;

                System.out.printf("Cleaning time:",hours,":",minutes);
                System.out.printf("Yes, there is a suprise - time left ->","%.0f",Math.ceil(hoursOfBrothers));
            } else if ( hoursOfBrothers<D) {
                System.out.println("no");
            }
        }
    }
}

