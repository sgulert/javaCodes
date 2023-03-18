package j22_Scope;

public class C01_InstanceVariable {  /*                                     INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "yas" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
            byte, short, int, long icin default value 0'dir.
            float, double --> default value 0.0'dir.
            char --> default value 0'dir.
            boolean --> default value false'dur.
            String --> default value "null" dir

*/
    static  String kurs= "Clarusway";
    static String prLanguage;
    int yas=48;
    int tecrube;
    String name;
    boolean developerMi;
    char unvan;
    double boy;

    public static void main(String[] args) {
        System.out.println("kurs = " + kurs);//initialize edişmiş static variable doğrudan call edilebilir.
        System.out.println("prLanguage = " + prLanguage);//edilmemiş de doğrudan call edilebilir

        //non_static_method(); statik bloka non static method doğrudan call edilemez. object ile çağrılabilir
        C01_InstanceVariable obj=new C01_InstanceVariable();
        obj.non_static_method();//doğrudan ancak obje ile non static method, static bloka çağrılabilir.
        System.out.println("obj.developerMi = " + obj.developerMi);
        //non static instance variable static bloka doğrudan call edilemez
        //ancak object ile call edilebilir.
        static_method();


    }//main sonu
    public  void non_static_method(){
        System.out.println("non_static_methoddan selam");
    }
    public static void static_method(){
        System.out.println("static_methoddan selam");
    }

}
