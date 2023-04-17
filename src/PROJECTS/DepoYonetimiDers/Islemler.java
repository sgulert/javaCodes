package PROJECTS.DepoYonetimiDers;



import java.util.Scanner;

public class Islemler {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    static Scanner scan = new Scanner(System.in);
    static Depo depo = new Depo(); //depodaki meyhodlari call etmek icin obje create edildi

    public static void girisEkrani(){

        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + G + "   | 1-URUN LISTESI  |            | 2-URUN TANIMLA|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                +Y+ "   ____________________             ____________________    \n"
                +B+ "   | 3-URUN RAFLAMA  |            | 4-URUN GIRIS     |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN CIKIS    |            | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int sec = scan.nextInt();


        switch (sec) {
            case 1:
                urunListesi();
                break;
            case 2:
                urunTanimlama();
                break;
            case 3:
                urunRaflama();
                break;
            case 4:
                urunGiris();
                break;
            case 5:
                urunCikis();
                break;
            case 6:
                cikiss();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                girisEkrani();

        }

    }

    private static void cikiss() {
    }

    private static void urunCikis() {
    }

    private static void urunGiris() {
    }

    private static void urunRaflama() {
        System.out.println("Urununuzun id degerini ve atanacak raf nosunu giriniz");
        int rafAtanacakId = scan.nextInt();

       if (depo.urunList.contains(depo.urunList.get(rafAtanacakId - UrunTanimlama.idAtalk))){
           depo.urunRafTanimla(rafAtanacakId,scan.nextInt());
        }
        girisEkrani();
    }

    private static void urunTanimlama() {
        System.out.print("urun ismi, uretici ve birim degerini giriniz : ");
        depo.urunTanimla(scan.next(), scan.next(), scan.next());
        System.out.println("Depoda yeni urununuz tanimlandi.. urun Id no:"+depo.urunList.get(depo.urunList.size()-1).getUrunId());
        girisEkrani();


    }

    private static void urunListesi() {
        depo.urunList.
                stream().
                forEach(t -> System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10d \n", t.getUrunId(), t.getUrunIsim(),
                        t.getUretici(), t.getUrunMiktar(), t.getMiktarBirimi(), t.getRafNo()));
        girisEkrani();
    }


}
