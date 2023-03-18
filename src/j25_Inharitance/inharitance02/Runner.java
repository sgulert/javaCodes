package j25_Inharitance.inharitance02;

public class Runner {
    public static void main(String[] args) {
        //data type obj=const
        Kedicik k1=new Kedicik();
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);

        Mammal k2=new Kedicik("pamuk");
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.c = " + k2.c);
        //System.out.println("k2.d = " + k2.d);
        System.out.println("k2.m = " + k2.m);

        Hayvancik k3=new Kedicik("pamuk");
        System.out.println("k3.a = " + k3.a);
        //System.out.println("k3.c = " + k3.c);
        //System.out.println("k3.d = " + k3.d);
        System.out.println("k3.m = " + k3.m);
        System.out.println("**************************************************");

        k1.mA();
        k1.mC();
        k1.mM();

        k2.mA();
        k2.mC();
        k2.mM();

        ////****** i herit edilmiş herhani bir obje ile variable data typeına göre getirilir, method ise constructora göre getirilir.




    }//main sonu
}//runner class sonu
