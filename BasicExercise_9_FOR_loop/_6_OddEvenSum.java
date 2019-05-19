package JavaBasics.upr13For;

import java.util.Scanner;

public class _6_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int num = Integer.parseInt(scanner.nextLine());
     int evenSum = 0;
     int oddSum = 0;

        for (int i = 0; (i<num) ;   i++) {
            if (i%2==0){
                int even = Integer.parseInt(scanner.nextLine());

                evenSum += even;
            }

            else {
                int odd = Integer.parseInt(scanner.nextLine());

                oddSum += odd;
            }
        }
            if (evenSum==oddSum) {
                System.out.println("Yes");
                System.out.println("Sum = " +(oddSum));
            } else {
                System.out.println("No");
                System.out.println("Diff = "+Math.abs(evenSum-oddSum));
            }

    }
}

