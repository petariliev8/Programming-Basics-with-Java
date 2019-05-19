package JavaBasics.upr11While;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());


            while (a<1 || a > 100) {
                System.out.println("invalid");
                a = Integer.parseInt(scanner.nextLine());

            }
        System.out.println(a);
        }
    }


