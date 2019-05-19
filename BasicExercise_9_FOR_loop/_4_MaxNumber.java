package JavaBasics.upr13For;

import java.util.Scanner;

public class _4_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int a = Integer.MIN_VALUE;
        int b = 0;

        for (int i = 0; i <numbers ; i++) {
            int newNumber = Integer.parseInt(scanner.nextLine());

             b -=newNumber;

            if (newNumber>=a) {
                a = newNumber;

            }



        } System.out.println(a);
    }
}

