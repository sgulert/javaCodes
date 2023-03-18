package j12_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
         int arr3[][]={
               {3,5},//0. kat
               {12,13,15},//1. kat
                {103,107,111,121},//2. kat
                }; //array elamanları toplamını print eden code create ediniz

        int toplam=0;

        for (int i = 0; i <arr3.length; i++) {
            for (int j = 0; j <arr3[i].length ; j++) {
                toplam+=arr3[i][j];

            }

        }
        System.out.println("toplam = " + toplam);





    }

}
