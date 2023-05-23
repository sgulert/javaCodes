package j31_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {
        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        hm.put("amazon","296 euro");
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));
        System.out.println("hm.containsValue(\"296 EURO\") = " + hm.containsValue("296 EURO"));


    }
}
