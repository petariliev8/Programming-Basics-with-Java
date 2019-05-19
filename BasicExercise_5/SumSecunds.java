package JavaBasics.upr8;

import java.util.Scanner;

public class SumSecunds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firs = Integer.parseInt(scanner.nextLine());
        int secund = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int AllSecunds = (firs + secund + third);
        int Hours = AllSecunds/60;
        int secunds = AllSecunds % 60;

        System.out.print(Hours);
        System.out.print(":");

        if (secunds <10) {
        System.out.printf("0%d", secunds); }

        else if (secunds >=10) {
            System.out.print(secunds);
        }





    }
}




