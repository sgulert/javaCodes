package j99_Lambda.lambdaTutorial;

import java.util.*;

public class C06_Distinct {//tekrarsız
    public static void main(String[] args) {
        List<String> dinnerMenu=new ArrayList<>(Arrays.asList("güllaç","künefe", "ezogelin", "güllaç", "güllaç","künefe"));
        tekrarsizPrintEt(dinnerMenu);
        tekrarsizTersSiraliPrint(dinnerMenu);

    }//main sonu
    //task01-> list elemanlarını alfabetik sıra ile büyük harfle tekrarsız print eden code

    public static void tekrarsizPrintEt( List<String> dinnerMenu){
        dinnerMenu.stream().distinct().sorted().map(String::toUpperCase).forEach(System.out::println);

    }
    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.

    public static void tekrarsizTersSiraliPrint(List<String> dinnerMenu){
        dinnerMenu.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}
