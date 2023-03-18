package j15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        int arr[] = {31,21,33,44,58,46,2,1,79};
//Task01-> verilen arra elemanlarının toplamını print eden METHOD create ediniz.
        arrTopla(arr);
//Task01-> task01 varargs method ile run ediniz.
        varargsTopla();
    }

    private static void varargsTopla(int...a) {

    }

    private static void arrTopla(int[] arr) {
        int toplam=0;
        for (int a:arr) {
            toplam+=a;

        }
    }
}
