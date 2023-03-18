package j08_Loops.Loop02_While.Loop.Tasks;

public class Task04 {
    public static void main(String[] args) {
        /*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
        int sayac=0;

        int i=996;
        while (i<=996 && i>=0){
            System.out.println(i);
            i=i-12;
            sayac++;
        }
        System.out.println("4 ve 6ya bölünebilen kaç sayı: "+ sayac);
    }
}
