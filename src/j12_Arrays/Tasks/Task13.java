package j12_Arrays.Tasks;

public class Task13 {
    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        int arr[] = {34, 89, 12, 984, 66,481, 57,91};

        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 3 == 0) {
                count++;

            }
        }
        System.out.println("count = " + count);

    }
}
