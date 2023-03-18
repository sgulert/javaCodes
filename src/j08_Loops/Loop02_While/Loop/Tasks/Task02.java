package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
          /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("bir sayı daha giriniz:");
        int sayi2=scan.nextInt();
        //for loop;
        for (int i =sayi1; sayi1 < sayi2; sayi1++) {
            System.out.println(i);
            i++;

        }
        //while loop
        while(sayi1< sayi2){
            System.out.println(sayi1);
            sayi1++;
        }
    }
}
