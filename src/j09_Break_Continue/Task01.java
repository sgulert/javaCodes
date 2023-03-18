package j09_Break_Continue;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str = scan.nextLine();
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){
                count++;
                if (str.charAt(i)=='c')
                break;
            }
        }System.out.println("cye kadar a sayısı: "+count);
    }
}
