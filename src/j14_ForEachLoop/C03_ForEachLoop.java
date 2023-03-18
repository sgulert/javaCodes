package j14_ForEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};

        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str1.equalsIgnoreCase(str2)) {
                    System.out.println(str1 + " is a common element");
                }
            }
        }




    }
}