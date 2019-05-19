package JavaBasics.upr11While;

import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine();

        String counter = "";
        int lastSteps = 0;
        int counteRR = 0;
        int krachki = 0;

        if (!steps.equals("Going home")) {

            krachki = Integer.parseInt(steps);
            if (krachki >= 10000)
                System.out.println("Goal reached! Good job!");

            while (krachki < 10000) {
                counter = scanner.nextLine();
                if (!counter.equals("Going home")) {
                    counteRR = Integer.parseInt(counter);
                    krachki += counteRR;

                    if (krachki >= 10000) {
                        System.out.println("Goal reached! Good job!");
                        break;
                    }

                } else {
                    lastSteps = Integer.parseInt(scanner.nextLine());
                    if (((10000 - (lastSteps + krachki)) > 0)) {
                        System.out.println((10000 - (lastSteps + krachki) + " more steps to reach goal."));
                        break;
                    } else {
                        System.out.println("Goal reached! Good job!");
                        break;
                    }
                }
            }
        } else {
            krachki = Integer.parseInt(scanner.nextLine());
            if (krachki >= 10000) {
                System.out.println("Goal reached! Good job!");

            } else {
                System.out.println((10000 - (krachki) + " more steps to reach goal."));

            }
        }
    }

}