package j08_Loops.Loop02_While.Loop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str= scan.nextLine();
        int countRakam=0;
        int countHarf=0;
        int countOzelKarakter=0;
        
        int i=0;

        do {
            if (str.length()==0){
                System.out.println("yanlış giriş yaptınız tekrar giriniz:");
            } else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                countHarf++;
            } else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                countRakam++;
            }else
                countOzelKarakter++;
            i++;
        }while (i<str.length());
        System.out.println("girilen metinde "+countRakam +"tane rakam, "+countHarf+ "tane harf, "+ countOzelKarakter+ "tane özel karakter vardır.");
    }
}
