package JavaBasics.upr10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperationNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");
        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        char operation = scanner.next().charAt(0);

        double result = 0;
        double resultPlus = N1 + N2;
        double resultMinus = N1 - N2;
        double resultUmn = N1 * N2;
        double resultDel = N1 / N2;
        double resultMod = N1 % N2;
        String evenOdd = "";


        if (operation == '+') {
            if ((resultPlus % 2) == 0) {

                System.out.println(df.format(N1) + " + " + df.format(N2) + " = " + df.format(resultPlus) + " - even");

            } else {
                System.out.println(df.format(N1) + " + " + df.format(N2) + " = " + df.format(result) + " - odd");

            }
        } else if (operation == '-') {
            if ((resultMinus % 2) == 0) {
                System.out.println(df.format(N1) + " - " + df.format(N2) + " = " + df.format(resultMinus) + " - even");

            } else {
                System.out.println(df.format(N1) + " - " + df.format(N2) + " = " + df.format(resultMinus) + " - odd");

            }
        } else if (operation == '*') {
            if ((resultUmn % 2) == 0) {
                System.out.println(df.format(N1) + " * " + df.format(N2) + " = " + df.format(resultUmn) + " - even");
            } else {
                System.out.println(df.format(N1) + " * " + df.format(N2) + " = " + df.format(resultUmn) + " - odd");
            }
        }


        if (operation == '/') {
            if (N2 == 0) {
                System.out.println("Cannot divide " + df.format(N1) + " by zero");

            } else {
                System.out.print(df.format(N1) + " / " + df.format(N2) + " = ");
                System.out.printf("%.2f", resultDel);
            }

        } else if (operation == '%') {
            if (N2 == 0) {
                System.out.println("Cannot divide " + df.format(N1) + " by zero");

            } else {


                System.out.print(df.format(N1) + " % " + df.format(N2) + " = " + df.format(resultMod));


            }
        }
    }

}