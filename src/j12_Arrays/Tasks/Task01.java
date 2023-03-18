package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task->girilen bir int array elemanlrını büyükten küçüğe print eden code
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanılacak array kaç elemanlı olmalı, giriniz: ");
        int arrayBoyut= scan.nextInt();
        int arr[]=new int[arrayBoyut];

        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println(i+". index array elemanını giriniz:");
            arr[i]=scan.nextInt();
        }
        System.out.println("işte array: " +Arrays.toString(arr));

        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);

        }


    }
}
