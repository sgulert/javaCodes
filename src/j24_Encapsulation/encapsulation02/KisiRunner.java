package j24_Encapsulation.encapsulation02;

public class KisiRunner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("sümeyye","tüzüner","selamcınıms",-27);
        System.out.println("obj1.getAd() = " + obj1.getAd());
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());
        System.out.println("obj1.getYas() = " + obj1.getYas());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        obj1.setAd("tuna");
        obj1.setSoyad("tüzüner");
        obj1.setYas(-2);
        System.out.println("obj1.getYas() = " + obj1.getYas());


    }
}
