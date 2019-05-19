package JavaBasics.upr13For;

import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int input =0;

        int max = Integer.MIN_VALUE;
        int bigN = 0;
        int sum = 0;

        for (int i = 0; i < numbers ; i++) {
             input = Integer.parseInt(scanner.nextLine());

             sum +=input;
            if (input>max) {
                max=input ;
            }

        } if ((sum-max)==max) {
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        } else {
            System.out.println("No");
            System.out.println("Diff = "+Math.abs((sum-max)-max));
        }
    }
}

