package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Java  output: JaVa
        Scanner scan=new Scanner(System.in);
        System.out.println("bir ifade giriniz:");
        String str= scan.nextLine();

        int kacinciHarf=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)%2==0){
                System.out.println(str.charAt(i));
                i++;
            }else System.out.println();

        }
    }
}
