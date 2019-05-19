package JavaBasics.upr11While;

import java.util.Scanner;

public class glassOfWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());

        int Easy = 50;
        int Medium = 100;
        int Hard = 200;
        int capacity =0;
        String newMl = "";
        int newMLLL = 0;
        int counter = 0;
        int moreWater = 0;

        while (true) {

            newMl = scanner.nextLine();
            if (newMl.equals("Easy")){
                newMLLL = 50;

            } else if(newMl.equals("Medium")) {
                newMLLL = 100;
            } else if (newMl.equals("Hard")) {
                newMLLL = 200;
            }
            counter++;
            capacity += newMLLL;

            if (capacity == volume) {
                System.out.println("The dispenser has been tapped " + counter + " times.");
                break;
            } else if (capacity > volume) {
                moreWater = capacity - volume;
                System.out.println(moreWater + "ml has been spilled.");
                break;

            }

        }

    }

}