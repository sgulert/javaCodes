package j25_Inharitance.inharitance02;

public class Kedicik extends Mammal{
    int c=2; int d=7;
    public Kedicik(){
        super();
        System.out.println( "kedicik'in psiz const'ı çalıştı. ");
    }
    public Kedicik(String str){
        this();//bu classtaki psiz constructor'ı call ettik
        //this("a")-->recursive constructor o yüzden cte verir.
        System.out.println(super.c);
        System.out.println("kedicil'in pli constructorı çalıştı.");
    }
    @Override
    public void mC(){
        System.out.println("mC Kedicik class method");
    }

    @Override
    public String toString() {
        return "Kedicik{" +
                "c=" + c +
                ", d=" + d +
                '}';
    }
}
