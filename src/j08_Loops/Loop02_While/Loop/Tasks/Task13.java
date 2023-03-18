package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        String str="";

        do {
            System.out.println("javaCAN");
            System.out.println("bir karakter giriniz:");
            str= scan.nextLine();

        }while(!str.equalsIgnoreCase("x"));
        System.out.println("javaTAR");
    }
}
