package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class groupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTeam = scanner.nextLine();
        int numGames = Integer.parseInt(scanner.nextLine());

        int theirGoals = 0;
        int ourGoals = 0;

        int allgoalsMy = 0;
        int allgoalsTheir = 0;
        int points = 0;
        int allPoints = 0;

        while (numGames>0) {
            ourGoals = Integer.parseInt(scanner.nextLine());
            theirGoals = Integer.parseInt(scanner.nextLine());

            allgoalsMy+=ourGoals;
            allgoalsTheir+=theirGoals;

            if (ourGoals>theirGoals) {
                points=3;
            } else if (ourGoals==theirGoals) {
                points = 1;
            }else if  (ourGoals<theirGoals) {
                points = 0;
            }
            allPoints+=points;

            numGames--;
        }
        if (allgoalsMy>=allgoalsTheir) {
            System.out.println(nameTeam+" has finished the group phase with "+allPoints+" points.");
            System.out.println("Goal difference: "+(allgoalsMy-allgoalsTheir)+".");
        } else {
            System.out.println(nameTeam+" has been eliminated from the group phase.");
            System.out.println("Goal difference: "+(allgoalsMy-allgoalsTheir)+".");
        }

    }
}

