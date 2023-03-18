package j20_Constructor;

public class C05_Arac {
    //Fields-> obj'nin uretilirken alacagı değer variables
//bir class'da bir den çok cons tanımlanabilir
 /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    //fields
    String model;
    int maxHiz;

    public C05_Arac() {
        System.out.println("bu yazı okunuyorsa sefil parametresiz constructor call edilmiştir.");

    }

    @Override
    public String toString() {
        return "C05_Arac{" +
                "model='" + model + '\'' +
                ", maxHiz=" + maxHiz +
                '}';
    }

    public C05_Arac(int maxHiz) {
        this("focus", 190);
        this.maxHiz = maxHiz;//pden gelen maxhiz valuesu instance variablea this ile atandı.
        System.out.println("bu yazı okunuyorsa 1 parametreli  constructor call edilmiştir.");
    }

    public C05_Arac(String model, int maxHiz) {//telescopic cobst. //full parametreli
        this.model = model;
        this.maxHiz = maxHiz;
        System.out.println("bu yazı okunuyorsa zengin  constructor call edilmiştir.");
    }

}
