package j07_StringManipulation;

import java.util.Scanner;

public class Task10 {// nested ternary//TEKRAR ÇALIŞ BU KONUYA,ZOR GELDİ
    public static void main(String[] args)         {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz:");

        String isim=scan.nextLine();
        System.out.println(isim.length()==3 ? (isim.charAt(0) !=isim.charAt(1) &&
                isim.charAt(2)!= isim.charAt(0)&&
                isim.charAt(1) != isim.charAt(2))? "harfler farklı OK" : "farklı harf değil":"3 harfli değil");

    }
}
