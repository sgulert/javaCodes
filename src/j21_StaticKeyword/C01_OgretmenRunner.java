package j21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen.okul="Clarusway";
        System.out.println(C01_Ogretmen.okul);
        C01_Ogretmen ogrt1=new C01_Ogretmen("sumeyye", 4);
        System.out.println("ogrt1.isim = " + ogrt1.isim);
        System.out.println("ogrt1.tecrubeYil = " + ogrt1.tecrubeYil);
        ogrt1.evlilikYildonumu();
        C01_Ogretmen.maasHesapla();
        //ogrt1.okul_>obj ile static variable call edilemez1
        C01_Ogretmen.okul= "Kabataş";
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);
    }
}
