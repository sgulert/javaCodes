package j15_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

           1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
          2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde bugün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı;
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

  */
        //task->verilen iki integer value toplayan method create

        int sayi1=85;
        int sayi2=27;
        int sayi3=11;
        int sayi4=56;

        topla(sayi3,sayi2);
        topla(sayi4,35,sayi2);

        //Task03-> verilen String value'lerin en cok karaktere sahip olanı print METHOD create ediniz..
        System.out.println("   ***   Task03  ***   ");
        enUzuuunString("javaCAN","javaTAR","sefil javacı Haluk");//sefil javacı Haluk
        enUzuuunString("javASLAN","javaTARIH","perfect"," javacı Abdulhamit");// javacı Abdulhamit
        enUzuuunString("Aydın","qa tester Murat");//qa tester Murat

    }//main sonu

    private static void enUzuuunString(String...str) {
        String uzuuuunString="";

        for (String w:str) {
            if (w.length()>uzuuuunString.length()) {//parametre olarak gelen str arrayin herbir string elemanı boyutu enuzundan buyukse
                uzuuuunString=w;
            }
        }
        System.out.println("en uzuuuun kelime : "+uzuuuunString);

    }


    private static void topla(int num1,int num2) {
        System.out.println(+(num1+num2));
    }
    private static void topla(int num1,int num2,int num3) {
        System.out.println(+(num1+num2+num3));
    }



}