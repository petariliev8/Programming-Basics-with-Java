package JavaBasics.upr13For;

import java.util.Scanner;

public class _7_VoweslSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();
            int sum = 0;

            int b = text.length();

        for (int i = 0; i < b ; i++) {

            char symbol = text.charAt(i);
            if (symbol=='a') {
                sum +=1 ;
            } else if (symbol=='e') {
                sum +=2 ;
            }else if (symbol=='i') {
                sum +=3 ;
            }else if (symbol=='o') {
                sum +=4 ;
            }else if (symbol=='u') {
                sum +=5 ;
            }
            symbol++;

        }
        System.out.println(sum);
    }
}

