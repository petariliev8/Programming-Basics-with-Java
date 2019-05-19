package JavaBasics.upr5;

import java.util.Scanner;

public class konvRadiantoGradusi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double g =  180 * r/Math.PI;
        System.out.printf("%.0f", g);

    }
}

