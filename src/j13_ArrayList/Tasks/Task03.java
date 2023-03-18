package j13_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,46,44,27,21,79,31,20,58,38,59,33));
        Scanner scan=new Scanner(System.in);
        System.out.println("İstenilen sayı nedir?");
        int sayi= scan.nextInt();

        boolean varMi=false;

        for (int i = 0; i < list.size() ; i++) {//loop elemanlarını tekrar eder
            if (list.get(i)==sayi){
                varMi=true;
                System.out.println("Aradığınız sayı listte mevcut.");
                break;
            }

        }
        if (!varMi){
            System.out.println("Aranılan sayı listte mevcut değil.");
        }



    }
}
