package j07_StringManipulation;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //girilen stringin son karakterini silen code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");

        String str= scan.nextLine();
        System.out.println(str.substring(0, str.length()-1));
    }
}
