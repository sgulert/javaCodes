package j31_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        //map.size();->Girilen  map'in entry(giris: eleman) sayısını return eder.
        //map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .
       //map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.

        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        hm.put("amazon","296 euro");
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();
        System.out.println("hm clear sonrası = " + hm);
        System.out.println("hm.size() clear sonrası = " + hm.size());
        System.out.println("hm.isEmpty() clear sonrası = " + hm.isEmpty());

    }
}
