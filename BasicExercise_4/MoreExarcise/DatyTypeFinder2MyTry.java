package JavaBasics.Exercise7.MoreExarcise;

import java.util.Scanner;

public class DatyTypeFinder2MyTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int length=String.valueOf(input).length();
        int counterDouble = 0;
        int counterInteger = 0;
        int counterString = 0;
        int counterChar = 0;
        int counterNum = 0;

        while  (!input.equals("END")) {


            for (int i = 0; i < length; i++) {


                char c = input.charAt(i);

                if ( ((char) c == 46)) {

                    counterDouble++;

                } else if ((char) c >= 48 && (char) c <= 57 || (char) c == 45) {
                    counterInteger++;

                } else if ((char) c > 57 && length > 1) {
                    counterString++;
                } else if (((char) c > 57 && length == 1) || ((char) c >= 32 && (char) c <= 47 && length ==1)) {
                    counterChar++;
                } else if ((char) c < 57 && length == 1) {
                    counterNum++;
                }
            }


            if (counterDouble > 0 && counterInteger > 1) {
                System.out.println(input + " is floating point type");
            } else if (counterDouble < 1 && counterInteger > length-1) {
                System.out.println(input + " is integer type");
            } else if (counterChar == 1 && length == 1) {
                System.out.println(input + " is character type");

            } else if (counterString > 1 && length > 1) {
                if (input.equals("false") || input.equals("true")) {
                    System.out.println(input + " is boolean type");
                } else {
                    System.out.println(input + " is string type");
                }
            } else if ((counterDouble < 1 && counterInteger == length)) {
                System.out.println(input + " is integer type");

            }

            input = scanner.nextLine();
            length=String.valueOf(input).length();
            counterDouble = 0;
            counterInteger = 0;
            counterString = 0;
            counterChar = 0;
            counterNum = 0;

        }


    }
}

