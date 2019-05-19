package JavaBasics.upr11While;

import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxnumber = Integer.MIN_VALUE;
        int minnumber = Integer.MAX_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("END")) {

                int numbs = Integer.parseInt(input);

                if (numbs > maxnumber) {
                    maxnumber = numbs;

                }
                if (numbs < minnumber) {
                    minnumber = numbs;
                }

          input = scanner.nextLine();
        }
        System.out.println("max:" + maxnumber);
        System.out.println("min:" + minnumber);


    }

}



