package Practise04;

import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {

        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
        int birlerBas=sayi%10, onlarBas=(sayi/10)%10, yuzlerBas=sayi/100;

        if (sayi>99 && sayi<1000){
            switch (yuzlerBas){
                case 0: System.out.print(""); break;
                case 1: System.out.print("yuz"); break;
                case 2: System.out.print("iki yuz\t"); break;
                case 3: System.out.print("uc yuz \t"); break;
                case 4: System.out.print("dort yuz \t"); break;
                case 5: System.out.print("bes yuz \t"); break;
                case 6: System.out.print("alti yuz \t"); break;
                case 7: System.out.print("yedi yuz \t"); break;
                case 8: System.out.print("sekiz yuz \t"); break;
                case 9: System.out.print("dokuz yuz \t"); break;
            }
            switch (onlarBas){
                case 0: System.out.print(""); break;
                case 1: System.out.print("on"); break;
                case 2: System.out.print("yirmi\t"); break;
                case 3: System.out.print("otuz\t"); break;
                case 4: System.out.print("kırk\t"); break;
                case 5: System.out.print("elli\t"); break;
                case 6: System.out.print("altmıs\t"); break;
                case 7: System.out.print("yetmis\t"); break;
                case 8: System.out.print("seksen\t"); break;
                case 9: System.out.print("doksan\t"); break;
            }
            switch (birlerBas){
                case 0: System.out.println(""); break;
                case 1: System.out.println("bir"); break;
                case 2: System.out.println("iki\t"); break;
                case 3: System.out.println("uc\t"); break;
                case 4: System.out.println("dort\t"); break;
                case 5: System.out.println("bes\t"); break;
                case 6: System.out.println("alti\t"); break;
                case 7: System.out.println("yedi\t"); break;
                case 8: System.out.println("sekiz\t"); break;
                case 9: System.out.println("dokuz\t"); break;
            }
        }else {
            System.out.println("3 basamakli sayi giriniz");
        }
    }
}
