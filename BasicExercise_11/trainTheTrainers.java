package JavaBasics.upr15;

import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double evaluation = 0;
        double allEval = 0;
        int counter = 0;
        double allavarage = 0;
        double avarage =0;

        while (true) {
            String presentation = scanner.nextLine();
            allavarage += avarage;

            if (!presentation.equals("Finish")) {
                counter++;
                avarage = 0;
                allEval=0;
            } else {
                System.out.printf("Student's final assessment is %.2f.",(allavarage/counter));
                break;
            }

            for (int i = 0; i <people ; i++) {
            evaluation = Double.parseDouble(scanner.nextLine());
            allEval +=evaluation;
            }
            avarage = (allEval/people);
            System.out.printf("%s - %.2f.",presentation,avarage);
            System.out.println();
            continue;



        }

    }
}

