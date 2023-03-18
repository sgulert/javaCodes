package j26_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException-> arraylerde olmayan index elemanı ile işlem yapıldığında oluşan rte
        int sayi[] = {33,58,31,44,2,63,21};
        //System.out.println("sayi[12] = " + sayi[12]);

        try {
            System.out.println("sayi[11] = " + sayi[11]);
            System.out.println("bu satırı okuduysan exception yok.");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+ " ---> öyle bir indexte eleman yok.");
        }
        System.out.println("gayet başarılı devamm");
    }
}
