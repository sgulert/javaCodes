package j31_Map;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {
         /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etnez
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */
        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        //map.put() -> girilen key value değerini map'e eleman olarak ekler.

        hm.put("amazon","296 euro");
        hm.put(null,"200 euro");
        hm.put(null,"222 euro");//update yaptı eleman ekleme yapmadı
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("apple","350 euro");//update var.
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

    }
}
