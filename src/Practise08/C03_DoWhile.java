package Practise08;

import java.util.Scanner;

public class C03_DoWhile {
    public static void main(String[] args) {
        /*
           Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
           ve x girildiğinde ise "Program bitti" yazan programı yazınız.
           */

        Scanner abc=new Scanner(System.in);
        String okunan="";


        do {
            System.out.print("harf giriniz : ");
             okunan=abc.next();
            System.out.println("Program çalışıyor");
        }while (!okunan.equalsIgnoreCase("x")); // esit oldugu an duracak, o yuzden ! koyduk basina dongu devam etsin diye

        System.out.println("Program bitti");
    }
}
