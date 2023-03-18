package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir boyut giriniz:");
        int boyut=scan.nextInt();

        for(int carpan=1; carpan<=boyut; carpan++) {
            for (int carpilan = 1; carpilan <= boyut; carpilan++) {
                if (carpan == carpilan) {
                    System.out.print(1);
                } else if (carpan!=carpilan) {
                    System.out.print(0);
                }
            }System.out.println();
        }
        System.out.println();

    }
}
