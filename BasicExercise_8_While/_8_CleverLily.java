package JavaBasics.upr11While;

import java.util.Scanner;

public class _8_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrise = Integer.parseInt(scanner.nextLine());

        double even = 0;
        double odd = 0;
        double counter = 0;
        double money = 0;
        double toysMoney = 0;
        double newMoney = 0;


        if (years%2>0) {
            even = Math.floor(years/2);
            odd = even+1;

            while (counter<even){
                counter=counter+1;
                money=money+10;
                newMoney= newMoney+money;
                if (counter>=even) {
                    break;
                }
            }
         toysMoney =odd*toyPrise;
          if (laundry<=(toysMoney+newMoney-even)) {

              System.out.printf("Yes! %.2f",((toysMoney+newMoney-even)-laundry));

          } if (laundry>(toysMoney+newMoney-even)) {

                System.out.printf("No! %.2f",(laundry-(toysMoney+newMoney-even)));

            }


        } if (years%2==0) {
            even = years/2;
            odd = even;

            while (counter<even){

                counter=counter+1;
                money=money+10;
                newMoney= newMoney+money;

                if (counter>=years) {
                    break;

                }

            }
            toysMoney =odd*toyPrise;
            if (laundry<=(toysMoney+newMoney-even)) {

                System.out.printf("Yes! %.2f",((toysMoney+newMoney-even)-laundry));

            } if (laundry>(toysMoney+newMoney-even)) {

                System.out.printf("No! %.2f",(laundry-(toysMoney+newMoney-even)));

            }


        }



    }
}

