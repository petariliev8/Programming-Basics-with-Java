package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class gameStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        String namePlayer = scanner.nextLine();


        if (minutes==0){
            System.out.println("Match has just began!");
        } else if (minutes<45) {
            System.out.println("First half time.");
        }else if (minutes>44 ) {
            System.out.println("Second half time.");
        }
        if (minutes>0 && minutes<=10) {
            System.out.println(namePlayer + " missed a penalty.");
            if (minutes % 2 == 0) {
                System.out.println(namePlayer + " was injured after the penalty.");
            }
        }else if (minutes>10 && minutes<=35) {
            System.out.println(namePlayer + " received yellow card.");
            if (minutes%2!=0) {
                System.out.println(namePlayer + " got another yellow card.");
            }
        }else if (minutes>35 && minutes<45) {
            System.out.println(namePlayer+" SCORED A GOAL !!!");
        }else if (minutes>45 && minutes<=55) {
            System.out.println(namePlayer + " got a freekick.");
            if (minutes%2==0) {
                System.out.println(namePlayer + " missed the freekick.");
            }
        }else if (minutes>55 && minutes<=80) {
            System.out.println(namePlayer + " missed a shot from corner.");
            if (minutes%2!=0) {
                System.out.println(namePlayer + " has been changed with another player.");
            }
        }else if (minutes>80 && minutes<=90) {
            System.out.println(namePlayer+" SCORED A GOAL FROM PENALTY !!!");
        }

    }
}

