package JavaBasics.upr5;

import java.util.Scanner;

public class inches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        System.out.println(inches * 2.54);

    }
}

