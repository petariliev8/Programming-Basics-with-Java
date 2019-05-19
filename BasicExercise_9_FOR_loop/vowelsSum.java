package JavaBasics.upr13For;

import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i)=='a') ||
                    (text.charAt(i)=='e') ||
                    (text.charAt(i)=='i')||
                    (text.charAt(i)=='o') ||
                    (text.charAt(i)=='u')){
                       System.out.println(3);
            }

        }

    }
}

