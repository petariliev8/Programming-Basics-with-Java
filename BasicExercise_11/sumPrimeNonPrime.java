package JavaBasics.upr15;

import java.util.Scanner;

public class sumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sumPrime = 0;
        int sumNonPrime = 0;
        while (true) {
            String end = scanner.nextLine();
            if (end.equals("stop")) {
                System.out.println("Sum of all prime numbers is: " + sumPrime);
                System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
                break;
            } else {
                input = Integer.parseInt(end);
                if (input < 0) {
                    System.out.println("Number is negative.");
                    continue;
                }
            }
            int counter = 0;
            if (input == 1) {     //0 и 1 не са прости числа и правим проверки
                counter = 2;
            }
            for (int i = 2; i <= input; i++) {  //ако се делят на повече от 1 и на себе си  е СЛОЖНО число
                if (input % i == 0) {
                    counter++;
                }
            }
            if (counter >= 2) {
                sumNonPrime += input;          //съхраняваме сумите им
            } else {
                sumPrime += input;
            }
        }


    }
}

