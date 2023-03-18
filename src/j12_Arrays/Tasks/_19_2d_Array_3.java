package j12_Arrays.Tasks;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String arr[][]={{"new jersey","atlanta","ohio"} ,
                        {"Pittsburgh" ,"ohio","new york","ohio"} ,
                        {"ohio","new york"}};
        String yeniCity= Arrays.deepToString(arr);
        System.out.println("yeni aray = " + yeniCity.replaceAll("ohio", "Florida"));


    }
}

