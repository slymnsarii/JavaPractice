package Practise04;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*  Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.333333333333333
    */

        Scanner scan=new Scanner(System.in);
        double a,b,c;
        System.out.println("Lutfen a,b,c degerlerini giriniz");
        System.out.print("a=");
        a= scan.nextDouble();
        System.out.print("b=");
        b= scan.nextDouble();
        System.out.print("c=");
        c= scan.nextDouble();

        double sonuc=(a*a-b*b)/(3*c);
        System.out.println("sonuc= "+sonuc);
    }
}
