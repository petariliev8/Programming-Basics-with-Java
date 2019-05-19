package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class bachelorParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int singer = Integer.parseInt(scanner.nextLine());
        String full= scanner.nextLine();
        int groups = 0;
        int money =0;
        int allmoney =0;
        int allpeople = 0;

        while (!full.equals("The restaurant is full")) {
            groups= Integer.parseInt(full);
            if (groups>=5) {
                money = groups*70;
                allmoney+=money;
                allpeople+=groups;
            } else if (groups<5){
                money = groups*100;
                allmoney+=money;
                allpeople+=groups;

            }
            full = scanner.nextLine();
        }
        if ((allmoney-singer)>=0) {
            System.out.println("You have "+allpeople+" guests and "+(allmoney-singer)+" leva left.");
        } else {
            System.out.println("You have "+allpeople+" guests and "+(allmoney)+" leva income, but no singer.");
        }
    }
}

