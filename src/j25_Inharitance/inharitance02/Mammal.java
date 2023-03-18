package j25_Inharitance.inharitance02;

public class Mammal extends Hayvancik {
    int m=1; int c=4;

    public Mammal(char y) {
        super(34);
        System.out.println("mammal psiz constructor");
    }
    public Mammal(){
        this('S');
        System.out.println("Mammal pli constructor");
    }
    public void mC(){
        System.out.println("mC Mammal class method call");
    }
    @Override//dipnot
    public void mM(){//ezon method
        System.out.println("mM Mammal class method call");
    }

}
