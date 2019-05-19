package JavaBasics.Urok3;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if ((!country.equals("USA") &&
                (!country.equals("England") &&
        (!country.equals("Germany") &&
        (!country.equals("Argentina") &&
        (!country.equals("Mexico") &&
                (!country.equals("Spain")
        ))))))) {
            System.out.println("unknown");

        } else {
            if ((country.equals("USA")) || (country.equals("England"))) {
                System.out.println("English");
            } else if ((country.equals("Mexico")) || (country.equals("Spain")) || (country.equals("Argentina"))) {
                System.out.println("Spanish");
            }

        }
    }
}

