package JavaBasics.Upr6;

import java.util.Scanner;

public class KonverterCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String currency = scanner.nextLine();
        String currency1 = scanner.nextLine();

         if (currency.equals("BGN") && currency1.equals("USD")) {
            System.out.printf("%.2f BGN",sum * (1/1.79549));
         }
         else if (currency.equals("BGN") && currency1.equals("GBR")) {
            System.out.printf("%.2f BGN",sum * (1/2.53405));
         }
         else if (currency.equals("BGN") && currency1.equals("EUR")) {
             System.out.printf("%.2f BGN",sum * (1/1.95583));
         }


         else if (currency.equals("USD") && currency1.equals("GBR")) {
             System.out.printf("%.2f BGN",sum * (1.79549 / 2.53405));
         }
         else if (currency.equals("USD") && currency1.equals("EUR")) {
             System.out.printf("%.2f BGN",sum * (1.79549/1.95583));
         }
         else if (currency.equals("USD") && currency1.equals("BGN")) {
             System.out.printf("%.2f BGN",(sum * (1.79549)));
         }


         else if (currency.equals("EUR") && currency1.equals("USD")) {
             System.out.printf("%.2f BGN",sum * (1.95583/1.79549));
         }
         else if (currency.equals("EUR") && currency1.equals("GBR")) {
             System.out.printf("%.2f BGN",sum * (1.95583/2.53405));
         }
         else if (currency.equals("EUR") && currency1.equals("BGN")) {
             System.out.printf("%.2f BGN",sum * 1.95583);
         }

         else if (currency.equals("GBR") && currency1.equals("USD")) {
             System.out.printf("%.2f BGN",sum * (2.53405/1.79549));
         }
         else if (currency.equals("GBR") && currency1.equals("EUR")) {
             System.out.printf("%.2f BGN",sum * (2.53405/1.95583));
         }
         else if (currency.equals("GBR") && currency1.equals("BGN")) {
             System.out.printf("%.2f BGN",sum * 2.53405);
         }






    }
}





