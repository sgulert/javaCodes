package j31_Map;

import java.util.HashMap;

public class C02_KeySet_Values {
    public static void main(String[] args) {
        //.keySet()
        //.values()

        HashMap<String, String> hm= new HashMap<>();//boş hashmap
        hm.put("amazon","296 euro");
        hm.put("ebay","null");
        hm.put("saturn","306 euro");
        hm.put("vatan ","250 euro");
        hm.put("apple","320 euro");
        hm.put("teknosa","360 euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        // Task-> hm key ve value'larını aynı satırda (satır-satır) print eden code create ediniz(for-each)

        for (String str: hm.keySet()) {
            System.out.print( str+ " ");
        }
        System.out.println();
        for (String str: hm.values()) {
            System.out.print( str+ " ");
        }



    }
}
