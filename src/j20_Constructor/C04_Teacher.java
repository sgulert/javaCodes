package j20_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    String brans;
    int id;

    public C04_Teacher() {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.id = id;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;
    }

    int tecrube;
    double maas;
    boolean emekli;

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", id=" + id +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli +
                '}';
    }


}
