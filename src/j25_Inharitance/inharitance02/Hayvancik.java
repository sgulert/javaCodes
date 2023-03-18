package j25_Inharitance.inharitance02;

public class Hayvancik {//grandparent -super class
    int a; int m=3;
    Hayvancik(){//psiz constructor
        System.out.println("Hayvancık p'siz constructor'ı çalıştı.");
    }
     Hayvancik(int x){
         System.out.println("Hayvancık p'li constructor çalıştır.");
     }
     public void mA(){
         System.out.println("mA->Haycancık classtan method called.");
     }
    public void mM(){//ezilen method
        System.out.println("mA->Haycancık classtan method called.");
    }


}
