package JavaBasics.upr13For;

import java.util.Scanner;

public class equalNumbersGabi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(sc.nextLine());

        double previousSum = 0;
        double sum = 0;
        double difference = 0;
        double maxDifference=Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= countOfPairs; i++) {
            previousSum = sum;

            double firstNumber = Double.parseDouble(sc.nextLine());
            double secondNumber = Double.parseDouble(sc.nextLine());

            sum = firstNumber + secondNumber;

            if (countOfPairs > 1 && i > 1) {
                difference = Math.abs(sum - previousSum);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }

        if (maxDifference == 0 || countOfPairs == 1) {
            System.out.printf("Yes, value=%.0f", sum);
        }
        else {
            System.out.printf("No, maxdiff=%.0f", maxDifference);
        }
    }
}



