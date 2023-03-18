package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz:");
        int sayi= scan.nextInt();
        int total=0;
        for(int i=0;i<=sayi;i++){
            total+=i*i;
        }
        System.out.println(total);
    }
}
