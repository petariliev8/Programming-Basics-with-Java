package JavaBasics.upr15;

import java.util.Scanner;

public class coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int len = String.valueOf(input).length();
        int counter = 1;

        for (int i = 0; i < len; i++) {
            int last = input % 10;
            int last33 = last + 33;
            while (true) {
                if (last == 0) {
                    System.out.print("ZERO");   //  въвеждаме число и го разделяме на цифри
                    break;                      // и всяка цифра +33 и от ASCII табл.
                }                              // въвеждаме толкова пъти колкото е стойноста на цифрата
                if (counter <= last) {
                    System.out.print((char) last33);
                    counter++;
                } else {
                    break;
                }
            }
            input = input / 10;
            counter = 1;
            System.out.println();
        }


    }
}

