package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        //task-> girilen bir char karakterden sonragelen 10 karakteri print eden code

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter giriniz:");
        char karakter=scan.next().charAt(0);

        for(int i=1; i<=10; i++) {
            System.out.println((char) (karakter+i));
        }
    }
}
