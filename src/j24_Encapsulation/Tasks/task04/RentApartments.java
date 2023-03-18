package j24_Encapsulation.Tasks.task04;

public class RentApartments {//outher class level
    private String name;
    private int roomCount;
    boolean balconyOrNo;
    private int rent;

    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public int roomCountforRent(){
        if (roomCount==0)
            this.rent=1400;
        else if (roomCount==1) {
            this.rent=1700;
        } else if (roomCount==2) {
            this.rent=2200;
        } else if (roomCount==3) {
            this.rent=2700;
        }
        return this.rent+balconyOrNo();

    }
    public int balconyOrNo(){
        if(balconyOrNo==true)
            return 200;
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return "RentApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +"\n"+ "rent: "+
                roomCountforRent();

    }
}//outher sonu
class RunnerRentApartments{
    public static void main(String[] args) {
        RentApartments obj1=new RentApartments("murat bey",2,true);
        System.out.println("obj1 = " + obj1);

    }//main sonu

}//inner class sonu
