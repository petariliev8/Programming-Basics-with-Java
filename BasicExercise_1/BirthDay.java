package JavaBasics.upr5;

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p = Double.parseDouble(scanner.nextLine());
        double v = a * b * h;
        double l = v * 0.001;
        double o = l - (p * 0.01 * l);
        System.out.printf("%.3f", o);

    }
}

