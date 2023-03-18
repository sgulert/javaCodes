package j07_StringManipulation;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char s=harfDepo.charAt(harfDepo.indexOf('S'));
        char u=harfDepo.charAt(harfDepo.indexOf('U'));
        char m=harfDepo.charAt(harfDepo.indexOf('M'));
        char e=harfDepo.charAt(harfDepo.indexOf('E'));
        char y=harfDepo.charAt(harfDepo.indexOf('Y'));
        char y2=harfDepo.charAt(harfDepo.indexOf('Y'));
        char e2=harfDepo.charAt(harfDepo.indexOf('E'));

        System.out.println(""+s+u+m+e+y+y2+e2);//"" strin mürekkep,stringe çevirdi
    }
}
