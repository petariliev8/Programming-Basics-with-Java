package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class gameInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int minutes = 0;
        int shootout = 0;
        double allMinutes = 0;
        double averageMinutes = 0;
        int continued = 0;
        int counter = games;


        while (counter > 0) {
            minutes = Integer.parseInt(scanner.nextLine());
            if (minutes > 120) {
                shootout++;
            } else if (minutes > 90 && minutes <= 120) {
                continued++;
            }
            allMinutes += minutes;
            counter--;

        }
        System.out.printf("%s has played %.0f minutes. Average minutes per game: %.2f%n",name,allMinutes,(allMinutes / games));
        System.out.println("Games with penalties: " + shootout);
        System.out.println("Games with additional time: " + continued);
    }
}

