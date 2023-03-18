package j08_Loops.Loop01_ForLoop.Tasks;

public class Task27 {
    public static void main(String[] args) {
          /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j);
            }
            System.out.print(i);
        }System.out.println();
    }
}
