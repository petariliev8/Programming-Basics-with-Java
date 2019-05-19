package JavaBasics.upr11While;

import java.util.Scanner;

public class fibonacciProba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int one = 1;

        while (n >= one) {
            System.out.println(one);
            one = one*2+1;


        }

    }
}

