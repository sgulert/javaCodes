package j12_Arrays.Tasks;

public class _05_Create_array {
    public static void main(String[] args) {
         /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.
        int sum=0;
        int sayiArray []= {5,6,8,12,14,19};
        for (int i = 0; i <sayiArray.length ; i++) {
            if (sayiArray[i] % 2 == 0) {
                sum = +sayiArray[i];

            } else if (sayiArray[i]%2==1) {
                sum=-sayiArray[i];











            }
            System.out.println("sum = " + sum);
        }
        System.out.println(sum);

    }
}
