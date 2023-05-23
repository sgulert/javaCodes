package j31_Map;

import java.util.HashMap;

public class C09_replace {
    public static void main(String[] args) {
        //map.replace-> girilen value değeri ilgili keyde update edilir ama ilk başta old value return edilir.

        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        hm.put("amazon","296 euro");
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.replace(\"amazon\",\"270 euro\") = " + hm.replace("amazon", "270 euro"));
        System.out.println("hm = " + hm);

        System.out.println("hm.replace(\"olmayan key\", \"javvanur\") = " + hm.replace("olmayan key", "javvanur"));
    }
}
