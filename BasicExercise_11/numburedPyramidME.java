package JavaBasics.upr15;

import java.util.Scanner;

public class numburedPyramidME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int position = 1;
        int rows = 1;

        for (int i = 1; i <=n ; i++) {

            if  (i<=n){
                System.out.print(i+" ");
                position++;                     //иска се пирамида от числа ,   1
            }                                  //вход  едно число               2 3
                if (position>=rows) {          //изход                      :   4 5 6
                    System.out.println();
                    position=0;
                    rows++;
                }
        }

    }
}

