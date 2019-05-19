package JavaBasics.upr10;

import java.util.Scanner;

public class BoatFishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double people = Double.parseDouble(scanner.nextLine());

        double even = people % 2;
        double sprinbB = 3000;
        double summerB = 4200;
        double autumnB = 4200;
        double winterB = 2600;

        if (people <= 6) {
            if (season.equals("Spring")) {
                if (even == 0) {
                    if (money >= (sprinbB - (sprinbB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (sprinbB - (sprinbB * 0.15)))));
                    } else if (money < (sprinbB - (sprinbB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(sprinbB - (sprinbB * 0.15)))));
                    }
                } else if (even != 0) {
                    if (money >= (sprinbB - (sprinbB * 0.1))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (sprinbB - (sprinbB * 0.1)))));
                    } else if (money < (sprinbB - (sprinbB * 0.1))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (sprinbB - (sprinbB * 0.1)))));
                    }

                }
            } else if (season.equals("Summer") ) {
                if (even == 0) {
                    if (money >= (summerB - (summerB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (summerB - (summerB * 0.15)))));
                    } else if (money < (summerB - (summerB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (summerB - (summerB * 0.15)))));
                    }
                } else if (even != 0) {
                    if (money >= (summerB - (summerB * 0.1))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (summerB - (summerB * 0.1)))));
                    } else if (money < (summerB - (summerB * 0.1))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(summerB - (summerB * 0.1)))));
                    }

                }
            } else if (season.equals("Autumn") ) {
                    if (money >= (autumnB - (autumnB * 0.1))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (autumnB - (autumnB * 0.1)))));
                    } else if (money < (autumnB - (autumnB * 0.1))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(autumnB - (autumnB * 0.1)))));
                    }


            }  else if (season.equals("Winter")) {
                if (even == 0) {
                    if (money >= (winterB - (winterB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (winterB - (winterB * 0.15)))));
                    } else if (money < (winterB - (winterB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (winterB - (winterB * 0.15)))));
                    }
                } else if (even != 0) {
                    if (money >= (winterB - (winterB * 0.1))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (winterB - (winterB * 0.1)))));
                    } else if (money < (winterB - (winterB * 0.1))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(winterB - (winterB * 0.1)))));
                    }

                }
            }


        } else if (people > 6 && people <= 11) {
            if (season.equals("Spring")) {
                if (even == 0) {
                    if (money >= (sprinbB - (sprinbB * 0.20))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (sprinbB - (sprinbB * 0.20)))));
                    } else if (money < (sprinbB - (sprinbB * 0.20))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(sprinbB - (sprinbB * 0.20)))));
                    }
                } else if (even != 0) {
                    if (money >= (sprinbB - (sprinbB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (sprinbB - (sprinbB * 0.15)))));
                    } else if (money < (sprinbB - (sprinbB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (sprinbB - (sprinbB * 0.15)))));
                    }

                }
            } else if (season.equals("Summer") ) {
                if (even == 0) {
                    if (money >= (summerB - (summerB * 0.20))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (summerB - (summerB * 0.2)))));
                    } else if (money < (summerB - (summerB * 0.2))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (summerB - (summerB * 0.2)))));
                    }
                } else if (even != 0) {
                    if (money >= (summerB - (summerB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (summerB - (summerB * 0.15)))));
                    } else if (money < (summerB - (summerB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(summerB - (summerB * 0.15)))));
                    }

                }
            } else if (season.equals("Autumn") ) {
                    if (money >= (autumnB - (autumnB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (autumnB - (autumnB * 0.15)))));
                    } else if (money < (autumnB - (autumnB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(autumnB - (autumnB * 0.15)))));
                    }


            }  else if (season.equals("Winter")) {
                if (even == 0) {
                    if (money >= (winterB - (winterB * 0.2))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (winterB - (winterB * 0.2)))));
                    } else if (money < (winterB - (winterB * 0.2))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (winterB - (winterB * 0.2)))));
                    }
                } else if (even != 0) {
                    if (money >= (winterB - (winterB * 0.15))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (winterB - (winterB * 0.15)))));
                    } else if (money < (winterB - (winterB * 0.15))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(winterB - (winterB * 0.15)))));
                    }

                }
            }


        } else if (people > 11) {
            if (season.equals("Spring")) {
                if (even == 0) {
                    if (money >= (sprinbB - (sprinbB * 0.3))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (sprinbB - (sprinbB * 0.3)))));
                    } else if (money < (sprinbB - (sprinbB * 0.3))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(sprinbB - (sprinbB * 0.3)))));
                    }
                } else if (even != 0) {
                    if (money >= (sprinbB - (sprinbB * 0.25))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (sprinbB - (sprinbB * 0.25)))));
                    } else if (money < (sprinbB - (sprinbB * 0.25))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (sprinbB - (sprinbB * 0.25)))));
                    }

                }
            } else if (season.equals("Summer") ) {
                if (even == 0) {
                    if (money >= (summerB - (summerB * 0.3))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (summerB - (summerB * 0.3)))));
                    } else if (money < (summerB - (summerB * 0.3))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (summerB - (summerB * 0.3)))));
                    }
                } else if (even != 0) {
                    if (money >= (summerB - (summerB * 0.25))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (summerB - (summerB * 0.25)))));
                    } else if (money < (summerB - (summerB * 0.25))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(summerB - (summerB * 0.25)))));
                    }

                }
            } else if (season.equals("Autumn") ) {
                    if (money >= (autumnB - (autumnB * 0.25))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (autumnB - (autumnB * 0.25)))));
                    } else if (money < (autumnB - (autumnB * 0.25))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(autumnB - (autumnB * 0.25)))));
                    }


            }  else if (season.equals("Winter")) {
                if (even == 0) {
                    if (money >= (winterB - (winterB * 0.3))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (winterB - (winterB * 0.3)))));
                    } else if (money < (winterB - (winterB * 0.3))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money - (winterB - (winterB * 0.3)))));
                    }
                } else if (even != 0) {
                    if (money >= (winterB - (winterB * 0.25))) {
                        System.out.printf("Yes! You have %.2f leva left.", ((money - (winterB - (winterB * 0.25)))));
                    } else if (money < (winterB - (winterB * 0.25))) {
                        System.out.printf("Not enough money! You need %.2f leva.", Math.abs((money -(winterB - (winterB * 0.25)))));
                    }

                }
            }


        }
    }
}