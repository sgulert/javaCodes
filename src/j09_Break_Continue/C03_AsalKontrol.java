package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz:");
        int sayi=scan.nextInt();

        boolean asal=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asal=false;
               break;
            }

        }
        if(asal){
            System.out.println("girilen sayı asal");
        }else System.out.println("girilen sayı asal değil");


    }
}
