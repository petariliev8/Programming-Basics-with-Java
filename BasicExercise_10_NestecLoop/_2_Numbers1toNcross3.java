package JavaBasics.upr14NestedLoops;

import java.util.Scanner;

public class _2_Numbers1toNcross3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=input ; i+=3) {
            System.out.println(i);
        }
        

    }
}

