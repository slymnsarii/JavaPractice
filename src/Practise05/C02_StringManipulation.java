package Practise05;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki kelime giriniz");
        System.out.print("string 1: ");
        String str1= scan.next();
        System.out.print("string 2: ");
        String str2= scan.next();

        String str3=str1.concat(" "+str2);
        System.out.println("1.yontem : "+str3);

        String str4=str1+" "+str2;
        System.out.println("2.yontem : "+str4);

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        String str1_0indextenSonrasi=str1.substring(1);
        String str2_0indextenSonrasi=str2.substring(1);

        System.out.println("Manipulation'dan sonraki hali : "+str1_0indextenSonrasi+str2_0indextenSonrasi);
    }
}
