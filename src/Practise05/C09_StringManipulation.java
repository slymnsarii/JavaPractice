package Practise05;

import java.util.Scanner;

public class C09_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve
        // hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz :  \nisim");
        String isim = scan.next();
        System.out.println("soyisim");
        String soyisim = scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz, soyisminizden uzun");
        }else if (isim.length()<soyisim.length()){
            System.out.println("soyisminiz, isminizden uzun");
        }else {
            System.out.println("isminiz ve soyisminiz esit uzunlukta");
        }
    }
}
