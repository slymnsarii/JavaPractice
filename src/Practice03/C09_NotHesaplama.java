package Practice03;

import java.util.Scanner;

public class C09_NotHesaplama {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 1.vizenizi giriniz:");
        double vize1= scan.nextDouble();
        System.out.print("Lutfen 2.vizenizi giriniz:");
        double vize2= scan.nextDouble();
        System.out.print("Lutfen finalinizi giriniz:");
        double finalNot= scan.nextDouble();


        double vizeOrtYuzde=((vize1+vize2)/2)*0.3;
        double finalNotYuzde=finalNot*0.7;
        double gecmeNotu=vizeOrtYuzde+finalNotYuzde;
        System.out.println("gecmeNotu = " + gecmeNotu);

    }
}
