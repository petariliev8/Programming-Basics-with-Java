package JavaBasics.upr11While;

import java.util.Scanner;

public class _5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double change100 = 0;
        double twolevas = 0;
        int counter = 0;

        while (true) {
             change100 = (Math.round(change * 100));

            if (change100 >= 200) {

                twolevas = Math.floor(change100 / 200);
                change100 = change100 % 200;

                if (change100  <= 0) {
                    System.out.printf("%.0f",twolevas);
                    break;

                }
                }
                if (change100 >= 100) {
                    change100 = change100 - 100;
                    counter++;
                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                }
                if (change100 >= 50) {
                    change100 = change100 - 50;
                    counter++;

                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                }
                if (change100 >= 20) {
                    change100 = change100 - 20;
                    counter++;
                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                    if (change100 >= 20) {
                        change100 = change100 - 20;

                        counter++;
                        if (change100 == 0) {
                            System.out.printf("%.0f",counter + twolevas);
                            break;
                        }
                    }
                }
                if (change100 >= 10) {
                    change100 = change100 - 10;
                    counter++;
                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                }
                if (change100 >= 5) {
                    change100 = change100 - 5;
                    counter++;
                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                }
                if (change100 >= 2) {
                    change100 = change100 - 2;
                    counter++;
                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                    if (change100 >= 2) {
                        change100 = change100 - 2;

                        counter++;
                        if (change100 == 0) {
                            System.out.printf("%.0f",counter + twolevas);
                            break;
                        }
                    }
                }
                if (change100 >= 1) {
                    change100 = change100 - 1;
                    counter++;
                    if (change100 == 0) {
                        System.out.printf("%.0f",counter + twolevas);
                        break;
                    }
                }

            }
        }
    }
