package JavaBasics.upr5;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Integer.parseInt(scanner.nextLine());
        double b2 = Integer.parseInt(scanner.nextLine());
        double h = Integer.parseInt(scanner.nextLine());
        double area = (b1 + b2) * h / 2;
        System.out.println(area);

    }
}

