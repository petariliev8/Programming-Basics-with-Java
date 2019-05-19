package JavaBasics.upr13For;

import java.util.Scanner;

public class _1_NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i <1000 ; i++) {

            int last= i%10;

            if (last==7) {
                System.out.println(i);

            }

        }

    }
}

