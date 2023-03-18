package j08_Loops.Loop01_ForLoop.Tasks;

public class Task21 {
    public static void main(String[] args) {
         /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0 || i == 7)
                    System.out.print("* ");
                else
                    System.out.print("! ");
            }
            System.out.println();

        }
    }
}

