package JavaBasics.upr8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");

        double incom = Double.parseDouble(scanner.nextLine());
        double avarage = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double SocScholarship = minSalary * 0.35;
        double Scholarship = avarage * 25;

        if ((incom >= 0 && incom <= 6000) && (avarage >= 2 && avarage <= 6)
                && (minSalary >= 0 && minSalary <= 1000)) {


            if (incom <= minSalary) {

                if ((avarage >= 4.5) && (avarage < 5.5)) {
                    System.out.printf("You get a Social scholarship ");
                    System.out.println(df.format(Math.floor(SocScholarship)) + " BGN");
                } else if (avarage >= 5.5) {

                    if (Scholarship <= SocScholarship) {
                        System.out.printf("You get a Social scholarship ");
                        System.out.println(df.format(Math.floor(SocScholarship)) + " BGN");
                    } else if (Scholarship > SocScholarship) {
                        System.out.printf("You get a scholarship for excellent results ");
                        System.out.println(df.format(Math.floor(Scholarship)) + " BGN");
                    }

                } else if (avarage < 4.5) {
                    System.out.printf("You cannot get a scholarship!");
                }
            }
            if (incom > minSalary) {
                if (avarage >= 5.5) {
                    System.out.printf("You get a scholarship for excellent results ");
                    System.out.println(df.format(Math.floor(Scholarship)) + " BGN");
                } else if (avarage < 5.5)
                    System.out.printf("You cannot get a scholarship!");
            }
        }

    }
}


