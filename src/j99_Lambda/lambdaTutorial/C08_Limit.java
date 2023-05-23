package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C08_Limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
        List<String> dinnerMenu=new ArrayList<>(Arrays.asList("güllaç","künefe", "ezogelin", "hatay tava", "dondurmalı irmik","çoban salata"));

        System.out.println("*****task 01*******");
        printMaxChar(dinnerMenu);
        System.out.println("*****task 02*******");
        System.out.println("*****task 03*******");

    }//main sonu
    // Task01-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz.
    public static void  printMaxChar(List<String> dinnerMenu){
        dinnerMenu.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(System.out::println);

        System.out.println("dinnerMenu.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst() = " + dinnerMenu.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
    }

}
