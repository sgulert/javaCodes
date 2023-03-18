package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //task->girilen 3 sayının ortalamasını print eden method create ediniz
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("sayı giriniz:");
            toplam+= scan.nextInt();
        }
        System.out.println(ortalama(toplam));
        ortalamaHesapla(toplam);
    }
    public static int ortalama (int sayi){//her variable kendi scopeunda iş yapar
        return sayi/3;
    }
    private static void ortalamaHesapla (int sayi){
        System.out.println("ortalama hesapla: "+sayi / 3);
    }

}
