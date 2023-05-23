package j30_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
        // Trick run suresi için System.currrentTimeMillis() meth. call ediniz...
        long hsBasla=System.currentTimeMillis();
        HashSet <String> hs= new HashSet<>();
        hs.add("celine");
        hs.add("ahmet");
        hs.add("harika");
        hs.add("sümeyye");
        hs.add("ismail");
        hs.add("murat");
        long hsBitir=System.currentTimeMillis();
        System.out.println("(hsBitir-hsBasla) = " + (hsBitir - hsBasla));

        System.out.println("***************************************");

        long tsBasla=System.currentTimeMillis();
        TreeSet<String> ts=new TreeSet<>();
        ts.add("celine");
        ts.add("ahmet");
        ts.add("harika");
        ts.add("sümeyye");
        ts.add("ismail");
        ts.add("murat");
        long tsBitir=System.currentTimeMillis();
        System.out.println("(tsBitir-tsBasla) = " + (tsBitir - tsBasla));


    }
}
