package j08_Loops.Loop01_ForLoop.Tasks;

public class Task11 {
    public static void main(String[] args) {
        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */
        for (char carpan =65 ; carpan<=70; carpan++) {
            for (char carpilan = 65; carpilan <= carpan; carpilan++) {
                System.out.print(carpilan);
            } System.out.println();
        }


    }
}
