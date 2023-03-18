package j12_Arrays;

import java.util.Arrays;

public class C04_arrays_equals {
    public static void main(String[] args) {
        //arrays eşitlik kontrolü->equals methodu array elemanlarını hem index
        // hem de value değerlerini kontrol eder, true ya da false return eder.

        int arr1[]={1,2,46,79,80,21,27,44};
        int arr2[]={21,27,46,79,80,2,44,1};

        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        String str= Arrays.toString(arr1);
        System.out.println(str);

    }
}
