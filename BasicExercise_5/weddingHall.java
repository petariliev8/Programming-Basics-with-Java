package JavaBasics.upr8;

import java.util.Scanner;

public class weddingHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double SnoDancing = (a*b/100)*19;
        double freeSpace = Math.ceil(((a*b)- SnoDancing-(c*c))/3.2);

        if ((a>=10 && a<=100)&&(b>=10 && b<=100)&&(c>=2 && c<=20)){

            System.out.printf("%.0f",Math.abs(freeSpace));




        }
    }
}

