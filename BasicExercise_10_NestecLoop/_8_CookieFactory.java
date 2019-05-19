package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _8_CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parts = Integer.parseInt(scanner.nextLine());
        int partidas = 1;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (parts > 0) {


            for (String i = ""; !i.equals("Bake!"); ) {

                i = scanner.nextLine();
                if ((i.equals("flour"))) {
                     counter1++;
                }
                if ((i.equals("eggs"))) {
                    counter2++;
                }
                if ((i.equals("sugar"))) {
                    counter3++;
                }
            }

           if ((counter1 >0) && (counter2>0) && (counter3>0)) {
                System.out.println("Baking batch number " + partidas + "...");
                partidas++;
                parts--;
                counter1 = 0;
                counter2 = 0;
                counter3 = 0;
            } else {
                System.out.println("The batter should contain flour, eggs and sugar!");
            }
        }
    }
}

