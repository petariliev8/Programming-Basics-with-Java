package JavaBasics.upr10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class voley {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");
        String year = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double weekends = 48;

        if (year.equals("leap")) {
            double end = ((((((weekends - h) / 4) * 3 + h + ((p / 3) * 2))) / 100) * 15);
            double top = ((((weekends - h) / 4) * 3 + h + ((p / 3) * 2)));
            System.out.println(df.format((Math.floor(top + end))));
        } else if (year.equals("normal")) {
                double top = ((((weekends - h) / 4) * 3 + h + ((p / 3) * 2)));
            System.out.println(df.format(Math.floor(top)));
            }
        }
    }

