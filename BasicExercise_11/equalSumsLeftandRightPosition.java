package JavaBasics.upr15;

import java.util.Scanner;

public class equalSumsLeftandRightPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        for (int i = input1; i <= input2; i++) {
            while (true) {
                int one = i % 10;               // вход:Две 5-цифрени,м/у тях
                int two = (i / 10) % 10;       //кои числа са с равни крайни: 1+2=4+5?
                int three = (i / 100) % 10;     //ако не , прибавяме към <то средната цифра
                int four = (i / 1000) % 10;     //и пак проверка:
                int five = (i / 10000) % 10;     // отделяме цифра по цифра


                if ((one + two) == (four + five)) { //проверка дали са равни
                    System.out.print(i + " ");
                    break;
                } else {
                    if ((one + two) > (four + five)) {
                        if ((one + two) == (four + five + three)) {
                            System.out.print(i + " ");
                            break;
                        }
                    } else {
                        if ((one + two + three) == (four + five)) {
                            System.out.print(i + " ");
                            break;
                        }
                    }
                    break;
                }

            }
        }

    }
}