package JavaBasics.upr17exarciseExams;

import java.util.Scanner;

public class weddingPresents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  people = Double.parseDouble(scanner.nextLine());
        double  gifts = Double.parseDouble(scanner.nextLine());
        double count = gifts;
        int money =0;
        int electric =0;
        int vaucher =0;
        int another =0;
        double procent2 = ((100/people)*gifts);
        double procent = 100/gifts;
        double noGiftProc =0;
        double moneyPro =0;
        double elPro =0;
        double vauPro =0;
        double anothPro =0;

        while (count>0) {
            String category = scanner.nextLine();
            if (category.equals("A")) {
                money++;
            } else if ( category.equals("B")) {
                electric++;
            }else if ( category.equals("V")) {
                vaucher++;
            }else if ( category.equals("G")) {
                another++;
            }


            count--;
        }
    noGiftProc = procent*(gifts);
        moneyPro=procent*money;
        elPro=electric*procent;
        vauPro = procent*vaucher;
        anothPro = procent*another;

        System.out.printf("%.2f%%%n",moneyPro);
        System.out.printf("%.2f%%%n",elPro);
        System.out.printf("%.2f%%%n",vauPro);
        System.out.printf("%.2f%%%n",anothPro);
        System.out.printf("%.2f%%",procent2);
    }
}

