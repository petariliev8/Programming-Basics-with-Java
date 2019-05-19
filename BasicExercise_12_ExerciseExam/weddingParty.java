package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class weddingParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double fire = 0;
        double charity = 0;
        double moneyLeft = guests*20-budget;

        if (guests*20<=budget) {
            fire = (budget-(guests*20))*0.40;
            charity =(budget-(guests*20))*0.60;
            System.out.println("Yes! "+Math.round((fire))+" lv are for fireworks and "+Math.round((charity))+" lv are for donation.");
        } else {
            System.out.println("They won't have enough money to pay the covert. They will need "+(int)moneyLeft+" lv more.");
        }


    }
}

