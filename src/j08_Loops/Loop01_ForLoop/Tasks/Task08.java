package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("çarpım tablosunu boyutunu giriniz:");
        int boyut= scan.nextInt();
        for (int carpan=1; carpan<=boyut; carpan++){
            for (int carpilan=1; carpilan<=boyut; carpilan++){
                System.out.print((carpan*carpilan)+"\t");

            }
        }

    }
}
