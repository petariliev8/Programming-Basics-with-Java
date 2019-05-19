package JavaBasics.upr15;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int rows = 1;
        int position = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ");
            position++;

            if (position >= rows) {
                System.out.println();
                rows++;
                position = 0;
            }
        }
    }

    }

