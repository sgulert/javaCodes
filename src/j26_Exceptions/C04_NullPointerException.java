package j26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //NullPointerException-> null ataması yapılann bir string variable length () math call edildiğinde oluşan RTE
        String str1="";
        System.out.println("str1.length() = " + str1.length());

        String str2=null;
        //System.out.println("str2.length() = " + str2.length());

        try {
            System.out.println("str2.length() = " + str2.length());
            System.out.println("bu satırı okuduysan exceprtion fırlatmadı...");

        }catch (NullPointerException e){
            System.out.println("null'ın boyutu olmazzz...");
        }
        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu satırı okuduysan exceprtion fırlatmadı...");

        }catch (NullPointerException e){
            System.out.println("null'ın boyutu olmazzz...");
        }
        System.out.println("bu kodu okuduysan kod başarılı");


    }
}
