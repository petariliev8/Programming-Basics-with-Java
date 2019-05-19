package JavaBasics.upr13For;

import java.util.Scanner;

public class _5_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int a = 0;

        for (int i = 0; i < numbers; i++) {

            int newNum = Integer.parseInt(scanner.nextLine());

            if (newNum<min) {
                min=newNum;
            }

        }
        System.out.println(min);

    }
}

