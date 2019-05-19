package JavaBasics.upr15;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <=b ; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = c; k <=d ; k++) {
                    for (int l = c; l <=d ; l++) {
                        if ((i+k==j+l) && (i != j) && (k!=l)) {
                            System.out.printf("%d%d%n",i,j);
                            System.out.printf("%d%d%n",l,k);
                            System.out.println();
                        }
                    }
                }
            }
        }
        
    }
}

