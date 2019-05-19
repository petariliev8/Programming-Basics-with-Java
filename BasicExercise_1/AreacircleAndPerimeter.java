package JavaBasics.upr5;

import java.util.Scanner;

public class AreacircleAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r  * r;
        double perimeter = 2 * Math.PI  * r;

        System.out.printf("Area %.15f", area);
        System.out.printf("Perimeter  %.5f", perimeter );



    }
}

