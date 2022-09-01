package Practice03;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        /*
    not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */

        int not=45;
        // boolean A=not>=90 && not<=100; boolean ile deneyebilirsin
      //   boolean gecerliNot= not>=0 && not<=100; //gecersiz notlar icin bunu da kullanabilirsin eksi veya 100'den buyuk not icin

        if (not>=90 && not<=100){
            System.out.println("notunuz : A");
        }else if (not<90 && not>=80){
            System.out.println("notunuz : B");
        }else if (not<80 && not>=70){
            System.out.println("notunuz : C");
        }else if (not<70 && not>=60){
            System.out.println("notunuz : D");
        }else {
            System.out.println("notunuz : F");
        }

   /*
        int not = scan.nextInt();

        if (not>100 && not<0) {
            System.out.println("lütfen geçerli bir not giriniz!!");
        } else if (not>=90) {
            System.out.println("Notunuz : A");
        }else if (not>=80) {
            System.out.println("Notunuz : B");
        }else if (not>=70) {
            System.out.println("Notunuz : C");
        }else if (not>=60) {
            System.out.println("Notunuz : D");
        }else{
            System.out.println("Notunuz : F");
            }

     */

    }
    }

