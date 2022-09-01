package Practice03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("isminiz : ");
        String isim=scan.nextLine();

        System.out.print("memleketiniz : ");
        String memleket=scan.next();

        System.out.print("konumunuz : ");
        String konum= scan.next();

        System.out.print("yasiniz : ");
        int yas= scan.nextInt();

        System.out.print("boyunuz : ");
        double boy= scan.nextDouble();

        System.out.println("yasadiginiz "+konum+"'u seviyor musunuz? true/false");
        boolean sebiyorMu=scan.hasNextBoolean();

        System.out.println("isim = " + isim);;
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("sebiyorMu = " + sebiyorMu);;


    }
}
