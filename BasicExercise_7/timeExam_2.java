package JavaBasics.upr10;

import java.util.Scanner;

public class timeExam_2 {
    public static void main(String[] args) {
        //This is a scanner
        Scanner sc = new Scanner(System.in);
        /*
        */
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int countOfFisher = Integer.parseInt(sc.nextLine());

        double rent = 0;

        switch (season){
            case "Spring":
                rent = 3000;

                break;
            case "Summer":
                rent = 4200;
                break;
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }


        if (countOfFisher <= 6){
            rent = rent - (rent * 0.1);
        }else if (countOfFisher >= 7 && countOfFisher <= 11){
            rent = rent - (rent * 0.15);
        }else if (countOfFisher >= 12){
            rent = rent - (rent * 0.25);
        }

        if (countOfFisher % 2 == 0 && !(season.equals("Autumn"))){
            rent = rent * 0.95;
        }


        if(budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}

