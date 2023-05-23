package j31_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        //map.get(key)->girilen keyê ait value return eder.
        HashMap<String, String> hm = new HashMap<>();//boş hashmap
        hm.put("amazon", "296 euro");
        hm.put("ebay", "null");
        hm.put("saturn", "306 euro");
        hm.put("vatan ", "250 euro");
        hm.put("apple", "320 euro");
        hm.put("teknosa", "360 euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"amazon\") = " + hm.get("amazon"));
        System.out.println("hm.get(\"Amazon\") = " + hm.get("Amazon"));//null



    }
}
