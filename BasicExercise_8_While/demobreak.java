package JavaBasics.upr11While;

import java.util.Scanner;

public class demobreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDeposits = Integer.parseInt(scanner.nextLine());
        double increase = Double.parseDouble(scanner.nextLine());

        double total = 0;

       while (numberOfDeposits > 0) {
           if (increase < 1) {
               System.out.println("invalid operation!");
           }
           System.out.println("Increase: " + increase);

           total = total + increase;

           numberOfDeposits--;
           if (numberOfDeposits == 0) {
               System.out.println("Total: "+ total);

               break;
           }

           increase = Double.parseDouble(scanner.nextLine());
       }
    }
 }


