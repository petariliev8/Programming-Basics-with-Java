package JavaBasics.upr7;

        import java.util.Scanner;

public class SameWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String text1 = scanner.nextLine();

        if (text.equalsIgnoreCase(text1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}

