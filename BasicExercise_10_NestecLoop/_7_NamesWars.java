package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _7_NamesWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winnerPoints = Integer.MIN_VALUE;
        String winnerName = "";

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            int points = 0;

            for (int i = 0; i < name.length(); i++) {
                points += name.charAt(i);
            }
            if (points>winnerPoints) {
                winnerPoints=points;
                winnerName=name;
            }

        }
        System.out.println("Winner is "+winnerName+" - "+winnerPoints+"!");
    }
}

