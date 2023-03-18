package j14_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        int carpim=1;

        for (int [] i:arr) {
            for (int j:i) {//arr iki boyutlu olduğu için 2 for each kullandık
                carpim*=j;

            }

        }
        System.out.println("carpim = " + carpim);
    }
}
