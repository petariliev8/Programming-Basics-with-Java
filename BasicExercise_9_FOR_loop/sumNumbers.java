package JavaBasics.upr13For;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int counterS = 0;
        for (int i =0 ; i <n; i++) {

            counter = Integer.parseInt(scanner.nextLine());

            counterS += counter;

        }
        System.out.println(counterS);
    }
}

