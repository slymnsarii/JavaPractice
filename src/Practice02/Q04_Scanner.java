package Practice02;

import java.util.Scanner;

public class Q04_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 tam sayi alin
        Bu tam sayilari toplayin ve sonucunu yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int toplam;
        toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
}
