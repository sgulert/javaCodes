package j12_Arrays.Tasks;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String strArr[] = {"Hello World"};
        String yeniStr= Arrays.toString(strArr);


        System.out.println(yeniStr.replace("o", "K"));


    }
}