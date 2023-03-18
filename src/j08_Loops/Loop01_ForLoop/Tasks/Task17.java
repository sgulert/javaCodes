package j08_Loops.Loop01_ForLoop.Tasks;

public class Task17 {
    public static void main(String[] args) {
         /*
        task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

         */
        for (int i = 0; i <= 100; i++) {
            if (i%20==0){
                System.out.println(i +"sayısı hem 4e hem 5e bölünebilir.");
            }
        }System.out.println();
    }
}
