package JavaBasics.upr11While;

import java.util.Scanner;

public class _8_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  Length = Integer.parseInt(scanner.nextLine());
        int  width  = Integer.parseInt(scanner.nextLine());
        int  height = Integer.parseInt(scanner.nextLine());

        String input = "";
        int numbCarton = 0;
        int volume = Length *width*height;
        int volumeCartons = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("Done")) {
                System.out.println((volume-volumeCartons)+" Cubic meters left.");
                  break;
            } else {
                numbCarton = Integer.parseInt(input);
            }
            volumeCartons += numbCarton;

            if(volume<=volumeCartons){

                System.out.println("No more free space! You need "+(volumeCartons-volume)+" Cubic meters more.");
                  break;
            }
        }

    }
}

