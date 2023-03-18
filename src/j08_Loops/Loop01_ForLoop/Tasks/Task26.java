package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task26 {//zeki soru
    public static void main(String[] args) {
        //task->verilen bir tam sayının rakamları toplamını create eden code
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz:");
        int sayi= scan.nextInt();
        int rakamlariToplami=0;

        for (int i=sayi; i>0; i=i/10) {//her tekrarda basamak sayısı bir azalacak.
            rakamlariToplami+=i%10;
        }
        System.out.println(rakamlariToplami);
    }
}
