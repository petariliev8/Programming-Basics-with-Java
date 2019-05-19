package JavaBasics.upr15;

import java.util.Scanner;

public class specialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int N = Integer.parseInt(scanner.nextLine());
            int i = 1111;


                    while (i<=9999) {

                        int one = i % 10;               // вход число  N, и трябва да изкараме вс 4ри цифр.числа
                        int two = (i / 10) % 10;      //като N се дели на всяка една от цифрите им без остатък
                        int three = (i / 100) % 10;  //
                        int four = (i / 1000) % 10;     //

                        if ((one!=0)&&(two!=0)&&(three!=0)&&(four!=0)) {
                            if ((N % one == 0) && (N % two == 0) && (N % three == 0) && (N % four == 0))
                                System.out.print(i + " ");
                        }
                        i++;
                        }
                    }
                }

        
        




