package JavaBasics.Upr6;

import java.util.Scanner;

public class AreaPerimeterXYXY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          double x1 = Double.parseDouble(scanner.nextLine());
          double y1 = Double.parseDouble(scanner.nextLine());
          double x2 = Double.parseDouble(scanner.nextLine());
          double y2 = Double.parseDouble(scanner.nextLine());
          double lenght = Math.abs(x1 - x2);
          double widht = Math.abs(y1 - y2);
          double perimeter = 2 * (lenght +  widht);
          double area = lenght * widht;
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimeter);

        }

    }


