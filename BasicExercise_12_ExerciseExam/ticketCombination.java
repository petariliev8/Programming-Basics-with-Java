package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class ticketCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCombination = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        String first = "BDFHJL";
        String second = "fedcba";
        String three = "ABC";
        int four = 0;
        int five = 0;

        for (int i =0; i < first.length(); i++) {
            char a = first.charAt(i);
            for (int j =0; j < second.length(); j++) {
                char b = second.charAt(j);
                for (int k =0; k < three.length(); k++) {
                    char c = three.charAt(k);
                    for (int l = 1; l <=10 ; l++) {
                        four = l;
                        for (int m = 10; m >=1 ; m-- ) {
                            five = m;
                            counter++;
                            if (counter == numCombination) {
                                System.out.printf("Ticket _4_Combination: ");
                                System.out.printf("%s%s%s%d%d%n", a, b, c, four, five);
                                System.out.printf("Prize: %d lv.",(a+b+c+ four+five));
                                break ;



                        }




                        }
                    }

                }

            }

        }



    }
}

