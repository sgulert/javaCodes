package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> dinnerMenu=new ArrayList<>(Arrays.asList("güllaç","künefe", "ezogelin", "hatay tava", "dondurmalı irmik","çoban salata"));

        System.out.println("*****task 01*******");
        kontrol7ve7denAz(dinnerMenu);

        System.out.println("*****task02*********");
        notStartWithW(dinnerMenu);

        System.out.println("*******task03********");
        endsWithX(dinnerMenu);
        System.out.println("kontrolEtXileBiten(dinnerMenu) = " + kontrolEtXileBiten(dinnerMenu));

    }//main sonu
    // Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.
    public static void kontrol7ve7denAz(List<String> dinnerMenu){
        System.out.println("dinnerMenu.stream().anyMatch(t->t.length()<=7) = " + dinnerMenu.stream().anyMatch(t -> t.length() <= 7));

    }

// Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch
    public static void notStartWithW(List<String> dinnerMenu){
        System.out.println("dinnerMenu.stream().noneMatch(t->t.startsWith(\"w\")) = " + dinnerMenu.stream().noneMatch(t -> t.toUpperCase().startsWith("w")));
//uppercase kullandık DİKKAT
    }

// Task03-> List elelmanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->
    public static void endsWithX(List<String> dinnerMenu){
        System.out.println("dinnerMenu.stream().anyMatch(t->t.endsWith(\"x\")) = " + dinnerMenu.stream().anyMatch(t -> t.endsWith("x")));

    }
    public static String kontrolEtXileBiten(List<String> dinnerMenu) {
        return (dinnerMenu.stream().noneMatch(t -> t.endsWith("X")) ? "girdiğiniz şartta yemek yoktur" : "en az bir yemek X ile bitiyor" );
        //TERNARY İLE ÇÖZÜM
    }

}
