package Practise08;

import java.util.Scanner;

public class C10_Interview {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir string giriniz : ");
        String input= scan.nextLine();
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi= scan.nextInt();

        System.out.println("ilkSonHarf(input,sayi) = " + ilkSonHarf(input, sayi));


    }

    public static String ilkSonHarf(String input, int sayi) {//parantez icine istedigin adi verebilirsin,
                                                            // sadece asagidaki ile ayni olmali
        String s=input.substring(0,1)+input.substring(input.length()-1);
        String sonuc="";

        for (int i = 1; i <=sayi ; i++) {
            sonuc+=s; //sonuc=sonuc+s;
        }
        return sonuc;
    }
}
