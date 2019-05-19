package JavaBasics.upr7;

import java.util.Scanner;

public class AreaSquareCircleRectangleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println(a * a);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.pow(r,2) * Math.PI);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            System.out.println((a * h)/2);
    }

        }
}

