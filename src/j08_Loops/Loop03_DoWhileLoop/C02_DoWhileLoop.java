package j08_Loops.Loop03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //girilen sayı 13ten küçük ise ola kazandınız, değilse sayı girişi isteyen code create ediniz
        Scanner scan=new Scanner(System.in);
        int x=0;
        do {
            System.out.println("sayı giriniz");
            x=scan.nextInt();
            x++;
        }while(x>=13);
            System.out.println(" ola kazandınız");
        }
    }

