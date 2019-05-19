package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class footballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamFootball = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double priceFlags = 0;
        double priceCaps = 0;
        double pricePosters = 0;
        double priceStickers = 0;
        double lastMoney = 0;

        if (teamFootball.equals("Argentina")) {
            if (souvenirs.equals("flags")) {
                priceFlags = 3.25;
                 lastMoney = priceFlags*count;
            }else if (souvenirs.equals("caps")){
                priceCaps = 7.2;
                lastMoney = priceCaps*count;
            }else if (souvenirs.equals("posters")){
                pricePosters = 5.1;
                lastMoney = pricePosters*count;
            }else if (souvenirs.equals("stickers")){
                priceStickers = 1.25;
                lastMoney = priceStickers *count;
            }
        } else  if (teamFootball.equals("Brazil")) {
            if (souvenirs.equals("flags")) {
                priceFlags = 4.2;
                lastMoney = priceFlags*count;
            }else if (souvenirs.equals("caps")){
                priceCaps = 8.5;
                lastMoney = priceCaps*count;
            }else if (souvenirs.equals("posters")){
                pricePosters = 5.35;
                lastMoney = pricePosters*count;
            }else if (souvenirs.equals("stickers")){
                priceCaps = 1.2;
                lastMoney = priceCaps*count;
            }
        } else if (teamFootball.equals("Croatia")) {
            if (souvenirs.equals("flags")) {
                priceFlags = 2.75;
                lastMoney = priceFlags*count;
            }else if (souvenirs.equals("caps")){
                priceCaps = 6.9;
                lastMoney = priceCaps*count;
            }else if (souvenirs.equals("posters")){
                pricePosters = 4.95;
                lastMoney = pricePosters*count;
            }else if (souvenirs.equals("stickers")){
                priceStickers = 1.1;
                lastMoney = priceStickers *count;
            }
        }else if (teamFootball.equals("Denmark")) {
            if (souvenirs.equals("flags")) {
                priceFlags = 3.1;
                lastMoney = priceFlags*count;
            }else if (souvenirs.equals("caps")){
                priceCaps = 6.5;
                lastMoney = priceCaps*count;
            }else if (souvenirs.equals("posters")){
                pricePosters = 4.8;
                lastMoney = pricePosters*count;
            }else if (souvenirs.equals("stickers")){
                priceCaps = 0.9;
                lastMoney = priceCaps*count;
            }
        }

        if ((teamFootball.equals("Brazil"))) {
            if (souvenirs.equals("caps")){
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("stickers")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("posters")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("flags")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else {
                System.out.println("Invalid stock!");
            }


        } else if (teamFootball.equals("Argentina")){
            if (souvenirs.equals("caps")){
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("stickers")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("posters")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("flags")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else {
                System.out.println("Invalid stock!");
            }

        }else if (teamFootball.equals("Denmark")) {
            if (souvenirs.equals("caps")){
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("stickers")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("posters")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("flags")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else {
                System.out.println("Invalid stock!");
            }


        } else if ((teamFootball.equals("Croatia"))) {
            if (souvenirs.equals("caps")){
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("stickers")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("posters")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else if (souvenirs.equals("flags")) {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenirs, teamFootball, lastMoney);
            } else {
                System.out.println("Invalid stock!");
            }

        } else {
            System.out.println("Invalid country!");
        }



        }
    }


