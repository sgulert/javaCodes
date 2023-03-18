package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here
        Scanner scan=new Scanner(System.in);
        int arr[]= new int[4];

        System.out.println("Tek basamaklı sayılardan oluşan 4 elemanlı arrayin ilk elemanını giriniz: ");
        arr[0]= scan.nextInt();
        System.out.println("Tek basamaklı sayılardan oluşan 4 elemanlı arrayin ikinci elemanını giriniz: ");
        arr[1]= scan.nextInt();
        System.out.println("Tek basamaklı sayılardan oluşan 4 elemanlı arrayin üçüncü elemanını giriniz: ");
        arr[2]= scan.nextInt();
        System.out.println("Tek basamaklı sayılardan oluşan 4 elemanlı arrayin dördüncü elemanını giriniz: ");
        arr[3]= scan.nextInt();

        System.out.println("elde edilen array: int arr[]= "+Arrays.toString(arr));

        Arrays.sort(arr);

        boolean flag=false;
        for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length ; j++) {
                    if (arr[j]==4 && arr[i]==1){
                        System.out.println(flag);
                    }
                }

        }



    }
}