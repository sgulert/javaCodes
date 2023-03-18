package j12_Arrays.Tasks;

public class _03_Create_array {
    public static void main(String[] args) {
           /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int sayiArray[]={25,30,30,35,100};

        int sum=0;
        for (int i = 0; i <sayiArray.length ; i++) {
            sum=sum+sayiArray[i];
        }
        System.out.println("sum = " + sum);

    }
}
