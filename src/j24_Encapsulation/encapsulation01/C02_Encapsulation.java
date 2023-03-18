package j24_Encapsulation.encapsulation01;

public class C02_Encapsulation {//POJO CLASS
    /*
Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
basit bir veri nesnesi olabilirler. POJO'lar, genellikle diğer nesneler veya bileşenlerle
 işbirliği yapmak için kullanılırlar ve bu nedenle veri aktarım nesneleri (DTO) olarak da adlandırılabilirler.
 */
    //fields-->private
    String name="Tuğba Hanım";
    private int id=1001;
    private String mail="t@gmail.com";

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    C02_Encapsulation(){

    }
    public C02_Encapsulation(String name, int id, String mail){
        this.name=name;
        this.id=id;
        this.mail=mail;
    }

}
