package Practice03;

import java.util.Scanner;

public class C08_BMI {
    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz:");
        double kilo= scan.nextDouble();
        System.out.print("Lutfen boyunuzu giriniz:");
        double boy= scan.nextDouble();

        double VKI=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz : "+VKI);
    }
}
