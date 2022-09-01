package FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
 /*
     TASK :
      ***yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      ***filmin index nosuna göre sectiriniz
      ***seçilen filmin  ismini filmin harf sayısının 2 katı kadar hak tanıyarak tahmin etmesini
      ***sağlayan method create ediniz...
      **Ahanda TRICK...
      *** kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      *** kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      *** kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      *** kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      *** kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
     */
        System.out.print(filmler.size() + " tane filmden birini sayisini giriniz :");
        int tahminIndex = scan.nextInt() - 1;     // film sayisi ile index sayisi arasındaki fark için -1 kullandık
        scan.nextLine(); // hata verirse bunu yazip duzebilir
        filmTahmin(tahminIndex);
    }

    public static void filmTahmin(int tahminIndex) {
        int filmUzunlugu = filmler.get(tahminIndex).length();
        System.out.println("Filmin harf sayısı : " + filmUzunlugu);
        System.out.println("Tahmin sayiniz : " + (filmUzunlugu * 2));
        String tahmin = "";
        int control = 0;
        for (int i = 0; i < filmUzunlugu * 2; i++) {
            System.out.print((i + 1) + ". tahmininizi giriniz :");
            tahmin = scan.nextLine();
            for (int j = 0; j < filmler.size(); j++) {
                if (tahmin.equalsIgnoreCase(filmler.get(j))) {     //
                    System.out.println("Tahmininiz dogru tebrikler ");
                    control = 1;
                }
            }
            if (control == 1) {
                break;
            } else {
                if ((filmUzunlugu * 2 - i - 1) == 0) {
                    System.out.println("Filmin adi : " + filmler.get(tahminIndex) + " olacaktı");
                    break;
                }
                System.out.println((filmUzunlugu * 2 - i - 1) + " tahmininiz kaldı");
            }
        }
    }
}