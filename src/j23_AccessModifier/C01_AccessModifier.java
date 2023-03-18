package j23_AccessModifier;

public class C01_AccessModifier {

    /*
         1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
         Diğer class'lardan "private" class memler'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
              "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

              5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
             için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

              6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

     */


    public static void main(String[] args) {

    }//main sonu
}//class sonu
