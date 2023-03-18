package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //girilen int array elemanlarının toplamını
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanılacak array kaç elemanlı olmalı, giriniz: ");
        int arrayBoyut= scan.nextInt();
        int arr[]=new int[arrayBoyut];

        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println(i+". index array elemanını giriniz:");
            arr[i]=scan.nextInt();
        }
        System.out.println("işte array: " + Arrays.toString(arr));
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }System.out.println("sum = " + sum);



    }
}
