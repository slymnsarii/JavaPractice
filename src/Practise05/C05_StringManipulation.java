package Practise05;

import java.util.Scanner;

public class C05_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Cumle olusturmak icin lutfen dort tane kelime girin");
        String input1= scan.next().toLowerCase();
        String input2= scan.next().toLowerCase();
        String input3= scan.next().toLowerCase();
        String input4= scan.next().toLowerCase();

        String cumle=input1.substring(0,1).toUpperCase()+input1.substring(1)+" "+input2+" "+input3+" "+input4+".";
        System.out.println(cumle);
    }
}
