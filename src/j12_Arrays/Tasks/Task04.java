package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {//çıktı yanlış tekrar bak
        //girilen bir int array elemanlarından ortalamadan büyük olan eleman sayısını print eden code
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanılacak array kaç elemanlı olmalı, giriniz: ");
        int arrayBoyut= scan.nextInt();
        int arr[]=new int[arrayBoyut];

        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println(i+". index array elemanını giriniz:");
            arr[i]=scan.nextInt();
        }
        System.out.println("işte array: " +Arrays.toString(arr));

        int sum=0;
        int count=0;
        double arrOrtalama=sum/arr.length;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if (arr[i]>arrOrtalama){
                count++;
            }
        }
        System.out.println(count);
    }
}
