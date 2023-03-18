package j21_StaticKeyword;

public class C02_StaticBlok {
    static String isim="Best mom Sumeyye";
    static {//static blok
        System.out.println("1. satatic blok run edildi.");
        System.out.println("isim = " + isim);
        isim="celine hanım";
        System.out.println("1. blok update sonrası isim = " + isim);
    }
    public static void main(String[] args) {//
        /*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */
        System.out.println( " main method başladı.");
        isim="mustafa bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti.");

    }
    static {//static blok 2
        System.out.println("2. satatic blok run edildi");
        System.out.println("2. static blok update öncesi isim: " +isim);
        isim="ceren patron";
        System.out.println("2. blok updatei sonrası isim = " + isim);

    }

}
