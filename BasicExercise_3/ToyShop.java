package JavaBasics.upr7;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());


        if ((price >= 1) && (price <= 10000)) {
            double pizzle = Double.parseDouble(scanner.nextLine());
            if ((pizzle >= 0) && (pizzle <= 1000));
            double speake = Double.parseDouble(scanner.nextLine());
            if ((speake >= 0) && (speake <= 1000));
            double bears = Double.parseDouble(scanner.nextLine());
            if ((bears >= 0) && (bears <= 1000));
            double mini = Double.parseDouble(scanner.nextLine());
            if ((mini >= 0) && (mini <= 1000));
            double cars = Double.parseDouble(scanner.nextLine());
            if ((cars >= 0) && (cars <= 1000)) {
                if ((pizzle+speake+bears+mini+cars) >= 50) {
                    //double finalPrice = ((pizzle*2.6 + speake*3 + bears*4.1 +
                    //        mini*8.2 + cars*2)-(pizzle*2.6 + speake*3 + bears*4.1 +
                    //       mini*8.2 + cars*2)*0.25);

                    System.out.println((((((pizzle*2.6 + speake*3 + bears*4.1 +
                            mini*8.2 + cars*2)-(pizzle*2.6 + speake*3 + bears*4.1 +
                            mini*8.2 + cars*2)*0.25))-((((pizzle*2.6 + speake*3 + bears*4.1 +
                            mini*8.2 + cars*2)-(pizzle*2.6 + speake*3 + bears*4.1 +
                            mini*8.2 + cars*2)*0.25))*0.1)))-40.8);



        }}}}}