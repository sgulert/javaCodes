package j08_Loops.Loop02_While.Loop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //girilen sayıya kadar olan doğal sayıların toplamını bulan create eden code

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz:");
        int sayi=scan.nextInt();

        int sum=0;
        while (sayi>=0){
            sum+=sayi;
            sayi--;
        }
        System.out.println(sum);
        //girilen sayının faktöriyelini print eden code
        System.out.println("bir tamsayı giriniz:");
        int num=scan.nextInt();

        int faktoriyel=1;
        while(num>=1){
            faktoriyel*=num;
            num--;
        }
        System.out.println(faktoriyel);

        //girilen tam sayının rakamları toplamını print eden code
        System.out.println("bir tamsayı giriniz:");
        int num1=scan.nextInt();
        int rakToplami=0;
        while( num1>0){
            rakToplami+=num1%10;
            num1/=10;
        }
        System.out.println("rakamları toplami" + rakToplami);
    }
}
