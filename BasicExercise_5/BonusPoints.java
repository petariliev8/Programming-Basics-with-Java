package JavaBasics.upr8;

        import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double score = Double.parseDouble(scanner.nextLine());
        double bonus = 0.0;

        if (score <= 100) {
            bonus = 5.0;
        } else if (score > 100 && score <= 1000) {
            bonus =  score * 0.20;
        } else if (score > 1000) {
            bonus =  score * 0.10;
        }
        if (score % 10 == 5) {
            bonus = bonus + 2;
        } else if (score % 10 != 5) {
            bonus = bonus;
        }
        if ((score % 2) == 0) {
            bonus = bonus + 1;
        } else if ((score % 2) != 0) {
            bonus = bonus;
        }
        System.out.println(bonus);
        System.out.println(score+bonus);
    }
}



