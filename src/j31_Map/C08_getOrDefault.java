package j31_Map;

import java.util.HashMap;

public class C08_getOrDefault {
    public static void main(String[] args) {
        //map.getOrDefault-> girilen key mapte varsa key'e ait value yoksa default değer return eder.

        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        hm.put("amazon","296 euro");
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.getOrDefault(\"javaydın\") = " + hm.getOrDefault("amazon", "6666"));
        System.out.println("hm = " + hm);
    }
}
