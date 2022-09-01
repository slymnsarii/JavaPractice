package dev_projectRequirements;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {

    static List<String> urunlerList = new ArrayList<>();
    static List<Double> urunFiyatlariList = new ArrayList<>();
    static List<String> sepet = new ArrayList<>();
    static double toplam;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            urunleriListele();
            sepetUrunler();
            String karar = devamMi();
            if (karar.equalsIgnoreCase("F")){
                break;
            }
        }
        odeme(sepet,toplam);



    }

    private static void odeme(List<String> sepet, double toplam) {
        for (int i = 0; i < sepet.size(); i++) {
            System.out.println(sepet.get(i));
        }
        System.out.println("Toplam :" + toplam);
        System.out.println("Lutfen adresinizi giriniz.");
        scan.nextLine();
        String adres = scan.nextLine();
        System.out.println("Odeme menusune hosgeldiniz. Odemenizi nasil yapmayi tercih edersiniz.\n1-)Nakit\n2-)Kredi Karti");
        int secim = scan.nextInt();
        if (secim==1){
            System.out.println("Odeme tamamlandi. Iyi gunler diler, yine bekleriz.");
        }else {
            krediKarti();
        }

    }

    private static void krediKarti() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kredi karti bilgilerinizi giriniz." + "\nKart sahibinin adi : ");
        String isim = scan.nextLine();

        System.out.println("Soyadi : ");
        String soyisim = scan.nextLine();
        String kartNo="";

        for (int i = 0; i < 1; i++) {
            System.out.println("Kart no : ");
            kartNo = scan.next();
            if (kartNo.length()!=16) {
                System.out.println("Hatali giris. Kart numarasi 16 haneli olmalidir.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Son kullanma tarihi ay : ");
            int sktAy = scan.nextInt();
            if (sktAy < 1 || sktAy > 12) {
                System.out.println("Hatali giris. Lutfen gecerli bir ay giriniz.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Son kullanma tarihi yil : "+"\nOrnek=>2024");
            int sktYil = scan.nextInt();
            if (sktYil< LocalDate.now().getYear() || sktYil> 2032) {
                System.out.println("Hatali giris. Lutfen yil bilgisini 4 haneli olacak sekilde giriniz.");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("CVC kodu : ");
            String cvc = scan.next();
            if (cvc.length()!=3){
                System.out.println("Hatali giris. Lutfen 3 haneli CVC kodunuzu giriniz.");
                i--;
            }
        }

        String isimIlkIki = isim.substring(0,2);
        String isimKalan = isim.substring(2).replaceAll("\\w","*");
        String soyisimIlkIki = soyisim.substring(0,2);
        String soyisimKalan = soyisim.substring(2).replaceAll("\\w","*");
        String kartSon4 = kartNo.substring(kartNo.length()-4);

        System.out.println(isimIlkIki+isimKalan+" "+soyisimIlkIki+soyisimKalan+"\n"+"**** **** **** "+kartSon4);
        System.out.println("Siparis basari ile olusturuldu.\n"+
                "Odeme basari ile tamamlandi. Yine bekleriz.");
    }

    private static String devamMi() {
        System.out.println("Alısverise devam etmek istiyor musunuz? T/F");
        String karar = scan.next();
        return karar;
    }

    private static void sepetUrunler() {
        System.out.println("Lutfen satin almak istediginiz urunun numarasini giriniz:");
        int secim = scan.nextInt();
        System.out.println("Kaç kg almak istiyorsunuz?");
        double kg = scan.nextDouble();
        toplam+=urunFiyatlariList.get(secim-1)*kg;
        sepet.add(urunlerList.get(secim-1)+"  "+kg+" KG "+urunFiyatlariList.get(secim-1)+" TL");
        for (int i = 0; i < sepet.size(); i++) {
            System.out.println(sepet.get(i));
        }
 
        System.out.println("Toplam : "+toplam+" TL");
    }


    public static void urunleriListele(){
        String[] urunler = {"Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz ", "Cilek", "Kavun", "Uzum", "Limon"};
        double[] urunlerFiyat = {20.10, 30.20, 30.50, 20.30, 30.10, 50.20, 100.90, 60.10, 40.30, 20.70, 10.50};

        System.out.println("No"+"\t\t"+"Urun"+"\t\t"+"Fiyat"+"\n"+"====  ========   ==========");
        for (int i = 0; i < urunler.length; i++) {
            urunlerList.add(urunler[i]);
            urunFiyatlariList.add(urunlerFiyat[i]);
            System.out.printf("%2s    %-7s    %6.2f TL\n",(i+1),urunlerList.get(i),urunFiyatlariList.get(i));
        }

    }
}
