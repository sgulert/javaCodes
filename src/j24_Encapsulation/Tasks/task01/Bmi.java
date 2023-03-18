package j24_Encapsulation.Tasks.task01;

public class Bmi {//POJO CLASS
    //fields->
    private String name;
    private int age;
    private double weight;
    private double height;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double getBmi(){//parametre girmedik zaten const ile dataları alacağız.
        return (weight/(height*height));
    }
    public String getStatus(){
        if (getBmi()<18.5){
            return "zayıf";
        } else if (getBmi()<25) {
            return "normal";
        } else if (getBmi()<30) {
            return "kilolu";
        }else {
            return "obez ve üstü";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bmi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ' '+getStatus();

    }
}
