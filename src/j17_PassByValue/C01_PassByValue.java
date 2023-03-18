package j17_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

 */
// task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.

        double fiyat=100;
        System.out.println("method call öncesi "+fiyat);//100
        fiyatArtir(fiyat);
        System.out.println("method call sonrası "+fiyat);//100 çünkü java pass by value

    }

    private static void fiyatArtir(double fiyat) {
        fiyat*=1.24;

        System.out.println("artmış fiyat = " + fiyat);

    }
}
