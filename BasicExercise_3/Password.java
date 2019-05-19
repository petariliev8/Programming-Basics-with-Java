package JavaBasics.upr7;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String a = scanner.nextLine();

         if (a.equals("s3cr3t!P@ssw0rd")) {
             System.out.println("Welcome");
         } else {
             System.out.println("Wrong password!");
         }



    }
}

