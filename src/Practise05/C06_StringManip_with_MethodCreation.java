package Practise05;

import java.util.Scanner;

public class C06_StringManip_with_MethodCreation {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str= scan.nextLine().toLowerCase();
        xyzVarMi(str);
        System.out.println(xyzVarMi(str));
    }

    public static boolean xyzVarMi(String str) {
        if (str.contains("xyz")){
            return true;
        }else
            return false;
    }
}
