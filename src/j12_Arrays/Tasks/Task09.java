package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz

        int arr[]={56,178,657,32,51};
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
