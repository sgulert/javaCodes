package j07_StringManipulation;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz:");

        String adSoyad= scan.nextLine();
        int space= adSoyad.indexOf(" ");


        System.out.println(adSoyad.charAt(0) +"." +adSoyad.charAt(space+1)+"."+ adSoyad.charAt(adSoyad.lastIndexOf(" ")+1)+".");

    }
}
