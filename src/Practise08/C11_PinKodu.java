package Practise08;

import java.util.Scanner;

public class C11_PinKodu {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="Mehmet.1234";
        int girisHakki=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("*****HOS GELDINIZ*****");

        while (true){
            System.out.print("Pin kodunuzu giriniz : ");
            String girilenPin=scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz..");
                break; // while ici true oldugu icin bu loop'lar surekli calisir break yazmazsan..
            }else {
                System.out.println("yanlis giris yaptiniz..");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : "+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("giris hakkiniz kalmadi..\nbloklandiniz..");
                break;
            }
        }
    }
}
