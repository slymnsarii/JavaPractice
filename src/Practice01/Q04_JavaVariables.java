package Practice01;

public class Q04_JavaVariables {
    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme

        int yas = 27;
        double boy = 1.81;
        System.out.println("yas : " + yas + "\nboy : " + boy);
        // To copy the variable's value

        int yasim = 27;
        int enesYas = yasim;
        System.out.println("yasim = " + yasim);
        System.out.println("enesYas = " + enesYas);

        // you can declare multiple variables in the same line

        int yil = 2022, ay = 6, gun = 20;
        System.out.println("yil = " + yil);

        // updating a variable

        yil = 2031;
        System.out.println("update yil = " + yil);

        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize(deger vermek) edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x; //declaration
        int y=2000; // initialize -assignment
        x=30; //x'in initialize
        y=1; //update(guncelleme)

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
