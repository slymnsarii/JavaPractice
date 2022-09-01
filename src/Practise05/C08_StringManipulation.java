package Practise05;

import java.util.Scanner;

public class C08_StringManipulation {
    public static void main(String[] args) {
        /*
            Kullanicidan bir kelime girmesini isteyin.
            * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
            * kelimenin ortasindaki karakteri yazdirin.
*/

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String str= scan.next();
        char ortancaKrk=str.charAt((str.length()-1)/2);
        if (str.length()%2==1 && str.length()>=3){
            System.out.println(ortancaKrk);
        }
    }
}
