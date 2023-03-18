package j08_Loops.Loop01_ForLoop.Tasks;

public class Task20 {////////////////////////////////tekrar dene

    public static void main(String[] args){
        //        1
        //        2 6
        //        3 7 10
        //        4 8 11 13
        //        5 9 12 14 15   şekli print eden code create ediniz.

        for(int i1=1;i1<=5;i1++){
            for(int  i2=1; i2<=i1; i2++){
                System.out.print(i1);
            }System.out.println();
        }


    }
}
