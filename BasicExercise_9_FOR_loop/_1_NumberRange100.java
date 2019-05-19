package JavaBasics.upr13For;

import java.util.Scanner;

public class _1_NumberRange100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number>100 || number<1){
            System.out.println("Invalid number!");


            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: "+number);
    }
}

