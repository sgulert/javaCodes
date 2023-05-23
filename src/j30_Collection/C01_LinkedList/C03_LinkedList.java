package j30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("patlıcan kebap", "ciğer şiş", "küşleme", "tandır"));
        System.out.println("ll1 = " + ll1);

        ll1.remove();
        System.out.println("ll1.remove() = " + ll1);

        System.out.println("ll1.element() = " + ll1.element());

        System.out.println("ll1.get(2) = " + ll1.get(2));

        LinkedList <Integer> sayiList=new LinkedList<>(Arrays.asList(1,3,5,6,7,45,58,33));
        System.out.println("sayıList = " + sayiList);

        System.out.println("sayıList.remove(4) = " + sayiList.remove(4));//4. indexteki eleaman silindi, elemanın kellesini verdi bize.
        System.out.println("sayıList = " + sayiList);




    }
}
