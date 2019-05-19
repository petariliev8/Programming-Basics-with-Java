package JavaBasics.upr13For;

import java.util.Scanner;

public class leftRightSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int Lsum = 0;
        int Rsum = 0;

        for (int i = 0; i <(num*2) ; i++) {

            int numbers = Integer.parseInt(sc.nextLine());

            if (i<num) {
                Lsum +=numbers;
            } else {
                Rsum +=numbers;
            }

        }
        if (Rsum==Lsum) {
            System.out.println("Yes, sum = "+Lsum);
        } else {
            System.out.println("No, diff = "+Math.abs(Lsum-Rsum));
        }


    }
}

