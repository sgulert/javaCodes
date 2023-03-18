package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
// Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner scan=new Scanner(System.in);

        int girisHakki=3;
        String dogruPin="tuna";

        while (girisHakki>0){
            System.out.println("şifrenizi giriniz:");
            String str= scan.nextLine();
            if(dogruPin.equals(str)){
                System.out.println("giriş yaptınız");
                break;
            }else System.out.println("tekrar deneyiniz");
            girisHakki--;
            if (girisHakki==0){
                System.out.println("giriş hakkınız kalmadı");
            }
        }
















    }
}
