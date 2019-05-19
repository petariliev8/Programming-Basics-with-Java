package JavaBasics.Urok3;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num2; i <=10 ; i++) {
            System.out.println(num +" X "+i+" = "+(num*i));

        } if (num2>10) {
            System.out.println(num +" X "+num2+" = "+(num*num2));
        }

    }
}

