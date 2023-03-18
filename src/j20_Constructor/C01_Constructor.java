package j20_Constructor;

public class C01_Constructor {//class başlangıcı->class level

    //fields-> objeden alınabilecek variable'lar
    String str;//class levelda create edilen initialize edilmemiş instance (obj variable) variable
    String hello="hello honey";//initialize edilmiş instance variable

    public static void main(String[] args) {//main level
        /*
1- consturctor ismi Calss name ile aynı olmalı.Cons name Buyuk harf ile başlamalı
2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
5-Class tanımlandığında java default cons. kendi create eder.
6-Fields-> obj'nin uretilirken alacagı değer variables
7-bir class'da bir den çok cons. tanımlanabilir
 */
        //ClassName objName=new constructor-> obje oluşturma
        C01_Constructor obj = new C01_Constructor();//p'siz default constructorile obj create edildi.
        //not= ayno scope içinde 1den fazla aynı isimli obj tanımlanmaz. ya isim değiştirilir, ya da başka scope içinde create edilir
        //class level daki variable mizin degeri degismeden duruyor
        //baska bir obje tanimladigimizda ilk tanimlanan deger ile kullanilabilir

        C01_Constructor obj2=new C01_Constructor();
        C01_Constructor obj3=new C01_Constructor();

        obj.hello="hellö javaCAN"; //obj il instance variable call edilerek yeni atama yapıldı.
        obj2.hello="have a good day";
        System.out.println("obj3.hello = " + obj3.hello);
        System.out.println("obj.hello = " + obj.hello);
        System.out.println("obj2.hello = " + obj2.hello);
        System.out.println("obj.str = " + obj.str);
        //hello: class leveldaki variableı obje olmadan call edemiyoruz
        //selamSoyle()->non-static methodlar object olmadan call edilemez, hata verir.
        obj.selamSoyle();
        obj2.selamSoyle();

    }//main sonu

    private void selamSoyle() {//statici sildik, non static oldu
        System.out.println("benden ona bolca selam söyle");
    }


}//class sonu
