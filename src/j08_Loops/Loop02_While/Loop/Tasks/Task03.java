package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80

        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayi = sc.nextInt();
        int baslangic = 1;
        while (baslangic <= 10) {


            System.out.println(sayi + " x " + baslangic + " = " + (sayi * baslangic));
            baslangic++;
        }
    }
}
