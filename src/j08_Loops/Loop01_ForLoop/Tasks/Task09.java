package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir boyut giriniz:");
        int boyut = scan.nextInt();

        for (int carpan = 1; carpan <= boyut; carpan++) {
            for (int carpilan = 1; carpilan <= carpan; carpilan++) {
                System.out.print("*");
            } System.out.println();
        }

    }
}
