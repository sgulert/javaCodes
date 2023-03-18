package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
         /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        int toplam=0;//işleme etki etmeyecek bir konteyner

        for(int i=1; i<=5; i++){//5 sayı istiyoruz, 5 kere döngü
            System.out.println("Enter" +i+ "th number");
            int sayi= scan.nextInt();
            if(sayi<=10 || sayi>=20){
                System.out.println(toplam += sayi);
            }
        }
        System.out.println("girilen sayıların 10 20 arası hariç toplamı="+toplam);


    }
}
