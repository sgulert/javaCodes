package j07_StringManipulation;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        System.out.println("bir metin giriniz:");
        String str= scan.nextLine();
        System.out.println("space hariç şu kadar karakter var:"+ str.replaceAll(" ", "").length());
    }
}
