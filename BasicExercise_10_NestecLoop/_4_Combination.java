package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _4_Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum  =0;

        for (int i = 0; i <=input ; i++) {   // условието е  5 комбинации с числа от 0 до Input ;
            for (int j = 0; j <=input; j++) { //правим 5 цикъла и накрая ако сбора име = input ,counter
                for (int k = 0; k <=input; k++) {
                    for (int l = 0; l <=input; l++) {
                        for (int m = 0; m <=input; m++) {
                            if (i+j+k+l+m == input) {
                                sum++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

