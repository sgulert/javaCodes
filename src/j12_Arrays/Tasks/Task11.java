package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
          /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String yeniArr[] = str.split(" ");
        System.out.println("yeniArr = " + Arrays.toString(yeniArr));

        int dolarToplam = 0;
        int poundToplam = 0;

        for (int i = 0; i < yeniArr.length; i++) {
            if (yeniArr[i].charAt(0) == '$') {
                dolarToplam += Integer.parseInt(yeniArr[i].substring(1));
            } else if (yeniArr[i].charAt(0) == '£') {
                poundToplam += Integer.parseInt(yeniArr[i].substring(1));

            }

        }
        System.out.println("poundToplam = " + poundToplam);
        System.out.println("dolarToplam = " + dolarToplam);


    }
}

