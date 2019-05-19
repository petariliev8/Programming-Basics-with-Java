package JavaBasics.upr13For;

import java.util.Scanner;

public class _3_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double maxEven = -Double.MAX_VALUE;
        double minEven = Double.MAX_VALUE;
        double input = 0;

        double sumEven=0;
        double sumOdd=0;
        double minOdd=Double.MAX_VALUE;
        double maxOdd=-Double.MAX_VALUE;
        double zero = 0;

        for (int i = 1; (i) <(num+1) ; i++) {

            input = Double.parseDouble(scanner.nextLine());

            if (i%2==0) {
                sumEven +=input;
                if (input>maxEven) {
                    maxEven = input;
                }
                if (input<minEven) {
                    minEven = input;
                }
            }
            if (i%2!=0) {
                sumOdd +=input;
                if (input>maxOdd) {
                    maxOdd = input;
                }
                if (input<minOdd) {
                    minOdd = input;
                }
            }
        }
        if ((minOdd==0) || (maxOdd==0) || (sumOdd==0)) {
            System.out.printf("OddSum=%.2f,%n",zero);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else  {
            System.out.printf("OddSum=%.2f,%n",sumOdd);
            System.out.printf("OddMin=%.2f,%n",minOdd);
            System.out.printf("OddMax=%.2f,%n",maxOdd);
        }
        if (minEven==0 || (maxEven==0) || sumEven==0) {
            System.out.printf("EvenSum=%.2f,%n",zero);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else   {
            System.out.printf("EvenSum=%.2f,%n", sumEven);
            System.out.printf("EvenMin=%.2f,%n",minEven);
            System.out.printf("EvenMax=%.2f%n",maxEven);
        }
    }
}

