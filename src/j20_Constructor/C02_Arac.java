package j20_Constructor;

public class C02_Arac {
    //fields
    String marka;
    String model;
    double km;
    int motorHacim;
    int yil;
    boolean ikinciEl;
    boolean otomatik;



    public static void main(String[] args) {

        //Task-> fields:marka, model,km, motorhacim,vvites,ikinciel, yıl olan
        // objler create ederek fields print eden code
        C02_Arac obj1=new C02_Arac();
        obj1.marka="Ford";
        obj1.model="focus";
        obj1.yil=2015;
        obj1.km=12000;
        obj1.motorHacim=1600;
        obj1.ikinciEl=true;
        obj1.otomatik=true;

        System.out.println("obj1 = " + obj1);

    }//main sonu
    @Override
    public String toString() {//bu meth obj datalarını stringe convert eder
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", yil=" + yil +
                ", ikinciEl=" + ikinciEl +
                ", otomatik=" + otomatik +
                '}';
    }
}//class sonu

