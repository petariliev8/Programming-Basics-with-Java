package JavaBasics.upr10;

import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        double numberF = Double.valueOf(scanner.nextLine());
        double money = Double.valueOf(scanner.nextLine());

        double rose = 5;
        double dalia = 3.8;
        double lale = 2.8;
        double narcis = 3;
        double gladiola = 2.5;

        double roza10 = money - ((numberF * rose) - (((numberF * rose) / 100) * 10));
        double rozaM = money - (numberF * rose);
        double dalia10 = money - ((numberF * dalia) - (((numberF * dalia) / 100) * 15));
        double daliaM = money - (numberF * dalia);
        double lale10 = money - ((numberF * lale) - (((numberF * lale) / 100) * 15));
        double laleM = money - (numberF * lale);
        double narcis10 = money - ((numberF * narcis) + (((numberF * narcis) / 100) * 15));
        double narcisM = money - (numberF * narcis);
        double gladiola10 = money - ((numberF * gladiola) + (((numberF * gladiola) / 100) * 20));
        double gladiolaM = money - (numberF * gladiola);

        if ((numberF >= 10 && numberF <= 1000) && (money >= 50 && money <= 2500)) {

            if (flowers.equals("Roses")) {
                if (numberF > 80) {
                    if ((roza10) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Roses and ", numberF);
                        System.out.printf("%.2f leva left.", ( roza10));
                    } else if (roza10 < 0) {
                        System.out.printf("Not enough money, you need %.0f leva more.", Math.abs( roza10));
                    }
                } else if (numberF <= 80) {
                    if (rozaM >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Roses and ", numberF);
                        System.out.printf("%.2f leva left.", (rozaM));
                    } else if (rozaM < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs( rozaM));
                    }
                }
            } else if (flowers.equals("Dahlias")) {
                if (numberF > 90) {
                    if ((dalia10) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Dahlias and ", numberF);
                        System.out.printf("%.2f leva left.", (dalia10));
                    } else if (dalia10 < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(dalia10));
                    }
                } else if (numberF <= 90) {
                    if ((daliaM) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Dahlias and ", numberF);
                        System.out.printf("%.2f leva left.", (daliaM));
                    } else if (daliaM < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(daliaM));
                    }
                }
            } else if (flowers.equals("Tulips")) {
                if (numberF > 80) {
                    if ((lale10) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Tulips and ", numberF);
                        System.out.printf("%.2f leva left.", (lale10));
                    } else if (lale10 < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs( lale10));
                    }
                } else if (numberF <= 80) {
                    if ((laleM) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Tulips and ", numberF);
                        System.out.printf("%.2f leva left.", (laleM));
                    } else if (laleM < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(laleM));
                    }
                }


            } else if (flowers.equals("Narcissus")) {
                if (numberF >= 120) {
                    if ((narcisM) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Narcissus and ", numberF);
                        System.out.printf("%.2f leva left.", ( narcisM));
                    } else if (narcisM < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(narcisM));
                    }
                } else if (numberF < 120) {
                    if ((narcis10) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Narcissus and ", numberF);
                        System.out.printf("%.2f leva left.", ( narcis10));
                    } else if (narcis10 < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs( narcis10));
                    }
                }

            } else if (flowers.equals("Gladiolus")) {
                if (numberF >= 80) {
                    if ((gladiolaM) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Gladiolus and ", numberF);
                        System.out.printf("%.2f leva left.", ( gladiolaM));
                    } else if (gladiolaM < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(gladiolaM));
                    }
                } else if (numberF < 80) {
                    if ((gladiola10) >= 0) {
                        System.out.printf("Hey, you have a great garden with %.0f Gladiolus and ", numberF);
                        System.out.printf("%.2f leva left.", ( gladiola10));
                    } else if (gladiola10 < 0) {
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(gladiola10));
                    }
                }
            }

        }
    }
}