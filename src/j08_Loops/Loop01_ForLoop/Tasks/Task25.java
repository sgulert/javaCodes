package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task25 {/////zor soru!
    public static void main(String[] args) {
        //task->bir strin içindeki tüm karakterleri en fazla 1 kere print eden code
        //String=aabbbbdddfffsss
        //output =abdfs
        Scanner scan = new Scanner(System.in);
        System.out.println("bir String ifade giriniz:");
        String str = scan.nextLine();

        String cikti = "";//işleme etkş etemyecek boş kutu tanımladık.

        for (int i = 0; i <=str.length()-1; i++) {
            if (!cikti.contains(str.substring(i, i + 1))) {//strden ardışık parça strde yoksa(!cikti.contains) şartı
                cikti += str.charAt(i);//kutuda olmayan eleman kutuya eklendi.
            }
        }System.out.println(cikti);
    }}
