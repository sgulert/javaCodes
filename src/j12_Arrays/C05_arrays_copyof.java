package j12_Arrays;

import java.util.Arrays;

public class C05_arrays_copyof {
    public static void main(String[] args) {
        //Array kopyalama => copyOf() methodu, girilen arrayin newlwngthinw kadar ilk elemanını kopyalar
        int arr[]={1,2,46,79,80,21,27,44};

        int arr3[]= Arrays.copyOfRange(arr, arr.length-3,arr.length);
        System.out.println(Arrays.toString(arr3));

        //arrayi belirili bir eleman ile set etme
        Arrays.fill(arr,58);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, arr.length-3, arr.length,63);
        System.out.println(Arrays.toString(arr));

    }

}
