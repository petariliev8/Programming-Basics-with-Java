package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _3_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;

        for (int i = 0; i <=n ; i+=2) {
            System.out.println(current);
        current =current*4;
        }

    }
}

