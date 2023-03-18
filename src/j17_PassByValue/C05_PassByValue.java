package j17_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
         /*
 eger bir method2'a yapılan değişiklik kalıcı olsun istenirse
2 .değişklik  yapılan variable'lar atama tanımlanır.

  */
        double etiketFiyati=100;
        double indirimOrani=30;
        System.out.println("indirim öncesi etiketFiyati = " + etiketFiyati);
        indir(etiketFiyati,indirimOrani);
        etiketFiyati=indir(etiketFiyati,indirimOrani);

        System.out.println("indirim sonrası etiketFiyati = " + etiketFiyati);
    }//main sonu
    public static double indir(double etiketFiyati, double indirimOrani){

        return etiketFiyati=etiketFiyati*((100-indirimOrani)/100);
    }
}
