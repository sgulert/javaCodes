package j31_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        //map.putAll;-> girilen map istenen map'e eklenir.

        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        hm.put("amazon","296 euro");
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

        HashMap<String, String> hm1= new HashMap<>();

        hm1.put("javatar", "sümeyye");
        hm1.put("javanaz", "vedat");
        hm1.put("javacan", "abdi");
        hm1.put("javvanur", "mustafa");
        hm1.put("javasu", "rukiye");

        hm.putAll(hm1);
        System.out.println("hm = " + hm);

        HashMap<String, String> hm2=hm1;//hm1 hm3e atandı
        HashMap<String, String> hm3=new HashMap<>(hm2); //hm2 hm3 için const parametresi yapıldı.

        System.out.println("hm2 = " + hm2);
        System.out.println("hm3 = " + hm3);


    }
}
