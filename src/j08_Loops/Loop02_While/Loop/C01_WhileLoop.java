package j08_Loops.Loop02_While.Loop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıç, bitiş ve değişim  değerleri bilinen tekrarlarda forloop; adım sayısı ya da değişim değeri
        net bilinmeyen belli bir şarta, duruma bağlı olan tekrarlarda while loop kullanılır.
         */
        //task->3ten 20ye kadar olan tam sayıları print eden kod
        int i=3;
        while(i<=20){
            System.out.println(i);
            i++;
        }
        //task-> 7 kere javaCan print eden code
        int a=0;
        while(a<7){
            System.out.println("javaCan");
            a++;
        }
        //task->  2 basamaklı tek saıları print eden code
        int b=11;
        while(b<=99){
            System.out.println(b);
            b+=2;
        }
        //task->bir basamaklı sayma sayıarını
        int c=1;
        while(c<=9){
            System.out.print(c);
            c++;
        }
        System.out.println();
        //task->  grilen ifadeyi tersten print eden code
        Scanner scan=new Scanner(System.in);
        System.out.println("bir ifade girniz:");
        String str= scan.nextLine();

        int x=str.length();
        while(x>=1){
            System.out.println(str.charAt(x-1));
            x--;
        }


    }
}
