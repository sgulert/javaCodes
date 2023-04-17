package PROJECTS.DepoYonetimiDers;

import java.util.ArrayList;

public interface UrunTanimlama {

    int idAtalk = 1001;
    void urunTanimla(String urunIsmi, String ureticiFirma, String birimMiktari);// abstract method tanimlamndi

    void urunRafTanimla(int urunID, int urunRafNo);//abstract method

    ArrayList<Urun> urunListele();
}
