package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _5_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int levels = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());


        for (int i = levels; i > 0; i--) {
                if (levels<2) {                     //ако етажа е един
                for (int j = 0; j < rooms; j++) {

                    System.out.print(" L" + i + j);
                }
                break;

            }
            if (i == levels) {                      //за последният етаж с гол.апартаменти
                for (int j = 0; j < rooms; j++) {

                    System.out.print(" L" + i + j);
                }
                i--;
            }

            System.out.println();
            if (i % 2 != 0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.print(" A" + i + j);
                }
            } else {
                for (int j = 0; j < rooms; j++) {
                    System.out.print(" O" + i + j);
                }
            }
        }
    }
}

