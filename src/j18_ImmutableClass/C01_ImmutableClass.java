package j18_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1 = "Harika";//ilk değer ataması(initial) yapılmış str1 variable create edildi
        String str2 = "Harika";//str1 ve str2 aynı ilk değer atamaları yapıldığı için String pool(string havuzu) ortak ref atanır

        String str3 = new String("Harika");//ilk değer ataması(initial) yapılmış String obj-> heap memory ref farklı
        String str4 = new String("Harika");//ilk değer ataması(initial) yapılmış String obj-> heap memory ref farklı
        String str5 = str1 + "";

        System.out.println("str1==str2 = " + (str1 == str2));// T
        System.out.println("str1==str3 = " + str1 == str3);// F
        System.out.println("str1.equals(str2) = " + str1.equals(str2));// T
        System.out.println("str3==str4 = " + str3 == str4);// F
        System.out.println("str1==str5 = " + str1 == str5);// F
        System.out.println("str1.equals(str5) = " + str1.equals(str5));// T
        System.out.println("\"haluk\" = " + "haluk");
    }
}
