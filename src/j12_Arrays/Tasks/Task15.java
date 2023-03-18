package j12_Arrays.Tasks;

public class Task15 {
    public static void main(String[] args) {
        //arr tüm elemanlarının çarpımı
        int arr3[][] = {
                {3, 5},//0. kat
                {2, 4, 1},//1. kat
                {6, 1, 2, 2},//2. kat
        };

        int çarpım = 1;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                çarpım *= arr3[i][j];

            }
        }
        System.out.println("çarpım = " + çarpım);
    }
}
