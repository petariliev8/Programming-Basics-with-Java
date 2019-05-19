package JavaBasics.upr7;

        import java.util.Scanner;

public class ToyShop2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double PriceVacantion = Double.parseDouble(scanner.nextLine());
        int Puzzle = Integer.parseInt(scanner.nextLine());
        int DollsTalking = Integer.parseInt(scanner.nextLine());
        int TeddyBears = Integer.parseInt(scanner.nextLine());
        int Mini = Integer.parseInt(scanner.nextLine());
        int Trucks = Integer.parseInt(scanner.nextLine());

        double Price = ((Puzzle * 2.60 + DollsTalking * 3 + TeddyBears * 4.1 + Mini * 8.2 + Trucks * 2));
        double Price25 = (Price - ((Price * 25) / 100));
        double LastPrice = (Price25 - ((Price25 * 10) / 100));
        double PriceWithOut25 = Price - (Price * 10 / 100);

        if ((PriceVacantion >= 1.00 && PriceVacantion <= 10000.00)
                && (Puzzle >= 0 && Puzzle <= 1000)
                && (DollsTalking >= 0 && DollsTalking <= 1000)
                && (TeddyBears >= 0 && TeddyBears <= 1000)
                && (Mini >= 0 && Mini <= 1000)
                && (Trucks >= 0 && Trucks <= 1000)
                && (((Puzzle + DollsTalking + TeddyBears + Mini + Trucks) >= 50) && (PriceVacantion <= LastPrice))) {

            System.out.printf("Yes! %.2f lv left.", (LastPrice - PriceVacantion));

        } else if ((PriceVacantion >= 1.00 && PriceVacantion <= 10000.00)
                && (Puzzle >= 0 && Puzzle <= 1000)
                && (DollsTalking >= 0 && DollsTalking <= 1000)
                && (TeddyBears >= 0 && TeddyBears <= 1000)
                && (Mini >= 0 && Mini <= 1000)
                && (Trucks >= 0 && Trucks <= 1000)
                && (((Puzzle + DollsTalking + TeddyBears + Mini + Trucks) >= 50) && (PriceVacantion > LastPrice))) {

            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(LastPrice - PriceVacantion));


        }
        if ((PriceVacantion >= 1.00 && PriceVacantion <= 10000.00)
                && (Puzzle >= 0 && Puzzle <= 1000)
                && (DollsTalking >= 0 && DollsTalking <= 1000)
                && (TeddyBears >= 0 && TeddyBears <= 1000)
                && (Mini >= 0 && Mini <= 1000)
                && (Trucks >= 0 && Trucks <= 1000)
                && (((Puzzle + DollsTalking + TeddyBears + Mini + Trucks) < 50) && (PriceVacantion <= LastPrice))) {

            System.out.printf("Yes! %.2f lv left.", Math.abs(PriceWithOut25 - PriceVacantion));


        } else if ((PriceVacantion >= 1.00 && PriceVacantion <= 10000.00)
                && (Puzzle >= 0 && Puzzle <= 1000)
                && (DollsTalking >= 0 && DollsTalking <= 1000)
                && (TeddyBears >= 0 && TeddyBears <= 1000)
                && (Mini >= 0 && Mini <= 1000)
                && (Trucks >= 0 && Trucks <= 1000)
                && (((Puzzle + DollsTalking + TeddyBears + Mini + Trucks) < 50) && (PriceVacantion > LastPrice))) {

            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(PriceWithOut25 - PriceVacantion));


        }

    }
}