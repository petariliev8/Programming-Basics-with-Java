package JavaBasics.upr15;

import java.util.Scanner;

public class tableNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int current = 0;
        int rows = 1;
        int colons = 1;

        for ( rows = 0; rows <n ; rows++) {              // изход:  таблица ; матрица
            for ( colons = 0; colons < n; colons++) {    //   1 2 3 4
                current = rows+colons+1;                 //   2 3 4 3
                if (current>n){                          //   3 4 3 2
                    current = 2*n-current;
                }
                System.out.print(current+" ");
            }
            System.out.println();

        }
    }
}

