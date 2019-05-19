package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class weddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one =scanner.nextLine().charAt(0);
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
int counter = 0;
int counter2 = 0;
        char first = 'A';

        for (char i = first; i <=one ; i++) {
            counter2++;
            for (int j = 1; j <(second+counter2) ; j++) {
                if (j%2==0 ) {
                    for (int k = 97; k <(third+99) ; k++) {
                        counter++;
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print((char)k);
                        System.out.println( );

                    }
                } else {
                    for (int k = 97; k <(third+97) ; k++) {
                       counter++;
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print((char)k);
                        System.out.println( );

                    }
                }

                
            }
            
        }
        System.out.println(counter);

    }
}

