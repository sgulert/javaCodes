package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 7 sayının en buyugunu print eden code create ediniz

        Scanner scan = new Scanner (System.in);
        int sayiAdeti=7;
        int i=1;
        int enBuyuk=0;

        while(i<=sayiAdeti){
            System.out.println("sayı giriniz:");
            int x= scan.nextInt();
            sayiAdeti--;
        }
        System.out.println();


    }
}
