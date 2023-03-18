package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        	/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz:");
        String str = scan.nextLine();

        int x = 0;

        while (x<str.length()) {
            System.out.print(str.charAt(x)+" ");
            x++;
        }
    }
}
