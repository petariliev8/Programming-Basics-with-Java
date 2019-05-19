package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double champagne = Double.parseDouble(scanner.nextLine());
        double whisky = Double.parseDouble(scanner.nextLine());

        double champagnePrice = whiskyPrice*0.5;
        double winePrice = champagnePrice*0.4;
        double waterPrice = champagnePrice*0.1;

        System.out.printf("%.2f",(water*waterPrice+wine*winePrice+champagne*champagnePrice+whisky*whiskyPrice));
    }
}

