package j30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
Task->
Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.next();

        LinkedList<String> list = new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Abdi bey"));
    }

}
