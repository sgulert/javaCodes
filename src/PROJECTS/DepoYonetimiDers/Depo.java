package PROJECTS.DepoYonetimiDers;

import java.util.ArrayList;

import static PROJECTS.DepoYonetimiDers.Islemler.scan;

public class Depo  implements UrunAlis, UrunSatis, UrunTanimlama{

    ArrayList<Urun> urunList = new ArrayList<Urun>();//Urun pojo class'tan create edilecek urun obje depolayan bos arraylist tanimlandi

    @Override
    public void urunSat(int urunId, int satilanUrunMiktari) {
        if (satilanUrunMiktari >= urunList.get(urunId-idAtalk).getUrunMiktar()){
            urunList.get(urunId-idAtalk).setUrunMiktar(urunList.get(urunId-idAtalk).getUrunMiktar()-satilanUrunMiktari );
        } else   {
            System.out.println("Depoda kalan miktar =" + urunList.get(urunId-idAtalk).getUrunMiktar());
            System.out.println("Depomda " + (satilanUrunMiktari - urunList.get(urunId-idAtalk).getUrunMiktar()) +" eksik var");
            System.out.println("Yetersiz urun \n Tekrar deneyiniz -->");
            satilanUrunMiktari = scan.nextInt();
            urunSat(urunId, satilanUrunMiktari);
        }
    }


    @Override
    public void urunTanimla(String urunIsmi, String ureticiFirma, String birimMiktari) {

        urunList.add(new Urun(idAtalk+urunList.size(), urunIsmi,ureticiFirma,birimMiktari)); // //Urun obje create edildi ve urun obje urun liste eklendi
    }

    @Override
    public void urunRafTanimla(int urunId, int urunRafNo) {

        urunList.get(urunId-idAtalk).setRafNo(urunRafNo);

    }


    @Override
    public ArrayList<Urun> urunListele() {
        return urunList;
    }

    @Override
    public void urunGir(int urunId, int girilenYeniMiktar) {
        urunList.get(urunId-idAtalk).setUrunMiktar(girilenYeniMiktar + urunList.get(urunId-idAtalk).getUrunMiktar());
    }
}
