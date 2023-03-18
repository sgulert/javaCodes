package j20_Constructor;

public class C03_Student {//class level
    String ad;
    String soyad;
    String sinif;
    int okulNo;
    double ortalama;
    boolean takdirBelgesiAldiMi;

    public static void main(String[] args) {
        /*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */

        C03_Student student1=new C03_Student();

        student1.ad="sumeyye";
        student1.soyad="tuzuner";
        student1.sinif="11-A";
        student1.okulNo=776;
        student1.ortalama=58;
        student1.takdirBelgesiAldiMi=false;

        student1.mezuniyet(student1.ortalama);
        student1.sosyalfaaliyet();


        C03_Student student2=new C03_Student();

        student2.ad="ahmet";
        student2.soyad="tuzuner";
        student2.sinif="11-b";
        student2.okulNo=205;
        student2.ortalama=77;
        student2.takdirBelgesiAldiMi=false;

        student2.mezuniyet(student2.ortalama);
        student2.sosyalfaaliyet();

        System.out.println("student2 = " + student2);
        System.out.println("student1 = " + student1);



    }//main sonu

    private void mezuniyet(double ortalama) {
        if (ortalama>=50){
            System.out.println("mezun olabilirsiniz");
        }else {
            System.out.println("not ortalamanız mezuniyet için yetersiz");
        }
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif='" + sinif + '\'' +
                ", okulNo=" + okulNo +
                ", ortalama=" + ortalama +
                ", takdirBelgesiAldiMi=" + takdirBelgesiAldiMi +
                '}';
    }

    private void sosyalfaaliyet(){
        System.out.println("yaşıyorsun bu hayatı");

    }
}//class sonu
