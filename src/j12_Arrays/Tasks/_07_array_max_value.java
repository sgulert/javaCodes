package j12_Arrays.Tasks;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int arr[]={12,2,5,15,8};
        System.out.println("arraydeki max değer: " + Arrays.stream(arr).max());

        //ya da;
        Arrays.sort(arr);
        System.out.println("arraydeki en büyük değer: "+arr[arr.length-1]);

    }
}