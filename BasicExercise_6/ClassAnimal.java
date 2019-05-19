package JavaBasics.upr9;

import java.util.Scanner;

public class ClassAnimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Animal = scanner.nextLine();

        switch (Animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}

