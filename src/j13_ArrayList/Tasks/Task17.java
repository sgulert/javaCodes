package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
        
        tekrarsizElemanListi(list);
    }

    private static void tekrarsizElemanListi(ArrayList<Integer> list) {
        ArrayList<Integer> tekrarsizlist1=new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if (!tekrarsizlist1.contains(list.get(i))) {
                tekrarsizlist1.add(list.get(i));
            }

        }
        System.out.println(tekrarsizlist1);

    }
}
