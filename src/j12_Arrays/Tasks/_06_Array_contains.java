package j12_Arrays.Tasks;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String arrFruits[]={"Apple" , "Orange" , "Banana" , "Pineapple"};
        boolean flag=false;

        for (int i = 0; i < arrFruits.length ; i++) {
            if (arrFruits[i].equals("Apple"));{
                flag = true;
                System.out.println(flag);
                break;
            }
        }


    }
}