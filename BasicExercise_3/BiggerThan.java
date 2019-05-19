package JavaBasics.upr7;

import java.util.Scanner;

public class BiggerThan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int a = Integer.parseInt(scanner.nextLine());

          if (a > 4) {
              System.out.println("Bigger than 4");
          } else if (a > 5) {
              System.out.println("Bigger than 5");
          } else if (a > 6) {
              System.out.println("Bigger than 6");
          } else {
              System.out.println("Error");
          }

    }
}

