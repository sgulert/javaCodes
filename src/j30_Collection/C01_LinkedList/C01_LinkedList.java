package j30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
         /*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
    Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
 */
        LinkedList <String> ll1=new LinkedList<>(Arrays.asList("patlıcan kebap", "ciğer şiş", "küşleme"));
        System.out.println("ll1 = " + ll1);

        ll1.add("tandır");
        System.out.println("ll1 = " + ll1);

        ll1.addFirst("büryan");
        System.out.println("ll1 = " + ll1);

        LinkedList<String> ll2=new LinkedList<>(Arrays.asList("dondurmalı irmik", "havuç dilim baklava"));
        ll1.addAll(ll2);
        System.out.println("ll1 = " + ll1);

        ll2.addAll(2,ll1);
        System.out.println(ll2);


    }
}
