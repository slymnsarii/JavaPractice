package Practice01;

public class Q03_PrimitiveDataTypes {
    public static class PrimitiveDataTypes {
        public static void main(String[] args) {

            /*
             * Primitive data type
                    byte: only takes whole numbers
                    short: only takes whole numbers
                    int(used more often): only takes whole numbers
                    long: only takes whole numbers
                    float: can take decimals (MUST have F or f at the end)
                    double( used more often): can take decimals
                    boolean: true or false boolean expressions
                    char: character within single quote ''
                            also takes number
             * Range: double > float >long > int >short > byte
             */
            //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

            int intMax = Integer.MAX_VALUE;
            int intMin = Integer.MIN_VALUE;

            System.out.println("intMax = " + intMax);
            System.out.println("intMin = " + intMin);

            byte byteMax = Byte.MAX_VALUE;
            byte byteMin = Byte.MIN_VALUE;

            System.out.println("byteMax = " + byteMax);
            System.out.println("byteMin = " + byteMin);

            short shortMin = Short.MIN_VALUE;
            short shortMax = Short.MAX_VALUE;

            System.out.println("shortMin = " + shortMin);
            System.out.println("shortMax = " + shortMax);

            long longMin = Long.MIN_VALUE;
            long longMax = Long.MAX_VALUE;

            System.out.println("longMin = " + longMin);
            System.out.println("longMax = " + longMax);

            double doubleMax = Double.MAX_VALUE;
            double doubleMin = Double.MIN_VALUE;

            System.out.println("doubleMax = " + doubleMax);
            System.out.println("doubleMin = " + doubleMin);

            float floatMax = Float.MAX_VALUE;
            float floatMin = Float.MIN_VALUE;

            System.out.println("floatMax = " + floatMax);
            System.out.println("floatMin = " + floatMin);


            //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
            //Degiskenler icin anlamli isimler kullanip, yazdiralim

            float laptopFiyat=9.586f;
            double kitap=86.90;
            char karakter='&';
            boolean yalancıMi=true;

            System.out.println("laptopFiyat = " + laptopFiyat);
            System.out.println("kitap = " + kitap);
            System.out.println("karakter = " + karakter);
            System.out.println("yalancıMi = " + yalancıMi);

            //Not:alt'a basip mousela satırları seçerek toplu seçme yorum veya bir şeyler ekleme satıra yapilabilir

        }

    }
}
