package JavaBasics.Urok3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num +" X "+i+" = "+(num*i));

        }

    }
}

