package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
    public static void main(String[] args) {
        /*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

    */

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        System.out.println("   task01   ");
        printMaxCiftElemaninKaresi(sayiList);

        System.out.println("   task02   ");
        printListElemanlarininToplami(sayiList);

        System.out.println("   task03   ");
        printCiftElamanlarCarpimi(sayiList);

        System.out.println("   task04   ");
        printMinElaman(sayiList);
    }
    //task01-> list çift elemanlarının karelerinin en büyüğünü print eden code create ediniz.
    public  static  void printMaxCiftElemaninKaresi(List<Integer> sayiList){
        System.out.println("sayiList\n                .stream()\n                .filter(C01_LambdaExpression:: isEven)\n                .map(t->Math.pow(t,2))\n                .reduce(Math::max) = " + sayiList
                .stream()
                .filter(C01_LambdaExpression::isEven)
                .map(t -> Math.pow(t, 2))
                .reduce(Math::max));
    }

    public  static  void printListElemanlarininToplami(List<Integer> sayiList){
        System.out.println("sayiList.stream().reduce(Math::addExact) = " + sayiList.stream().reduce(Math::addExact));

        Optional<Integer> listToplami=sayiList//2. yol //değer atadık
                .stream()
                .reduce(Math::addExact);
        System.out.println("listToplami = " + listToplami);

        System.out.println( sayiList//3. yol ->Integer classı ile çalışmak
                .stream()
                .reduce(Integer::sum));//spesifik class daha hızı çalışır.

        sayiList
                .stream()
                .reduce(0,(a,b)->(a+b));

        /*
        a : ilk değerini her zaman atanan identity değerden alır.
        b: değerini her zaman stream()'den alır.
        a: ilk değerden sonraki değerini action body'den alır.
         */

    }
    //task03-> listin çift elemanlarının çarpımını print eden code

    public static void printCiftElamanlarCarpimi(List<Integer> sayiList){
        System.out.println( sayiList
                .stream()
                .filter(C01_LambdaExpression::isEven)
                .reduce(1, (t, u) -> t * u));
    }
    //Task04-> list elemanlarının en küçüğünü  print code 4 farklı create ediniz.
    public static void printMinElaman(List<Integer> sayiList){
        System.out.println("sayiList.stream().reduce(Math::min) = " + sayiList.stream().reduce(Math::min));
        System.out.println("sayiList.stream().reduce(Integer::min) = " + sayiList.stream().reduce(Integer::min));
        System.out.println("sayiList.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b)) = " + sayiList.stream().reduce(Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));


    }

}
