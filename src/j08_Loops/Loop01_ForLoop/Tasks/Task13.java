package j08_Loops.Loop01_ForLoop.Tasks;

public class Task13 {
    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
        */

        for (char carpan =65 ; carpan<=70; carpan++) {
            for (char carpilan = 65; carpilan <= carpan; carpilan++) {
                System.out.print(carpan);
            } System.out.println();
        }
    }
}
