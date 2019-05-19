package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _9_MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <=9 ; i++) {   // условието е  5 комбинации с числа от 0 до Input ;
            for (int j = 0; j <=9; j++) { //правим 5 цикъла и накрая ако сбора име = input ,counter
                for (int k = 0; k <=9; k++) {
                    for (int l = 0; l <=9; l++) {
                        for (int m = 0; m <=9; m++) {
                            for (int n = 0; n <=9; n++) {
                                if (i*j*k*l*m*n == input) {
                                    System.out.print(" "+i+j+k+l+m+n);

                                }
                            }
                        }
                    }
                }
            }
        }

    }

    }


