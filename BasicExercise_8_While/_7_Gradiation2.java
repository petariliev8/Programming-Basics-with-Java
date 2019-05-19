package JavaBasics.upr11While;

import java.util.Scanner;

public class _7_Gradiation2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double grade = Double.parseDouble(scanner.nextLine());

        int counter = 1;
        double all = 0;
        int torn = 0;

        while (12 >= counter) {
            if (grade>=4) {


                all = all + grade;
                if (counter == 12) {

                    System.out.printf("%s graduated. Average grade: %.2f", name, (all / 12));
                    break;
                }
                grade = Double.parseDouble(scanner.nextLine());

                ++counter;


            } else {
                torn++;
                if (torn<2) {

                       grade = Double.parseDouble(scanner.nextLine());
                } else {
                    System.out.println(name+" has been excluded at "+counter+" grade");
                        break;
                }

            }

        }

    }
}

