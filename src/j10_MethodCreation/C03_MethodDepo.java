package j10_MethodCreation;

public class C03_MethodDepo {//mian olmayan depo class
    public static void gecmeNotu(int not){
        if (not>85){
            System.out.println("Takdir belgesi aldınız.");
        } else if (not>=70) {
            System.out.println("Teşekkür belgesi aldınız.");
        } else if (not>=50) {
            System.out.println("belgesiz geçtiniz.");
        }else System.out.println("kaldınız.");

    }



}
