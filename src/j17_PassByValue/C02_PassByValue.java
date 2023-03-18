package j17_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden return type METHODlar  create ediniz.

        double fiyat=100;
        System.out.println("method call önceesi fiyat "+fiyat);
        System.out.println("yuzde11Indir(fiyat) = " + yuzde11Indir(fiyat));
        System.out.println(yuzde22Indir(fiyat));
        System.out.println(yuzde33Indir(fiyat));
        System.out.println("method call sonrası fiyat "+fiyat);


    }

    private static double yuzde33Indir(double fiyat) {
        return  fiyat*=0.67;

    }

    private static double yuzde22Indir(double fiyat) {
        return  fiyat*=0.78;
    }

    private static double yuzde11Indir(double fiyat) {
        return  fiyat*=0.89;
    }
}
