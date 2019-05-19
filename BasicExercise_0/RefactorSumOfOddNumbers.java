package JavaBasics.Urok3;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter =n;

        for (int i = 0; counter >0; i++) {
           if (i%2!=0) {
               System.out.print(i);
               System.out.println();
               sum += i;
               counter--;

           }
        }
        System.out.printf("Sum: %d%n", sum);
        System.out.println();



    }
}

