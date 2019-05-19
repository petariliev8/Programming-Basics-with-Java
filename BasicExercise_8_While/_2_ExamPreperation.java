package JavaBasics.upr11While;

import java.util.Scanner;

public class _2_ExamPreperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrade = Integer.parseInt(scanner.nextLine());
        int counterBadGrads = 0;
        double average = 0;
        String lastName = "";

        double counterTask = 0;


        while (true) {
            String nameTask = scanner.nextLine();
            if (nameTask.equals("Enough")) {
                System.out.printf(("Average score: %.2f%n"), (average / counterTask));
                System.out.printf(("Number of problems: %.0f%n"), counterTask);
                System.out.printf("Last problem: " + lastName);
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                counterBadGrads++;
                if (counterBadGrads == badGrade) {
                    System.out.println("You need a break, " + counterBadGrads + " poor grades.");
                    break;
                }
            }
            lastName = nameTask;
            average += grade;
            counterTask++;
        }


    }
}

