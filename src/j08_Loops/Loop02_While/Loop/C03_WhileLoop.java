package j08_Loops.Loop02_While.Loop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //girilen tam sayını pozitif tam bölen sayısını print eden code
        System.out.println("bir tam sayı giriniz:");
        int sayi=scan.nextInt();

        int bolen=1;
        int sayac=0;

        while(bolen<=sayi){
            if(sayi%bolen==0){
                sayac++;
            }
              bolen++;
            }
        System.out.println("girilen tam sayının "+ sayac+ " böleni vardır.");

        }
    }

