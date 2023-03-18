package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {//forloopla yapamadım......
        /*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str = scan.nextLine();

        int sum = 0;
        //rakamlar="1234567890";

        System.out.println((str.replaceAll("\\D","").length()));

        }

    }


