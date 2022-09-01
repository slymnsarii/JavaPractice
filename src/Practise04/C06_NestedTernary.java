package Practise04;

public class C06_NestedTernary {
    public static void main(String[] args) {

        /*
      Final notu tanimlayin, Nested Ternary ile cozunuz
      'A'  ->  "Gayet Basarili"
      'B'  ->  "Basarili"
      'C'  ->   "Ha gayret"
      bu notlar disindakilere de Digerleri.. yazdiriniz
 */

        char finalNot='B';
        String result=finalNot=='A' && finalNot=='a'?"Gayet Basarili":finalNot=='B'?"Basarili":finalNot=='C'?"Ha gayret":"Digerleri";
        System.out.println("result = " + result);
    }
}
