package JavaBasics.upr8;

        import java.util.Scanner;

public class ConverterMeaseringUnits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double unit = Double.parseDouble(scanner.nextLine());
        String measer1 = scanner.nextLine();
        String measer2 = scanner.nextLine();

        double first = 0;
        double secund = 0;

        double mm = 1000;
        double sm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;

        if (measer1.equals("mm")) {
            first = 1 / mm;
        } else if (measer1.equals("sm")) {
            first = 1 / sm;
        } else if (measer1.equals("mi")) {
            first = 1 / mi;
        } else if (measer1.equals("in")) {
            first = 1 / in;
        } else if (measer1.equals("km")) {
            first = 1 / km;
        } else if (measer1.equals("ft")) {
            first = 1 / ft;
        } else if (measer1.equals("yd")) {
            first = 1 / yd;
        }
        if (measer2.equals(mm)) {
            secund = 1 / mm;
        } else if (measer2.equals("sm")) {
            secund = 1 / sm;
        } else if (measer2.equals("mi")) {
            secund = 1 / mi;
        } else if (measer2.equals("in")) {
            secund = 1 / in;
        } else if (measer2.equals("km")) {
            secund = 1 / km;
        } else if (measer2.equals("ft")) {
            secund = 1 / ft;
        } else if (measer2.equals("yd")) {
            secund = 1 / yd;

        }
        System.out.printf("%.8f",((unit*first)/secund));



    }

}

