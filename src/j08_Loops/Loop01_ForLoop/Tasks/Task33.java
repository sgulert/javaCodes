package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {

//mükemmel sayı

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = input.nextInt();
        int x= 0;
        for (int i = 1; i<=sayi/2; i++)
        {
            if (sayi % i == 0)
            {
                x+=i;
            }
        }
        if (x==sayi)
            System.out.println("Mükemmel Sayi");
        else
            System.out.println("Mükemmel Sayi degil");
    }

    }

