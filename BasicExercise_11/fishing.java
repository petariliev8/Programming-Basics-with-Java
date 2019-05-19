package JavaBasics.upr15;

import java.util.Scanner;

public class fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int countFishes = 0;
        double priceSpend = 0;
        double priceSave = 0;
        int num = 0;
        double spend = 0;
        double save = 0;
        double allspend =0;
        double allsave =0;


        while (input > num) {
            String name = scanner.nextLine();

            if (name.equals("Stop")) {

                if (allspend > allsave) {
                    System.out.printf("Lyubo lost %.2f leva today.", Math.abs(allspend - allsave));
                } else {
                    System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", num, Math.abs(allsave - allspend));
                }
                break;
            }
            double kilos = Double.parseDouble(scanner.nextLine());

            countFishes++;
            num++;
            if (countFishes <3) {
                priceSave = 0;
                save =0;
                spend = 0;
                priceSpend = 0;
                for (int j = (name.length() - 1); j >= 0; j--) {
                    char a = name.charAt(j);
                    priceSpend += a;

                }
                spend = priceSpend/kilos;
                allspend += spend;

            } else {
                for (int j = (name.length() - 1); j >= 0; j--)  {
                    char b = name.charAt(j);
                    priceSave += b;

                }
                save = priceSave/kilos;
                allsave += save;
                countFishes = 0;
            }
            if (num == input) {
                System.out.println("Lyubo fulfilled the quota!");

                if (allspend > allsave) {
                    System.out.printf("Lyubo lost %.2f leva today.",(allspend - allsave));
                    break;
                } else if (allspend < allsave) {
                    System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", input, Math.abs(allsave - allspend));
                    break;
                }

            }
        }
    }
}
