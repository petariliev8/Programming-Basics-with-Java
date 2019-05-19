package JavaBasics.upr11While;

import java.util.Scanner;

public class devision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = b;
        int d = 0;


        if (a >= b) {
            while (true) {

                if ((a % c == 0) && (b % c == 0)) {
                    System.out.println(c);
                    break;
                } else {

                    c--;
                }

            }
        }else  {

                while (true) {

                    if ((a % c == 0) && (b % c == 0)) {
                        System.out.println(c);
                        break;
                    } else {
                        c--;
                    }
                }
            }
        }
    }
