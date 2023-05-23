package j30_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
ile obj uretilir.
Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
Cons seçimine göre queue obj özelliklieri belirlenir.
FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

 */

        Queue<String> q1=new LinkedList<>(Arrays.asList("javanaz","javatar", "javasu", "javacan"));
        //print
        System.out.println("q1 = " + q1);

        q1.add("javvanur");
        System.out.println("q1 add sonrası = " + q1);

        Queue<String> q2= new PriorityQueue<>(Arrays.asList("biftek","lokum","lüfer"));
        System.out.println("q2 = " + q2);
        q2.add("salata");
        System.out.println("q2 = " + q2);

        System.out.println("q1.element() = " + q1.element());


        /*
   peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
   poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
   element() -> ilk elemanı silmeden return eder.
   remove() -> ilk elemnı siler ve return eder.. :kaldırma

  ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
  poll ise null return eder.


 */
        q1.clear();
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.isEmpty() = " + q1.isEmpty());
        System.out.println("q1.poll() = " + q1.poll());
        //System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1.peek() = " + q1.peek());
    }
}
