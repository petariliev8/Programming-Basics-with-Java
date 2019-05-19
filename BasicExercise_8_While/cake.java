package JavaBasics.upr11While;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        double piece = width * lenght;

        int counter = 0;
        String pieceoff = "";


        while (true) {
            if (piece >= 0) {

                pieceoff = scanner.nextLine();
                if (pieceoff.equals("STOP")) {
                    System.out.printf("%.0f pieces are left.",piece);
                    break;
                } else {
                    counter = Integer.parseInt(pieceoff);
                }
                piece = piece - counter;


            } else if (piece < 0) {
                System.out.printf("No more cake left! You need %.0f pieces more.", (Math.abs(piece)));
                    break;
            }

        }
    }

}