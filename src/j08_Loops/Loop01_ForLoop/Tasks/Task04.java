package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //girilen 2 sayı arasındaki çift sayıları print eden code
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int num1 = scan.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        int num2=scan.nextInt();

        if(num1<num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    //System.out.println(i);
                }
            }
        } else if (num2<num1) {
            for (int i = num2; i >= num1; i++){
                if (i % 2 == 0) {
                    //System.out.println(i);
                }
            }
        }
        ///CEVAPPPPP

        for(int i=(num1<num2?num1:num2); i<=(num1>num2?num1:num2); i++){
            System.out.println(i%2==0?i+" ":" ");
        }

    }
}
