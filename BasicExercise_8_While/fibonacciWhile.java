package JavaBasics.upr11While;

import java.util.Scanner;

public class fibonacciWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int b = 1;
        while (n>=b) {
            System.out.println(b);
            b=b*2+1;
        }


    }
}


