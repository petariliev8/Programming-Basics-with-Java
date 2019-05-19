package JavaBasics.upr11While;

import java.util.Scanner;

public class numberBetween100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        while (input>100 || input<=0) {
            System.out.println("Invalid number!");
            input = Integer.parseInt(scanner.nextLine());


        }
        System.out.println("The number is: "+ input);
    }
}

