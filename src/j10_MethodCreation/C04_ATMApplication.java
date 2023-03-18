package j10_MethodCreation;

import java.util.Scanner;

public class C04_ATMApplication {
    static Scanner scan=new Scanner(System.in);
    static int bakiye =1500;

    public static void main(String[] args) {

    /*
    başlangıç bakiyesi :1500
    bakiye sorgu,para çekme, yatırma ve çıkış işlemlerini yapan bir atm app create ediniz.
    */
        System.out.println("HOŞGELDİNİZ");
        System.out.println("Lütfen bakiye sorgulamk için 1'i \nPara çekmek için 2'yi \nPara yatırmak için 3'ü \nÇıkış için 4'ü tuşlayınız.");

        islemTercihi();
    }//main sonu
    public static void islemTercihi (){
        System.out.println("İşleminizi seçiniz:");
        int islemSecimi= scan.nextInt();

        switch(islemSecimi){
            case 1:
                bakiyeSorgula();
            break;
            case 2:
                paraCek();
            break;
            case 3:
                paraYatir();
            break;
            case 4:
                cikis();
            break;
            default:
                System.out.println("Yanlış giriş yaptınız.");
        }



    }

    private static void paraCek() {
        System.out.println("Çekmek istediğiniz miktarı giriniz:");
        int cekilecekMiktar= scan.nextInt();
        bakiye-=cekilecekMiktar;
        System.out.println("Güncel bakiyeniz: " +bakiye);
    }

    private static void paraYatir() {
        System.out.println( "Yatırmak istediğiniz miktarı giriniz:");
        int yatanMiktar= scan.nextInt();
        bakiye+=yatanMiktar;
        System.out.println("güncel bakiyeniz: "+ bakiye);
    }

    private static void cikis() {
        System.out.println("çıkış yaptınız.");
    }

    private static void bakiyeSorgula() {
        System.out.println("güncel bakiyeniz:"+bakiye);
    }


}
