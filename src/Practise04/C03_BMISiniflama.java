package Practise04;

import java.util.Scanner;

public class C03_BMISiniflama {
    public static void main(String[] args) {
        /*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen boyunuzu(cm) giriniz : ");
        double boy= scan.nextDouble()/100; //boyu metreye ilk etapta donusturduk
        System.out.print("Lutfen kilonuzu(kg) giriniz : ");
        double kilo= scan.nextDouble();
        double BMI=kilo/(boy*boy);

        if (BMI<=20){
            System.out.println("bmi indexiniz "+BMI+" oldukca zayifsiniz");
        }else if (BMI<=25){
            System.out.println("bmi indexiniz "+BMI+" normal sinirlardasiniz");
        }else if (BMI<=30){
            System.out.println("bmi indexiniz "+BMI+" sisman kategorisindesiniz");
        }else {
            System.out.println("bmi indexiniz "+BMI+" obezsiniz");
        }


    }
}
