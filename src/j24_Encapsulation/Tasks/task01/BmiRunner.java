package j24_Encapsulation.Tasks.task01;

public class BmiRunner {
    public static void main(String[] args) {
        Bmi person=new Bmi("ahmet", 34,85,1.87);
        System.out.println("person = " + person + " " +person.getStatus());
        Bmi ceren= new Bmi("ceren",34,65,1.71);
        System.out.println("ceren  = " + ceren);
        
    }
}
