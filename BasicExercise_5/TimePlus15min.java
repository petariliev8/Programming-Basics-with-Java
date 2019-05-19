package JavaBasics.upr8;

import java.util.Scanner;

public class TimePlus15min {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursOnMinutes = hours*60;
        int allOfMinutes = minutes+hoursOnMinutes+15;
        int hoursNew = allOfMinutes/60;
        int minutesNew = allOfMinutes % 60;

        if ((hours>=0)&&(hours<=23) && (minutes>=0)&&(minutes<=59)) {
            if (hoursNew>23) {

                hoursNew =0;

            }    System.out.printf(hoursNew+":");

            if (minutesNew <10) {
                System.out.printf("0%d", minutesNew); }

             else if (minutesNew >=10) {
                System.out.print(minutesNew);
            }
        }

    }}







