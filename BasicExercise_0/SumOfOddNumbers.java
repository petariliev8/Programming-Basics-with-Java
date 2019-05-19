package JavaBasics.Urok3;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = num;
        int sum = 0;

        for (int i = 1; i <=counter ; i++) {
            if ((i%2!=0)){
                System.out.println(i);
                sum+=i;
                counter++;

            }

        }
        System.out.println("Sum: "+sum);

    }
}

