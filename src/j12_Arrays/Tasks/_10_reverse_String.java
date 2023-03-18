package j12_Arrays.Tasks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str="Hello World";

        String ters="";
        for (int i = str.length()-1; i >=0; i--) {
            ters+=str.charAt(i);

        }
        System.out.println("stringin tersi = " + ters);



    }
}