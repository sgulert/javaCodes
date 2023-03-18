package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin= scan.nextLine();
        System.out.println("hangi harfi saydırmak istiyorsunuz?");
        char harf= scan.next().charAt(0);
        int harfSayisi=0;
        for (int i=0; i<= metin.length()-1; i++){
            if (metin.charAt(i)==harf){
                harfSayisi++;}

        }
        System.out.println(harfSayisi);


    }
}
