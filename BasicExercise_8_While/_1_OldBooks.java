package JavaBasics.upr11While;

import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int numbersOfBooks = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int result = 0;
        while (true) {


            String name = scanner.nextLine();
            counter++;

            if (name.equals(bookName)) {
                System.out.println("You checked " + (counter-1) + " books and found it.");
                        break;
            }
            if ((numbersOfBooks-counter)<=0) {
                System.out.println("The book you search is not here!");
                System.out.println("You checked "+counter+ " books.");
                        break;
            }

        }

    }
}

