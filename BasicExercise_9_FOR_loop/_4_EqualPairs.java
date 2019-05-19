package JavaBasics.upr13For;

import java.util.Scanner;

public class _4_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int pair = Integer.parseInt(scanner.nextLine());

     int evensum = 0;
     int oddsum = 0;
     int diff = 0;
     int max = Integer.MIN_VALUE;
     int realMin = Integer.MIN_VALUE;
        int value = 0;


        for (int i = 0; i <pair ; i++) {


            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());

            if (i%2==0) {
                oddsum = first+second;          // първите две числа са сумата на нечетните , вторите на четните
            } else {
                evensum = first+second;
            }

            if ((oddsum!=evensum)&&(i>=1)){      // >=1   , да е от врия оборот
                diff = Math.abs(oddsum-evensum);
                if (diff>max) {
                    max=diff;
                }
            } else  {             // не е от значение за задачата
                value++;
            }
        }

        if (max==realMin) {
            System.out.printf("Yes, value=%d",oddsum);
        } else {
            System.out.printf("No, maxdiff=%d",max);
        }

    }
}

