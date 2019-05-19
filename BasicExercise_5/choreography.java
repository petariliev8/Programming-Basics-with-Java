package JavaBasics.upr8;

import java.util.Scanner;

public class choreography {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double procVsDay = Math.ceil(((a/c)/a)*100);
        double proc1Day = procVsDay/b;




        if ((a >= 1 && a <= 100000) && (b >= 1 && b <= 50) && (c >= 1 && c <= 31)) {

       if (13>=procVsDay) {


           System.out.printf("Yes, they will succeed in that goal! ");
           System.out.printf("%.2f", procVsDay/b);
           System.out.println("%.");


       } else if (procVsDay>13) {

           System.out.printf("No, they will not succeed in that goal! Required ");
           System.out.printf("%.2f", procVsDay/b);
           System.out.println("% steps to be learned per day.");



       }








        }
    }

}