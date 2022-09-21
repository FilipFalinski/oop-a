package example;

public class animal {
    private int age;
    private int  weight;
    private String name;
    private String gender;

    public animal(int age, int weight, String name, String gender) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
    }
    public void eat(){
        System.out.println("the animal is eating");
    }

    public void sleep(){
        System.out.println("the animal is sleeping");
    }
}
