package JavaBasics.upr11While;

import java.util.Scanner;

public class _3_AccoungBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // DecimalFormat df = new DecimalFormat("###.##");
        int numbers = Integer.parseInt(scanner.nextLine());

        double total = 0;

        while (numbers > 0) {

            double deposit = Double.parseDouble(scanner.nextLine());
            if (deposit < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total = total + deposit;
            System.out.printf("Increase: %.2f%n",deposit);

            numbers--;
        }
        System.out.printf("Total: %.2f",total);
    }


}
