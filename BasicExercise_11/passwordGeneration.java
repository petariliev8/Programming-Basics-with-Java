package JavaBasics.upr15;

import java.util.Scanner;

public class passwordGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        String string = "abcdefghi";

  if ((n>0)&&(n<10) && (l>0) && (l<10)) {

      for (int a = 1; a <= n; a++) {
          for (int b = 1; b <= n; b++) {

              for (int c = 1; c <= l; c++) {
                  char q = string.charAt(c - 1);

                  for (int d = 1; d <= l; d++) {
                      char w = string.charAt(d - 1);

                      for (int e = 1; (e <= n); e++) {

                          if ((a <= n) && (b <= n) && (c <= l) && (d <= l) && (e <= n) && (e > a) && (e > b)) {

                              System.out.print(a);
                              System.out.print(b);
                              System.out.print(q);
                              System.out.print(w);
                              System.out.print(e + " ");


                          }
                      }

                  }

              }

          }

      }
  }


    }

}