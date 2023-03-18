package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("birinci sayıyı giriniz: ");
        int num1= scan.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        int num2= scan.nextInt();
        esitMi(num1,num2);

    }//main sonu
    public static boolean esitMi(int num1, int num2){
        boolean esit=true;

        if(num1 == num2){
            esit=true;
            System.out.println(esit);
        }else esit=false;
        System.out.println(esit);

        return esit;
    }



}

