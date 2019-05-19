package JavaBasics.upr13For;

import java.util.Scanner;

public class _5_LeftAndRightSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int Lsum = 0;
        int Rsum = 0;

        for (int i = 0; i < num; i++) {

            int L = Integer.parseInt(sc.nextLine());

            Lsum +=L;



        } for (int j = 0; j < num; j++) {
            int R = Integer.parseInt(sc.nextLine());

            Rsum +=R;



        }

        if (Rsum==Lsum) {
            System.out.println("Yes, sum = "+Lsum);
        } else {
            System.out.println("No, diff = "+Math.abs(Lsum-Rsum));
        }
    }
}

