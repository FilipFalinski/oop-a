package example;

public class zoo {
    public static void main(String[] args) {

        animal animal1 = new animal(9, 10, "tom", "male");
        bird bird1 = new bird(3, 3, "mary", "female" );
        fish fish1 = new fish(1, 1, "fish1", "male");
        chicken chicken1 = new chicken(5, 5, "tim", "male");
        sparrow sparrow1 = new sparrow(5, 7, "tim", "male" );

       animal1.eat();
       animal1.sleep();
       fish1.swim();
       sparrow1.fly();


    }
}
