package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
         /* TASK :
Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
toplamını bulan code create ediniz.
 */
        Scanner scan=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();

        System.out.println("list için sayı giriniz, listi tamamlamak için 'q' giriniz.");
        String listNums="";

        while (!listNums.equalsIgnoreCase("q")){
            System.out.println("list oluşturmak için bir sayı giriniz:");
            listNums=scan.nextLine();
            list.add(listNums);
        }

        list.remove(list.size()-1);
        System.out.println("girilen sayıların listi: "+list);




        int toplam=0;
        for (int i = 0; i < list.size();  i++) {
            toplam+= Integer.parseInt(list.get(i)) * Integer.parseInt(list.get(i));

        }
        System.out.println("listteki sayıları kareleri toplamı: " +toplam);

        //for each ile yapsaydıkkk

        for (String i:list) {
            toplam+=Integer.parseInt(i)* Integer.parseInt(i);

        }
        System.out.println("toplam = " + toplam);

    }
}
