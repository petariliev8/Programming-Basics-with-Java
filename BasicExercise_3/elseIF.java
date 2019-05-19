package JavaBasics.upr7;

import java.util.Scanner;

public class elseIF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if (a == 1) {
            System.out.println(1);
        } else if (a == 2) {
            System.out.println(2);
        } else if (a == 3) {
            System.out.println(a == 3);
        } else {
            System.out.println("Non");
        }


    }
}

