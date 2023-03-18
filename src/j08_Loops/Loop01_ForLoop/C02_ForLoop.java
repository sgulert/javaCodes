package j08_Loops.Loop01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //2 basamaklı tek sayıları yan yana print eden code
        for (int a = 11; a <= 99; a = a + 2) {
            System.out.print(a + " ");
        }
        for (int a = 0; a > 99; a++) {
            System.out.println(a);//condition false, hep yanlış çıkar,kod çalışmaz
        }
        for (int a = 0; a >= 0; a++) {
            //  System.out.println(a);//sonsuz döngü
        }

        //girilen bir sayının 100e kadar 4ün katlarını yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("bir ya da 2 basamaklı bir sayı giriniz:");
        int num = scan.nextInt();

        for (int i = num; i <= 100; i++) {
            if (i% 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
