package JavaBasics.upr13For;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int website = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int facebook = 0;
        int instagram = 0;
        int reddit = 0;


        for (int i = 0; i < website; i++) {
            String input = scanner.nextLine();

            if (input.equals("Facebook")) {
                facebook++;
            } else if (input.equals("Instagram")) {
                instagram++;
            } else if (input.equals("Reddit")) {
                reddit++;
            }

            if ((salary-(facebook*150+instagram*100+reddit*50))<=0) {
                salary=0;
            }

        }
        if (salary<=0) {
            System.out.println("You have lost your salary.");

        } else {
            System.out.printf("%d", ((salary - (facebook * 150 + instagram * 100 + reddit * 50))));
        }

    }
}

