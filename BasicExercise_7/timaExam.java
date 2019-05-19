package JavaBasics.upr10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class timaExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");
        double hourExam = Double.parseDouble(scanner.nextLine());
        double minutesExam = Double.parseDouble(scanner.nextLine());
        double hourCome = Double.parseDouble(scanner.nextLine());
        double minutesCome = Double.parseDouble(scanner.nextLine());

        double lateMinutes = (minutesCome - minutesExam);

        double houurExMin = hourExam * 60 + minutesExam;

        double houurComMin = hourCome * 60 + minutesCome;

        double houurLess = Math.abs(houurExMin - houurComMin);

        double houurLessMore = houurLess % 60;

        double hourSout = Math.floor(Math.abs((houurExMin - houurComMin)/60));

        if ((hourExam >= 0 && hourExam <= 23)
                && (minutesExam >= 0 && (minutesExam <= 59)
                && (hourCome >= 0 && hourCome <= 23)
                && (minutesCome >= 0 && minutesCome <= 59))) {

            if (houurExMin >= houurComMin) {
                if (((houurLess) <= 30)&&(houurLess>0)) {
                    System.out.println("On time");
                    System.out.printf("%.0f minutes before the start", houurLess);
                } else if (houurLess == 0) {
                    System.out.println("On time");
                } else if ((houurLess) > 30) {
                    if (houurLess <= 59) {
                        System.out.println("Early");
                        System.out.printf("%.0f minutes before the start", houurLess);
                    } else if (houurLess > 59) {
                        System.out.println("Early");
                        System.out.print(df.format(hourSout));
                        System.out.printf(":%02.0f hours before the start", houurLessMore);
                    }
                }
            } else if (houurExMin < houurComMin) {
                if (houurLess <= 59) {
                    System.out.println("Late ");
                    System.out.printf("%.0f minutes after the start", houurLess);
                } else if (houurLess > 59) {
                    System.out.println("Late");
                    System.out.print(df.format(hourSout));
                    System.out.printf(":%02.0f hours after the start", houurLessMore);
                }
            }
        }


    }

}






