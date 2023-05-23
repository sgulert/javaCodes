package j29_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("sümeyye","tuna","ahmet"));

        // Task04 -> l1'in her bir  elemanını :-(  for-each loop  ile update edip print code create ediniz..
        System.out.println("   ***   Task04   ***   ");

        for (String s:l1) {
            System.out.println("canim "+ s);
        }

        for (int i = 0; i <l1.size() ; i++) {
            l1.set(i,l1.get(i)+ ":)");
        }
        System.out.println(l1);

        //indexi desteeklemeyen yapılarda (collectionlarda) tekrarlayan aksiyonlar için for each loop uğpdate
        //yapamayabilir. bu durumda java interfaceten tanımlanacak variable ile tekrarlanması
        //gerek  aksiyonlar index olmadan tanımlanabilir.

        System.out.println("****ITERATORS****");
        //Step 1
        Iterator<String> it1=l1.iterator();

        //step2
        while ( it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        System.out.println();

        // Task05 -> l1'inelemanlarını silip print code create ediniz..
        System.out.println("   ***   Task05   ***   ");

        Iterator it2=l1.iterator();

        while (it2.hasNext()){
            it2.next();
            it2.remove();
        }
        System.out.println("l1:" + l1);

        List<String> l2 =new ArrayList<>(Arrays.asList("hello","hallo","hola","ciao"));
        //l2nin elemanlarını :) ile update edip prşnt eden code

        ListIterator<String> it3= l2.listIterator();//STEP1
        while (it3.hasNext()){
            it3.set(it3.next()+ " :)");
        }
        System.out.println("update sonrası l2: "+ l2);




    }
}
