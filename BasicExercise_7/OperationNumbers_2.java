package JavaBasics.upr10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperationNumbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        char operation = scanner.next().charAt(0);

        double resultPlus =N1+N2;
        double resultMinus = N1-N2;
        double resultUmn = N1*N2;
        double resultDel = N1/N2;
        double resultMod = N1%N2;


        switch (operation) {
            case '+':
                if ((resultPlus % 2) == 0) {
                    System.out.println(df.format(N1) +" + " +df.format(N2)+" = "+ df.format(resultPlus)+ " - even");
                } else {
                    System.out.println(df.format(N1) +" + " +df.format(N2)+" = "+ df.format(resultPlus)+ " - odd");
                }
                break;
            case '-':
                if ((resultMinus % 2) == 0) {
                    System.out.println(df.format(N1) +" - " +df.format(N2)+" = "+  df.format(resultMinus)+ " - even");
                } else {
                    System.out.println(df.format(N1 )+" - " +df.format(N2)+" = "+  df.format(resultMinus)+ " - odd");
                }
                break;
            case '*':
                if ((resultUmn % 2) == 0) {
                    System.out.println(df.format(N1) +" * " +df.format(N2)+" = "+  df.format(resultUmn)+ " - even");
                } else {
                    System.out.println(df.format(N1) +" * " +df.format(N2)+" = "+  df.format(resultUmn)+ " - odd");
                }
                break;
            case '/':
                if (N2 == 0) {
                    System.out.println("Cannot divide " +df.format(N1)+ " by zero");
                }else if ((resultDel % 2) == 0) {
                    System.out.println(df.format(N1) +" / " +df.format(N2)+" = "+ df.format(resultDel));
                } else {
                    System.out.println(df.format(N1) +" / " +df.format(N2)+" = "+ df.format(resultDel));
                }
                break;
            case '%':
                if (N2 == 0) {
                    System.out.println("Cannot divide " +df.format(N1)+ " by zero");
                } else if ((resultMod % 2) == 0) {
                    System.out.println( df.format(N1) +" % " + df.format(N2)+" = "+ df.format(resultMod));
                } else {
                    System.out.println( df.format(N1) +" % " + df.format(N2)+" = "+ df.format(resultMod));
                }
                break;
        }

    }
}

