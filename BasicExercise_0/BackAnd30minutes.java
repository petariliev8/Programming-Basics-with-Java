package JavaBasics.Urok3;

import java.util.Scanner;

public class BackAnd30minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

       int Allminutes =  hours*60+minutes+30;
       int NewHours =Allminutes/60;
       double NewMinutes = Allminutes%60;

       if (NewHours>23 && minutes>29) {
           NewHours=0;
       }
        System.out.print(NewHours+":");
        System.out.printf("%02.0f",NewMinutes );



    }
}

