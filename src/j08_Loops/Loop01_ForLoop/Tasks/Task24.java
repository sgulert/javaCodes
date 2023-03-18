package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        //task-> girilen stringin tersini (reverse string) print eden code
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str= scan.nextLine();

        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
