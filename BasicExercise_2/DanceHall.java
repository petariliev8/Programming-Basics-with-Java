package JavaBasics.Upr6;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         double L = Double.parseDouble(scanner.nextLine());
         double W = Double.parseDouble(scanner.nextLine());
         double A = Double.parseDouble(scanner.nextLine());

       if ((L>=10.00 && L<=100.00) && (W >=10.00 && W <=100.00) && (A>=2.00 && A<=20.00)) {

           double Shall = L * W ;
           double S = Shall - ((A*A) + (Shall/10));

           System.out.printf("%.0f",Math.floor(S/0.704));
       }


    }
}

