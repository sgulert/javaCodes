package j08_Loops.Loop01_ForLoop.Tasks;

public class Task06 {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
// 1 x 3 = 3
// 1 x 4 = 4
// 1 x 5 = 5
// 1 x 6 = 6
// 1 x 7 = 7
// 1 x 8 = 8
// 1 x 9 = 9
// 1 x 10 = 10
// Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.
        for (int carpan=1; carpan<=10; carpan++){
            for (int carpilan=1; carpilan<=10; carpilan++){
                System.out.println(carpilan+"x"+carpan+"="+(carpan*carpilan));
            }
        }
    }
}
