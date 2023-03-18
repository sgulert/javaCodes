package j07_StringManipulation;

import java.util.Scanner;

public class Task04 {
    /*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yılın aylarından bir ay giriniz:");
        String str= scan.nextLine();
        switch (str){
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("bu ayda 31 gün vardır.");
                break;
            case "şubat":
                System.out.println("nu ay 28 çeker -dört yılda bir 29-");
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("bu ayda 30 gün vardır.");
                break;

        }
    }
}
