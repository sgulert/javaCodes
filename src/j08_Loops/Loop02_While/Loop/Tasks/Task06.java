package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
          /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        int i = rnd.nextInt(100);
        System.out.println(i);

        int sayac=0;

        while(i<100){
            System.out.println("Bilgisyarın atadığı tam sayıyı tahmin ediniz:");
            int tahminEdilen = scan.nextInt();
            sayac++;
            if(i==tahminEdilen){
                System.out.println("tahmin edilen sayı eşleşti.");
                break;
            }
    }
        System.out.println(sayac);
}
}
