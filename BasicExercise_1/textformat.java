package JavaBasics.upr5;

import java.util.Scanner;

public class textformat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("I'm %s %s, a %d yars old from %s.",
                firstName, lastName, years, town);
    }
}