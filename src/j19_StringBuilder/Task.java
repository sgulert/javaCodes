package j19_StringBuilder;

public class Task {
    public static void main(String[] args) {
         /*
  Task->
   Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
   olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) METHOD create ediniz.
(without case sensitivity)
Eg : input : javaCAN'lara selam olsun :)
Output: "Reversed sentence : ): nuslo males aral'NACavaj
   It is not a palindrome"
   */
        StringBuilder sb = new StringBuilder("hellö canım ben geldim.");
        reverseEt(sb);
        String str="ece";

        System.out.println("isPolindrome(str) = " + isPolindrome(sb));


    }

    private static boolean isPolindrome(StringBuilder sb) {
        return new StringBuilder(sb).
                reverse().
                toString().
                equals(sb);
    }

    private static void reverseEt(StringBuilder sb) {
        System.out.println(sb.reverse());

    }
}