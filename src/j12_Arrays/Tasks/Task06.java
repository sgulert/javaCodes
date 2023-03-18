package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]={34,89,12,984,66};

        sirala(arr);



    }

    private static void sirala(int[] arr) {
        Arrays.sort(arr);
        System.out.println("yeni array = " + Arrays.toString(arr));
        return;

    }
}
