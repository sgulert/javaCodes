package j17_PassByValue;

public class C04_PassByValue {

    static double etiketFiyati;//initialize edilmemiş
    static double indirimOrani;

    public static void main(String[] args) {
           /*
          eger bir method'a yapılan değişiklik kalıcı olsun istenirse
          1.değişklik  yapılan variable'lar static olarak tanımlanır.
           */

        etiketFiyati=100;//initialize edildi.
        indirimOrani=30;//yüzde olarak
        System.out.println("indirim öncesi etiketFiyati = " + etiketFiyati);

        //indir(etiketFiyati,indirimOrani);
        indir();
        indirimOrani=5;
        //indir(etiketFiyati,indirimOrani);
        indir();
        indirimOrani=10;
        //indir(etiketFiyati,indirimOrani);
        indir();

        System.out.println("indirim öncesi etiketFiyati = " + etiketFiyati);


    }//main sonu

    private static void indir() {
        etiketFiyati=etiketFiyati*((100-indirimOrani)/100);
        System.out.println("parametresiz methoda göre  = " + etiketFiyati);
    }

    private static void indir(double etiketFiyati, double indirimOrani) {
        etiketFiyati=etiketFiyati*((100-indirimOrani)/100);
        System.out.println("etiketFiyati = " + etiketFiyati);
    }
}//class sonu
