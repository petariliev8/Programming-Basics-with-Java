package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int goal = 0;
        int max = Integer.MIN_VALUE;
        int saveMax = 0;
        String nameBest = "";


        while (true){
            name = scanner.nextLine();
            if (name.equals("END")) {
                if (max>2) {
                    System.out.printf("%s is the best player!%n",nameBest);
                    System.out.println("He has scored "+max+" goals and made a hat-trick !!!");
                    break;
                } else {
                    System.out.printf("%s is the best player!%n",nameBest);
                    System.out.println("He has scored "+max+" goals.");
                    break;
                }

            }
            goal = Integer.parseInt(scanner.nextLine());

             if (goal > max) {
                 max = goal;
                 nameBest=name;
             }
            if ( goal>=10) {
                System.out.println(nameBest+" is the best player!");
                System.out.println("He has scored "+goal+" goals and made a hat-trick !!!");
                break;
            }

        }

    }
}

