package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
         /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str = scan.nextLine();
        String ters="";

        for (int i = str.length() - 1; i >= 0; i--) {//reverse string sorusuna benziyor task24
             ters += str.charAt(i);
        }
             if(str.equalsIgnoreCase(ters)){
                 System.out.println(    "polindrome");
            }else System.out.println("polindrome değil.");

        }

    }

