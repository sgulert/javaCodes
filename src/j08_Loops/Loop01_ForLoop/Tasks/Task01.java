package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/
    Scanner scan=new Scanner(System.in);
        System.out.println("100'den küçük bir tamsayı giriniz:");
    int num=scan.nextInt();

    for (int a=0; a<=num;a++){
        if (a%15==0){
            System.out.println(a+"javaCAN");
        }
        else if (a%3==0 ) {
            System.out.println(a+"java");
        }else if(a%5==0){
            System.out.println(a+"CAN'dır");
        }
    }

    }
}