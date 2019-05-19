package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = K; i <= 8; i++) {

            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >=N; l--) {
                        if ((i % 2 == 0 && k % 2 == 0) && (j % 2 != 0 && l % 2 != 0)) {
                            if (counter<6){
                            if (i == k && j == l) {
                                System.out.println("Cannot change the same player.");
                            } else {

                                counter++;
                                    System.out.print(i);
                                    System.out.print(j);
                                    System.out.print(" - ");
                                    System.out.print(k);
                                    System.out.print(l);
                                    System.out.println();
                                }
                            }


                        }

                        }

                    }
                }
            }

        }

    }
