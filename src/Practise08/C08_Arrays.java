package Practise08;

import java.util.Scanner;

public class C08_Arrays {
    public static void main(String[] args) {

        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
         (//o zaman kullanicidan array in boyutunu alacağız, sonra elemanları almamız lazım
            //sonra bu aldığımız 8 elemanlı array in icerisinde kac tanesi 3 e bölünebiliyor
            //  bütün elemanları kontrol etmek icin for döngüsü lazım
              // sart oldugu icin if gerekli
              // ve kac tane dediği icin count gerekli bu soru icin)
        */

        int arr[]=new int[8];
        Scanner oku=new Scanner(System.in);
        int count=0;
        for (int i = 0; i < arr.length; i++) { // i=1; i<=arr.length yapabilirsin
            System.out.print(i+". index'deki sayiyi giriniz : ");
            arr[i]= oku.nextInt();

            if (arr[i]%3==0){   // istersen ayni for icinde istersen farkli for icinde yapabilirsin
                System.out.println(arr[i]+", 3'e bolunebilir");
                count++;
            }
        }
        System.out.println("3'e bolunebilen sayi : "+count);
    }
}
