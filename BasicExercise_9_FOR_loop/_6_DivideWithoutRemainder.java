package JavaBasics.upr13For;

import java.util.Scanner;

public class _6_DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numbers = Double.parseDouble(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double pro = 0;

        for (int i = 0; i <numbers ; i++) {
            double input = Double.parseDouble(scanner.nextLine());

            if (input%2==0) {
                p1++;
            }
            if (input%3==0) {
                p2++;
            }
            if (input%4==0) {
                p3++;
            }



        }
        pro = 100/numbers;
        System.out.printf("%.2f%%%n",(p1*pro));
        System.out.printf("%.2f%%%n",(p2*pro));
        System.out.printf("%.2f%%",(p3*pro));

    }
}

