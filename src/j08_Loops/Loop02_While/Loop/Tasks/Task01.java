package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen sayıların toplamı 333ü geçtiğinde  girilen sayı adetini ve toplamını print eden code
        Scanner scan=new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        while(toplam<333){
            System.out.println("bir sayı giriniz:");
            toplam+= scan.nextInt();
            sayac++;
        }
        System.out.println("sayı adeti:"+ sayac+ " girilen sayı toplamı: "+toplam);

    }
}
