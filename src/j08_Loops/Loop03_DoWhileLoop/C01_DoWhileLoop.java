package j08_Loops.Loop03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
sart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır.
do-While loop->  game app. de daha çok kullanılır.
Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..

 */
        int yas=41;
        while (yas>33){
            System.out.println("güzelyaşlanmanız temennisi ile");
            yas--;
        }

        do {
            System.out.println("güzelsin");
        }while (yas>40);
    }
}
