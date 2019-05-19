package JavaBasics.upr15;

import java.util.Scanner;

public class equalSumsEvenOddPoition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        for (int i = input1; i <=input2 ; i++) {

            int six = i%10;             //  въвеждаме две 6-цифрени числа
            int five = (i/10)%10;        //сбора на Odd и Even позициите на
            int four = (i/100)%10;      // цифрите в тях ако са = ,
            int three = (i/1000)%10;     // то изписваме числото
            int two = (i/10000)%10;      //само когато е между n1 и n2
            int one = (i/100000 )%10;

            if ((one+three+five)==(two+four+six)) {
                System.out.print(i+" ");

                }



            }



        }

    }


