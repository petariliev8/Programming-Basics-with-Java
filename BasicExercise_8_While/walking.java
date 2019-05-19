package JavaBasics.upr11While;

import java.util.Scanner;

public class walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());

        int Newsteps = 0;
        String counter = "";
        int lastSteps = 0;
        int counteRR = 0;


        while (steps < 10000) {

            counter = scanner.nextLine();
            if (!counter.equals("Going home")) {
                counteRR = Integer.parseInt(counter);


                steps += counteRR;

                if (steps >= 10000) {
                    System.out.println("Goal reached! Good job!");
                    break;
                }

            } else {
                lastSteps = Integer.parseInt(scanner.nextLine());
                if (((10000 - (lastSteps + steps)) >= 0)) {
                    System.out.println((10000 - (lastSteps + steps) + " more steps to reach goal."));
                    break;
                } else {
                    System.out.println("Goal reached! Good job!");
                        break;
                }
            }


        }


    }
}