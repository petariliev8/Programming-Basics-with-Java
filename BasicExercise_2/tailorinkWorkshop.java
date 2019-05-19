package JavaBasics.Upr6;

import java.util.Scanner;

public class tailorinkWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double L = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double A = Double.parseDouble(scanner.nextLine());


          if ((L >= 0 && L <= 500) && (W >= 0.00 && W <= 3.00) && (A >= 0.00 && A <= 3.00)) {

              double squere = (W/2)*(W/2);
              double rectangle = (W+0.6)*(A+0.6);
              double PriceUSD = L*squere*9 + L*rectangle*7;

              System.out.printf("%.2f USD %n",PriceUSD );
              System.out.printf("%.2f BGN",PriceUSD*1.85);


          }
    }
}
