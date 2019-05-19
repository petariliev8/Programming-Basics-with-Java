package JavaBasics.upr13For;

import java.util.Scanner;

public class _5_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numbers = Double.parseDouble(scanner.nextLine());

        double p1 = 0 ;
        double p2 = 0 ;
        double p3 = 0 ;
        double p4 = 0 ;
        double p5 = 0 ;


        for (int i = 0; i <numbers ; i++) {
            double input = Double.parseDouble(scanner.nextLine());

            if (input<200) {
                p1++;
            }
            else if ((input<=399)&& (input >= 200)) {
                p2++;
            }
           else  if ((input<=599)&& (input >= 400)) {
                p3++;
            }
           else if ((input<=799)&& (input >= 600)) {
                p4++;
            }
            else if ((input<=1000)&& (input >= 800)) {
                p5++;
            }


        }
            double pro = 100/numbers;

        System.out.printf("%.2f%%%n",(pro*p1));
        System.out.printf("%.2f%%%n",(pro*p2));
        System.out.printf("%.2f%%%n",(pro*p3));
        System.out.printf("%.2f%%%n",(pro*p4));
        System.out.printf("%.2f%%",(pro*p5));



    }
}

