package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class beerAndChips {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerbotles = Integer.parseInt(scanner.nextLine());
        int chipsPackets = Integer.parseInt(scanner.nextLine());

        double chipsPrice = 0.45*(beerbotles*1.20);
        double allChipsPrice = Math.ceil(chipsPrice*chipsPackets);
        double allBeerPrice = beerbotles*1.2;

        if (budget>=(allChipsPrice+allBeerPrice)) {
            System.out.printf("%s bought a snack and has %.2f leva left.",name,(((budget-(allChipsPrice+allBeerPrice)))));
        }else {
            System.out.printf("%s needs %.2f more leva!",name,((allChipsPrice+allBeerPrice)-budget));
        }
    }
}

