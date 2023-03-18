package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
          /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a=scan.nextInt();

        for(int i=2;i<a; i++){
            if (a%i!=0) {
            }System.out.println(a+" asal sayı");
        }

    }
}
