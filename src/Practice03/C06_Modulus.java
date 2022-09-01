package Practice03;

import java.util.Scanner;

public class C06_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 5 basamakli sayi giriniz : ");
        int num= scan.nextInt();

        int ilkIki=num/1000;
        int sonIki=num%100;

        int ilkIkiToplam=(ilkIki/10)+(ilkIki%10);
        int sonIkiToplam=(sonIki/10)+(sonIki%10);

        System.out.println("sayilarin toplami : "+(ilkIkiToplam+sonIkiToplam));
    }
}
