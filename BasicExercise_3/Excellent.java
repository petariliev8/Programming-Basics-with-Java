package JavaBasics.upr7;

        import java.util.Scanner;

public class Excellent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());


        if ((a >= 5.5 )) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent!");
        }
    }
}
