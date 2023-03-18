package j22_Scope;

public class C02_StaticVariable {
     /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali
    public static void main(String[] args)
      */

     static  String firmaIsim="Clarusway";
     static int firmaId;
     static boolean firmaIT;

     public static void main(String[] args) {
         System.out.println("firmaIT = " + firmaIT);
         firmaIT=true;//static variable doğrudan  call edilip value atandı---> best practice
         C02_StaticVariable.firmaId=2021;//class name ile static variable call edilip value atandı----> bad practice
         staticMethod();
         C02_StaticVariable obj=new C02_StaticVariable();
         obj.non_staticMethod();

     }//main sonu
    public static void staticMethod(){
        System.out.println("atama öncesi firmaId = " + firmaId);
        firmaId=2023;
        System.out.println("atama sonrası firmaId = " + firmaId);


    }
    public void non_staticMethod(){
        System.out.println("non static blok update öncesi firmaIsim = " + firmaIsim);
         firmaIsim="offer'a en kısa yol clarusway";
        System.out.println("non static blok update sonrasıfirmaIsim = " + firmaIsim);
        staticMethod();//static method non static methoda doğrudan call edilebilir.

    }



}
