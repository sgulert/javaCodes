package j14_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
for-each loop for loop'un gelilmş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.

 */

        List<Integer> sayiList =new ArrayList<>( List.of(16,21,33,54,15,45,58));

        System.out.println("   ***   Task01   ***   ");
        //task->list elemanlarını ayrı satırda print eden code

        for (int i = 0; i < sayiList.size() ; i++) {
            System.out.println(sayiList.get(i));
        }
        for (Integer yeniListElemanları : sayiList) {//sayılistin her elemanını al yeniliste çak
            System.out.println("yeniListElemanları = " + yeniListElemanları);
        }

        //task2-> listin tek elemanlarını -ilk 3 eleman hariç- print eden code

        for (Integer w: sayiList.subList(3, sayiList.size())){
            if (w%2==1){
                System.out.println("w = " + w);
            }
        }

        //task3-> list elemanlarını 2 ve 5 index dahil toplamını print eden code
        int sum=0;
        for (Integer ii:sayiList.subList(2,6)
             ) {
            sum+=ii;
        }
        System.out.println("sum = " + sum);

    }
}
